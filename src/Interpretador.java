import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class Interpretador {
    private final Map<String, HashMap<String, Object>> objetos = new HashMap<>();
    private HashMap<String, Object> atributosObjs = new HashMap<>();
    private final HashMap<String, Object> variaveis = new HashMap<>();

    public Object interpretar (ParseTree t){
        String tipo = t.getClass().getSimpleName().replace("Context", "");
        switch (tipo){

            case "Start": {
                for (int c = 0; c < t.getChildCount() - 1; c++) {
                    interpretar(t.getChild(c));
                }
                return null;
            }
            case "DecObj": {
                String nomeObj = t.getChild(1).getText();
                for(int c = 4; c < t.getChildCount() - 1; c += 2) {
                    interpretar(t.getChild(c));
                }
                objetos.put(nomeObj, atributosObjs);
                atributosObjs = new HashMap<>();
                return null;
            }

            case "ModificaCriaAtributo": {
                String nomeObj = t.getChild(0).getText();
                if (objetos.containsKey(nomeObj)){
                    String atributo = t.getChild(2).getText();
                    Object valor = interpretar(t.getChild(4));
                    objetos.get(nomeObj).put(atributo, valor);

                } else {
                    throw new RuntimeException("Objeto " + nomeObj + " Não declarado");
                }
                return null;
            }

            case "ModificaCriaFuncao": {
                String nomeObj = t.getChild(0).getText();
                if (objetos.containsKey(nomeObj)) {
                    String nomeFunc = t.getChild(2).getText();
                    ArrayList<String> argumentos = new ArrayList<>();
                    int c = 6;
                    while (c < t.getChildCount() - 4) {
                        argumentos.add(t.getChild(c).getText());
                        c += 2;
                    }
                    c = t.getChildCount() - 2;
                    objetos.get(nomeObj).put(nomeFunc, argumentos);
                    variaveis.put(nomeFunc, t.getChild(c));
                } else {
                    throw new RuntimeException("Objeto " + nomeObj + " Não declarado");
                }
                return null;
            }

            case "DecVar": {
                String nomeVar = t.getChild(1).getText();
                Object var = interpretar(t.getChild(3));
                variaveis.put(nomeVar, var);
                return null;
            }

            case "Print": {
                String nomeVar = t.getChild(2).getText();
                if(objetos.containsKey(nomeVar)){
                    System.out.print("{");
                    objetos.get(nomeVar).entrySet().forEach(entry -> {
                        System.out.print(" " + entry.getKey() + ":" + " " + entry.getValue() + ",");
                    });
                    System.out.println(" }");
                } else {
                    System.out.println(interpretar(t.getChild(2)).toString());
                }
                return null;
            }

            case "AtribVariavel": {
                String nomeVar = t.getChild(0).getText();
                if(!variaveis.containsKey(nomeVar)){
                throw new RuntimeException("Variável" + nomeVar + " não declarada");
                } else {
                    Object valor = interpretar(t.getChild(2));
                    variaveis.put(nomeVar, valor);
                }
                return null;
            }

            case "While": {
                ParseTree condicao = t.getChild(2);
                ParseTree repeticao = t.getChild(5);
                if(!interpretar(condicao).getClass().getSimpleName().equals("Boolean")){
                    throw new RuntimeException("Condição não é uma expressão booleana");
                } else {
                    while ((Boolean) interpretar(condicao)){
                        interpretar(repeticao);
                    }
                }
                return null;
            }

            case "If": {
                ParseTree condicao = t.getChild(2);
                ParseTree BlocoIf = t.getChild(5);
                ParseTree BlocoElse = t.getChild(9);
                if(!interpretar(condicao).getClass().getSimpleName().equals("Boolean")) {
                    throw new RuntimeException("Condição não é uma expressão booleana");
                } else {
                    if((Boolean) interpretar(condicao)){
                        interpretar(BlocoIf);
                    } else {
                        if(BlocoElse != null){
                            interpretar(BlocoElse);
                        }
                    }
                }
                return null;
            }

            case "CriarAtributo": {
                String atributo = t.getChild(0).getText();
                Object valor = interpretar(t.getChild(2));
                atributosObjs.put(atributo, valor);
                return null;
            }

            case "CriarFuncao": {
                String nomeFunc = t.getChild(0).getText();
                ArrayList<String> argumentos = new ArrayList<>();
                int c = 2;
                while (c < t.getChildCount() - 4) {
                    argumentos.add(t.getChild(c).getText());
                    c += 2;
                }
                c = t.getChildCount() - 2;
                atributosObjs.put(nomeFunc, argumentos);
                variaveis.put(nomeFunc, t.getChild(c));
                return null;
            }

            case "Bloco": {
                interpretar(t.getChild(0));
                ParseTree retorno = t.getChild(2);
                if (retorno != null) {
                    return interpretar(t.getChild(2));
                }
                return null;
            }

            case "Seq": {
                for (int c = 0; c < t.getChildCount(); c++) {
                    interpretar(t.getChild(c));
                }
                return null;
            }
            case "ValorFuncao":
            case "ChamarFuncao":
            case "Constante": {
                return interpretar(t.getChild(0));
            }

            case "Variavel": {
                String nomeVar = t.getChild(0).getText();
                Object valor = variaveis.get(nomeVar);
                if(valor == null){
                    throw new RuntimeException("Variável " + nomeVar + " não definida");
                }
                return valor;
            }

            case "Op": {
                String operador = t.getChild(1).getText();
                Object opEsq = interpretar(t.getChild(0));
                Object opDir = interpretar(t.getChild(2));
                String tipoOpEsq = opEsq.getClass().getSimpleName();
                String tipoOpDir = opDir.getClass().getSimpleName();
                if(tipoOpDir.equals("Integer") && tipoOpEsq.equals("Double")) {
                    return operacoes(opDir, opEsq, operador, tipoOpEsq);
                } else if (tipoOpEsq.equals("Integer") && tipoOpDir.equals("Double")) {
                    return operacoes(opDir, opEsq, operador, tipoOpDir);
                } else if(!tipoOpDir.equals(tipoOpEsq)){
                    throw new RuntimeException("Operadores " + tipoOpDir + " e " + tipoOpEsq + " são de tipos diferentes");
                } else {
                    return operacoes(opDir, opEsq, operador, tipoOpDir);
                }
            }

            case "Grupo": {
                return interpretar(t.getChild(1));
            }

            case "Atributo": {
                String nomeObj = t.getChild(0).getText();
                String atributo = t.getChild(2).getText();
                if(!objetos.containsKey(nomeObj)){
                    throw new RuntimeException("Objeto " + nomeObj + " Não declarado");
                } else if (!objetos.get(nomeObj).containsKey(atributo)){
                    throw new RuntimeException("Atributo " + atributo + " Não existe");
                } else {
                    return objetos.get(nomeObj).get(atributo);
                }
            }

            case "Funcao": {
                String nomeObj = t.getChild(0).getText();
                String nomeFunc = t.getChild(2).getText();
                if(!objetos.containsKey(nomeObj)){
                    throw new RuntimeException("Objeto " + nomeObj + " não declarada");
                } else if (!objetos.get(nomeObj).containsKey(nomeFunc)) {
                    throw new RuntimeException("Função " + nomeFunc + " não existe");
                } else {
                    ArrayList<String> argumentos = (ArrayList<String>) objetos.get(nomeObj).get(nomeFunc);
                    int numArgs = argumentos.size();
                    if(!numIgualDeArgs(numArgs, t)){
                        throw new RuntimeException("Número de argumentos passados diferentes da função declarada");
                    }
                    int index = 0;
                    for(int c = 4; c < t.getChildCount() - 1; c+=2){
                        String var = argumentos.get(index);
                        variaveis.put(var, interpretar(t.getChild(c)));
                        index++;
                    }
                    ParseTree bloco = (ParseTree) variaveis.get(nomeFunc);
                    return interpretar(bloco);
                }
            }

            case "Valor": {
                return verificarTipo(t.getText());
            }
            default:
                System.err.println("Não sei interpretar");
                return null;
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

    private Object verificarTipo(String valor) {
        if(isInteger(valor)) {
            return Integer.parseInt(valor);
        } else if (isDouble(valor)) {
            return Double.parseDouble(valor);
        } else if (valor.equals("false")) {
            return false;
        } else if (valor.equals("true")) {
            return true;
        } else {
            return valor;
        }
    }

    private Object operacoes (Object dir, Object esq, String op, String tipo){
        if (tipo.equals("Integer")) {
            return entreInteiros(dir, esq, op);
        } else if(tipo.equals("Boolean")){
            return entreBooleanos(dir, esq, op);
        } else if(tipo.equals("Double")){
            return entreDoubles(dir, esq, op);
        } else {
            if (op.equals("+")) return (String)esq + (String)dir;
            else throw new RuntimeException("Operador inválido para este tipo");
        }
    }

    private boolean numIgualDeArgs(int numArgs, ParseTree t){
        int numArgsPassados = 0;
        for(int c = 4; c < t.getChildCount() - 1; c+=2){
            numArgsPassados++;
        }
        return numArgs == numArgsPassados;
    }

    private Object entreInteiros (Object dir, Object esq, String op) {
        if (op.equals("+")) return (Integer)esq + (Integer)dir;
        else if (op.equals("*")) return (Integer)esq * (Integer)dir;
        else if (op.equals("-")) return (Integer)esq - (Integer)dir;
        else if (op.equals("/")) return (Integer)esq / (Integer)dir;
        else if (op.equals("<")) return (Integer)esq < (Integer)dir;
        else if (op.equals(">")) return (Integer)esq > (Integer)dir;
        else if (op.equals("<=")) return (Integer)esq <= (Integer)dir;
        else if (op.equals(">=")) return (Integer)esq >= (Integer)dir;
        else if (op.equals("==")) return (Integer)esq == (Integer)dir;
        else if (op.equals("!=")) return (Integer)esq != (Integer)dir;
        else throw new RuntimeException("Operador inválido para este tipo");
    }

    private Object entreBooleanos (Object dir, Object esq, String op){
        if (op.equals("==")) return (Boolean)esq == (Boolean) dir;
        else if (op.equals("!=")) return (Boolean)esq != (Boolean)dir;
        else if (op.equals("&&")) return (Boolean)esq && (Boolean)dir;
        else if (op.equals("||")) return (Boolean)esq || (Boolean)dir;
        else throw new RuntimeException("Operador inválido para este tipo");
    }
    private Object entreDoubles (Object dir, Object esq, String op){
        if (op.equals("+")) return (Double)esq + (Double)dir;
        else if (op.equals("*")) return (Double)esq * (Double) dir;
        else if (op.equals("-")) return (Double)esq - (Double) dir;
        else if (op.equals("/")) return (Double)esq / (Double) dir;
        else if (op.equals("<")) return (Double)esq < (Double) dir;
        else if (op.equals(">")) return (Double)esq > (Double) dir;
        else if (op.equals("<=")) return (Double)esq <= (Double) dir;
        else if (op.equals(">=")) return (Double)esq >= (Double) dir;
        else if (op.equals("==")) return (Double)esq == (Double) dir;
        else if (op.equals("!=")) return (Double)esq != (Double) dir;
        else throw new RuntimeException("Operador inválido para este tipo");
    }
    private void entreIntegerEDouble (Object dir, Object esq, String op){

    }

}
