import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AnalisadorSemantico {

    private final HashMap<String, String> variaveis = new HashMap<>();
    private final Map<String, HashMap<String, Object>> objetos = new HashMap<>();
    private LinkedHashMap<String, Object> atributos = new LinkedHashMap<>();

    public String verificaTipo(ParseTree t){
        String tipo = t.getClass().getSimpleName().replace("Context", "");
        switch (tipo) {
            case "Valor" -> {
                String valor = t.getText();
                if (typeOf(valor).equals("inteiro")) {
                    if (valor.length() > 10) {
                        System.err.println("Constante " + valor + "muito grande");
                        return "erro";
                    }
                }
                return typeOf(t.getText());
            }
            case "Variavel" -> {
                String nomeVar = t.getChild(0).getText();
                if (variaveis.containsKey(nomeVar)) {
                    if(variaveis.get(nomeVar) == null){
                        return "var";
                    } else {
                        return variaveis.get(nomeVar);
                    }
                } else if(objetos.containsKey(nomeVar)){
                    return "object";
                } else {
                    System.err.println("Variavel " + nomeVar + " não foi declarada");
                    return "erro";
                }
            }
            case "Op" -> {
                String op = t.getChild(1).getText();
                String tipoOpEsq = verificaTipo(t.getChild(0));
                String tipoOpDir = verificaTipo(t.getChild(2));
                if (tipoOpEsq.equals("inteiro") && tipoOpDir.equals("inteiro")) {
                    return "inteiro";
                } else if (tipoOpEsq.equals("double") && tipoOpDir.equals("inteiro") ||
                        tipoOpEsq.equals("inteiro") && tipoOpDir.equals("double") ||
                        tipoOpEsq.equals("double") && tipoOpDir.equals("double") &&
                                !op.equals("==") && !op.equals("!=")) {
                    return "double";
                } else if (tipoOpEsq.equals("booleano") && tipoOpDir.equals("booleano") &&
                        (op.equals("==") || op.equals("!=") || op.equals("&&") || op.equals("||"))) {
                    return "booleano";
                } else if (tipoOpEsq.equals("string") && tipoOpDir.equals("string") && op.equals("+")) {
                    return "string";
                } else if(tipoOpEsq.equals("var") || tipoOpDir.equals("var")){
                    return "var";
                } else {
                    System.err.println("Tipos " + tipoOpEsq + " e " + tipoOpDir + " são incompatíveis");
                    return "erro";
                }
            }
            case "Grupo" -> {
                return verificaTipo(t.getChild(1));
            }
            case "Atributo" -> {
                String nomeObj = t.getChild(0).getText();
                String atributo = t.getChild(2).getText();
                if (!objetos.containsKey(nomeObj)) {
                    System.err.println("Objeto " + nomeObj + " não foi declarado");
                    return "erro";
                } else if (!objetos.get(nomeObj).containsKey(atributo)) {
                    System.err.println("Atributo " + atributo + " não existe");
                    return "erro";
                } else {
                    return (String)objetos.get(nomeObj).get(atributo);
                }
            }
            case "ValorFuncao", "Constante" -> {
                return verificaTipo(t.getChild(0));
            }
            case "Funcao" -> {
                String nomeObj = t.getChild(0).getText();
                String nomeFunc = t.getChild(2).getText();
                if (!objetos.containsKey(nomeObj)) {
                    System.err.println("Objeto " + nomeObj + " não foi declarado");
                    return "erro";
                } else if (!objetos.get(nomeObj).containsKey(nomeFunc)) {
                    System.err.println("Função " + nomeFunc + " não existe");
                    return "erro";
                } else {
                    return "function";
                }
            }
            default -> {
                System.err.println("Não sei analisar");
                return "erro";
            }
        }
    }

    public boolean analise (ParseTree t){
        String tipo = t.getClass().getSimpleName().replace("Context", "");
        switch (tipo){
            case "Start" -> {
                for (int c = 0; c < t.getChildCount() - 1; c++) {
                    if(!analise(t.getChild(c))){
                        return false;
                    }
                }
                return true;
            }
            case "DecObj" -> {
                String nomeObj = t.getChild(1).getText();
                if(objetos.containsKey(nomeObj)){
                    System.err.println("Objeto " + nomeObj + " já foi declarado");
                    return false;
                }
                for (int c = 4; c < t.getChildCount() - 1; c += 2) {
                    if(!analise(t.getChild(c))) {
                        return false;
                    }
                }
                objetos.put(nomeObj, atributos);
                atributos = new LinkedHashMap<>();
                return true;
            }
            case "ModificaCriaAtributo" -> {
                String nomeObj = t.getChild(0).getText();
                String tipoAtrib = verificaTipo(t.getChild(4));
                String atributo = t.getChild(2).getText();
                if (!objetos.containsKey(nomeObj)) {
                    System.err.println("Objeto " + nomeObj + " não foi declarado");
                    return false;
                }else {
                    objetos.get(nomeObj).put(atributo, tipoAtrib);
                    return !tipoAtrib.equals("erro");
                }

            }
            case "ModificaCriaFuncao" -> {
                String nomeObj = t.getChild(0).getText();
                String nomeFunc = t.getChild(2).getText();
                if (!objetos.containsKey(nomeObj)) {
                    System.err.println("Objeto " + nomeObj + " não foi declarado");
                    return false;
                }
                int c = 2;
                while (c < t.getChildCount() - 4) {
                    variaveis.put(t.getChild(c).getText(), null);
                    c += 2;
                }
                c = t.getChildCount() - 2;
                objetos.get(nomeObj).put(nomeFunc, "function");
                return analise(t.getChild(c));
            }
            case "ChamarFuncao"-> {
                return analise(t.getChild(0));
            }
            case "DecVar" -> {
                String nomeVar = t.getChild(1).getText();
                String tipoVar = verificaTipo(t.getChild(3));
                if(variaveis.containsKey(nomeVar)){
                    System.err.println("Variavel " + nomeVar + " já foi declarada");
                    return false;
                } else {
                    if(tipoVar.equals("erro")){
                        return false;
                    } else {
                        variaveis.put(nomeVar, tipoVar);
                        return true;
                    }

                }
            }
            case "Print" -> {
                return !verificaTipo(t.getChild(2)).equals("erro");
            }
            case "AtribVariavel" -> {
                String nomeVar = t.getChild(0).getText();
                String tipoVar = verificaTipo(t.getChild(2));
                if(!variaveis.containsKey(nomeVar)){
                    System.err.println("Variavel " + nomeVar + " não foi declarada");
                    return false;
                } else return !tipoVar.equals("erro");
            }
            case "While" -> {
                String tipoCondicao = verificaTipo(t.getChild(2));
                if(!tipoCondicao.equals("booleano") && !tipoCondicao.equals("var")){
                    System.err.println("Condição não é uma expressão booleana");
                    return false;
                } else {
                    return analise(t.getChild(5));
                }
            }
            case "If" -> {
                String tipoCondicao = verificaTipo(t.getChild(2));
                if(!tipoCondicao.equals("booleano")) {
                    System.err.println("Condição não é uma expressão booleana");
                    return false;
                } else {
                    ParseTree BlocoIf = t.getChild(5);
                    ParseTree BlocoElse = t.getChild(9);
                    if (BlocoElse != null){
                        return analise(BlocoIf) && analise(BlocoElse);
                    } else {
                        return analise(BlocoIf);
                    }
                }
            }
            case "CriarAtributo" -> {
                String atributo = t.getChild(0).getText();
                String tipoAtrib = verificaTipo(t.getChild(2));
                if(atributos.containsKey(atributo)) {
                    System.err.println("Atributo " + atributo + " já existente no objeto");
                    return false;
                } else {
                    if(tipoAtrib.equals("erro")){
                        return false;
                    } else{
                        atributos.put(atributo, tipoAtrib);
                        return true;
                    }
                }
            }
            case "CriarFuncao" -> {
                String nomeFunc = t.getChild(0).getText();
                if(atributos.containsKey(nomeFunc)) {
                    System.err.println("Atributo " + nomeFunc + " já existente no objeto");
                    return false;
                }
                int c = 2;
                while (c < t.getChildCount() - 4) {
                    variaveis.put(t.getChild(c).getText(), null);
                    c += 2;
                }
                c = t.getChildCount() - 2;
                atributos.put(nomeFunc, "function");
                return analise(t.getChild(c));
            }
            case "Bloco" -> {
                ParseTree retorno = t.getChild(2);
                if(retorno != null){
                    if(verificaTipo(retorno).equals("erro")){
                        return false;
                    }
                }
                return analise(t.getChild(0));
            }

            case "Seq" -> {
                for (int c = 0; c < t.getChildCount(); c++) {
                    if(!analise(t.getChild(c))){
                        return false;
                    }
                }
                return true;
            }
            case "Funcao" -> {
                String nomeObj = t.getChild(0).getText();
                String nomeFunc = t.getChild(2).getText();
                if (!objetos.containsKey(nomeObj)) {
                    System.err.println("Objeto " + nomeObj + " não foi declarado");
                    return false;
                } else if (!objetos.get(nomeObj).containsKey(nomeFunc)) {
                    System.err.println("Função " + nomeFunc + " não existe");
                    return false;
                } else {
                    for (int c = 4; c < t.getChildCount() - 1; c += 2) {
                        if(verificaTipo(t.getChild(c)).equals("erro")){
                            return false;
                        }
                    }
                    return true;
                }
            }

            default -> {
                System.err.println("Não sei analisar");
                return false;
            }
        }
    }

    private String typeOf(String valor) {
        if(isInteger(valor)) {
            return "inteiro";
        } else if (isDouble(valor)) {
            return "double";
        } else if (valor.equals("false") || valor.equals("true")) {
            return "booleano";
        } else {
            return "string";
        }
    }

    private boolean isInteger(String number) {
        try {
            int result = Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    private boolean isDouble (String number) {
        try {
            double result = Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }



}
