import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class Interpretador {
    private final Map<String, HashMap<String, Object>> objetos = new HashMap<>();
    private HashMap<String, Object> atributosObjs = new HashMap<>();
    private HashMap<String, Object> variaveis = new HashMap<>();

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

            case "DecVar": {
                String nomeVar = t.getChild(1).getText();
                Object var = interpretar(t.getChild(3));
                variaveis.put(nomeVar, var);
                return null;
            }

            case "ModificarInserirAtributo": {
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

            case "Atribuicao": {
                String nomeVar = t.getChild(0).getText();
                if(!variaveis.containsKey(nomeVar)){
                throw new RuntimeException("Variável" + nomeVar + " não declarada");
                } else {
                    Object valor = interpretar(t.getChild(2));
                    variaveis.put(nomeVar, valor);
                }
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

            case "PrintAtrib": {
                String nomeObj = t.getChild(2).getText();
                String atributo = t.getChild(4).getText();
                if(!objetos.containsKey(nomeObj)){
                    throw new RuntimeException("Objeto " + nomeObj + " Não declarado");
                } else if (!objetos.get(nomeObj).containsKey(atributo)){
                    throw new RuntimeException("Atributo " + atributo + " Não existe");
                } else {
                    System.out.println(objetos.get(nomeObj).get(atributo).toString());
                }
                return null;
            }

            case "CriarAtributo": {
                String atributo = t.getChild(0).getText();
                Object valor = interpretar(t.getChild(2));
                atributosObjs.put(atributo, valor);
                return null;
            }

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
                if(!tipoOpDir.equals(tipoOpEsq)){
                    throw new RuntimeException("Operadores " + tipoOpDir + " e " + tipoOpEsq + " são de tipos diferentes");
                } else {
                    return operacoes(opDir, opEsq, operador, tipoOpDir);
                }
            }

            case "Grupo": {
                return interpretar(t.getChild(1));
            }

            case "Valor": {
                return verificarTipo(t.getText());
            }
            default:
                System.err.println("Não sei interpretar");
                return null;
        }
    }

    private boolean isNumber (String number) {
        try {
            int result = Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    private Object verificarTipo(String valor) {
        if(isNumber(valor)) {
            return Integer.parseInt(valor);
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
            if (op.equals("+")) return (Integer)esq + (Integer)dir;
            else if (op.equals("*")) return (Integer)esq * (Integer)dir;
            else if (op.equals("-")) return (Integer)esq - (Integer)dir;
            else if (op.equals("/")) return (Integer)esq / (Integer)dir;
            else if (op.equals("<")) return (Integer)esq < (Integer)dir;
            else if (op.equals(">")) return (Integer)esq < (Integer)dir;
            else if (op.equals("<=")) return (Integer)esq <= (Integer)dir;
            else if (op.equals(">=")) return (Integer)esq >= (Integer)dir;
            else if (op.equals("==")) return (Integer)esq >= (Integer)dir;
            else if (op.equals("!=")) return (Integer)esq >= (Integer)dir;
            else throw new RuntimeException("Operador inválido para este tipo");
        } else if(tipo.equals("Boolean")){
            if (op.equals("==")) return (Boolean)esq == (Boolean) dir;
            else if (op.equals("!=")) return (Boolean)esq != (Boolean)dir;
            else if (op.equals("&&")) return (Boolean)esq && (Boolean)dir;
            else if (op.equals("||")) return (Boolean)esq || (Boolean)dir;
            else throw new RuntimeException("Operador inválido para este tipo");
        } else {
            if (op.equals("+")) return (String)esq + (String)dir;
            else throw new RuntimeException("Operador inválido para este tipo");
        }
    }


}
