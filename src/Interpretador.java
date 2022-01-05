import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class Interpretador {
    private final Map<String, LinkedHashMap<String, Object>> objetos = new HashMap<>();
    private LinkedHashMap<String, Object> atributos = new LinkedHashMap<>();
    private final HashMap<String, Object> variaveis = new HashMap<>();

    public Object interpretar (ParseTree t){
        String tipo = t.getClass().getSimpleName().replace("Context", "");
        switch (tipo) {
            case "Start" -> {
                for (int c = 0; c < t.getChildCount() - 1; c++) {
                    interpretar(t.getChild(c));
                }
                return null;
            }
            case "DecObj" -> {
                String nomeObj = t.getChild(1).getText();
                for (int c = 4; c < t.getChildCount() - 1; c += 2) {
                    interpretar(t.getChild(c));
                }
                objetos.put(nomeObj, atributos);
                atributos = new LinkedHashMap<>();
                return null;
            }
            case "ModificaCriaAtributo" -> {
                String nomeObj = t.getChild(0).getText();
                if (objetos.containsKey(nomeObj)) {
                    String atributo = t.getChild(2).getText();
                    Object valor = interpretar(t.getChild(4));
                    objetos.get(nomeObj).put(atributo, valor);

                } else {
                    throw new RuntimeException("Objeto " + nomeObj + " Não declarado");
                }
                return null;
            }
            case "ModificaCriaFuncao" -> {
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
            case "DecVar" -> {
                String nomeVar = t.getChild(1).getText();
                Object var = interpretar(t.getChild(3));
                variaveis.put(nomeVar, var);
                return null;
            }
            case "Print" -> {
                String nomeVar = t.getChild(2).getText();
                if (objetos.containsKey(nomeVar)) {
                    System.out.print("{");
                    objetos.get(nomeVar).forEach((key, value) -> System.out.print(" " + key + ":" + " " + value + ","));
                    System.out.println(" }");
                } else {
                    System.out.println(interpretar(t.getChild(2)).toString());
                }
                return null;
            }
            case "AtribVariavel" -> {
                String nomeVar = t.getChild(0).getText();
                if (!variaveis.containsKey(nomeVar)) {
                    throw new RuntimeException("Variável" + nomeVar + " não declarada");
                } else {
                    Object valor = interpretar(t.getChild(2));
                    variaveis.put(nomeVar, valor);
                }
                return null;
            }
            case "While" -> {
                ParseTree condicao = t.getChild(2);
                ParseTree repeticao = t.getChild(5);
                if (!interpretar(condicao).getClass().getSimpleName().equals("Boolean")) {
                    throw new RuntimeException("Condição não é uma expressão booleana");
                } else {
                    while ((Boolean) interpretar(condicao)) {
                        interpretar(repeticao);
                    }
                }
                return null;
            }
            case "If" -> {
                ParseTree condicao = t.getChild(2);
                ParseTree BlocoIf = t.getChild(5);
                ParseTree BlocoElse = t.getChild(9);
                if (!interpretar(condicao).getClass().getSimpleName().equals("Boolean")) {
                    throw new RuntimeException("Condição não é uma expressão booleana");
                } else {
                    if ((Boolean) interpretar(condicao)) {
                        interpretar(BlocoIf);
                    } else {
                        if (BlocoElse != null) {
                            interpretar(BlocoElse);
                        }
                    }
                }
                return null;
            }
            case "CriarAtributo" -> {
                String atributo = t.getChild(0).getText();
                if(atributos.containsKey(atributo)) {
                    throw new RuntimeException("Atributo " + atributo + " já existente no objeto");
                }
                Object valor = interpretar(t.getChild(2));
                atributos.put(atributo, valor);
                return null;
            }
            case "CriarFuncao" -> {
                String nomeFunc = t.getChild(0).getText();
                if(atributos.containsKey(nomeFunc)) {
                    throw new RuntimeException("Funcão " + nomeFunc + " já existente no objeto");
                }
                ArrayList<String> argumentos = new ArrayList<>();
                int c = 2;
                while (c < t.getChildCount() - 4) {
                    argumentos.add(t.getChild(c).getText());
                    c += 2;
                }
                c = t.getChildCount() - 2;
                atributos.put(nomeFunc, argumentos);
                variaveis.put(nomeFunc, t.getChild(c));
                return null;
            }
            case "Bloco" -> {
                interpretar(t.getChild(0));
                ParseTree retorno = t.getChild(2);
                if (retorno != null) {
                    return interpretar(t.getChild(2));
                }
                return null;
            }
            case "Seq" -> {
                for (int c = 0; c < t.getChildCount(); c++) {
                    interpretar(t.getChild(c));
                }
                return null;
            }
            case "ValorFuncao", "ChamarFuncao", "Constante" -> {
                return interpretar(t.getChild(0));
            }
            case "Variavel" -> {
                String nomeVar = t.getChild(0).getText();
                Object valor = variaveis.get(nomeVar);
                if (valor == null) {
                    throw new RuntimeException("Variável " + nomeVar + " não foi definida");
                }
                return valor;
            }
            case "Op" -> {
                String operador = t.getChild(1).getText();
                Object opEsq = interpretar(t.getChild(0));
                Object opDir = interpretar(t.getChild(2));
                String tipoOpEsq = opEsq.getClass().getSimpleName();
                String tipoOpDir = opDir.getClass().getSimpleName();
                if (tipoOpEsq.equals("Double") && tipoOpDir.equals("Integer")) {
                    return entreDoubleEInteger(opEsq, opDir, operador);
                } else if (tipoOpEsq.equals("Integer") && tipoOpDir.equals("Double")) {
                    return entreIntegerEDouble(opEsq, opDir, operador);
                } else if (!tipoOpEsq.equals(tipoOpDir)) {
                    throw new RuntimeException("Operadores " + tipoOpEsq + " e " + tipoOpDir + " são de tipos diferentes");
                } else {
                    return operacoes(opEsq, opDir, operador, tipoOpDir);
                }
            }
            case "Grupo" -> {
                return interpretar(t.getChild(1));
            }
            case "Atributo" -> {
                String nomeObj = t.getChild(0).getText();
                String atributo = t.getChild(2).getText();
                if (!objetos.containsKey(nomeObj)) {
                    throw new RuntimeException("Objeto " + nomeObj + " não foi declarado");
                } else if (!objetos.get(nomeObj).containsKey(atributo)) {
                    throw new RuntimeException("Objeto " + nomeObj + "não contém o atributo " + atributo);
                } else {
                    return objetos.get(nomeObj).get(atributo);
                }
            }
            case "Funcao" -> {
                String nomeObj = t.getChild(0).getText();
                String nomeFunc = t.getChild(2).getText();
                if (!objetos.containsKey(nomeObj)) {
                    throw new RuntimeException("Objeto " + nomeObj + " não declarada");
                } else if (!objetos.get(nomeObj).containsKey(nomeFunc)) {
                    throw new RuntimeException("Função " + nomeFunc + " não existe");
                } else {
                    ArrayList<String> argumentos = (ArrayList<String>) objetos.get(nomeObj).get(nomeFunc);
                    int numArgs = argumentos.size();
                    if (!numIgualDeArgs(numArgs, t)) {
                        throw new RuntimeException("Número de argumentos passados diferentes da função declarada");
                    }
                    int index = 0;
                    for (int c = 4; c < t.getChildCount() - 1; c += 2) {
                        String var = argumentos.get(index);
                        variaveis.put(var, interpretar(t.getChild(c)));
                        index++;
                    }
                    ParseTree bloco = (ParseTree) variaveis.get(nomeFunc);
                    return interpretar(bloco);
                }
            }
            case "Valor" -> {
                return typeOf(t.getText());
            }
            default -> {
                System.err.println("Não sei interpretar");
                return null;
            }
        }
    }

//    Funções auxiliares
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

    private Object typeOf(String valor) {
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

    private Object operacoes (Object esq, Object dir, String op, String tipo){
        switch (tipo) {
            case "Integer":
                return entreInteiros(esq, dir, op);
            case "Boolean":
                return entreBooleanos(esq, dir, op);
            case "Double":
                return entreDoubles(esq, dir, op);
            default:
                if (op.equals("+")) return esq + (String) dir;
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

    private Object entreInteiros (Object esq, Object dir, String op) {
        return switch (op) {
            case "*" -> (Integer) esq * (Integer) dir;
            case "/" -> ((Integer)dir > (Integer)esq) ?
                    Double.parseDouble(esq.toString()) / Double.parseDouble(dir.toString())
                    : (Integer) esq / (Integer) dir;
            case "+" -> (Integer) esq + (Integer) dir;
            case "-" -> (Integer) esq - (Integer) dir;
            case "<" -> (Integer) esq < (Integer) dir;
            case ">" -> (Integer) esq > (Integer) dir;
            case "<=" -> (Integer) esq <= (Integer) dir;
            case ">=" -> (Integer) esq >= (Integer) dir;
            case "==" -> esq == dir;
            case "!=" -> esq != dir;
            default -> throw new RuntimeException("Operador inválido para este tipo");
        };
    }

    private Object entreBooleanos (Object esq, Object dir, String op){
        return switch (op) {
            case "==" -> esq == dir;
            case "!=" -> esq != dir;
            case "&&" -> (Boolean) esq && (Boolean) dir;
            case "||" -> (Boolean) esq || (Boolean) dir;
            default -> throw new RuntimeException("Operador inválido para este tipo");
        };
    }
    private Object entreDoubles (Object esq, Object dir, String op){
        return switch (op) {
            case "*" -> (Double) esq * (Double) dir;
            case "/" -> (Double) esq / (Double) dir;
            case "+" -> (Double) esq + (Double) dir;
            case "-" -> (Double) esq - (Double) dir;
            case "<" -> (Double) esq < (Double) dir;
            case ">" -> (Double) esq > (Double) dir;
            case "<=" -> (Double) esq <= (Double) dir;
            case ">=" -> (Double) esq >= (Double) dir;
            case "==" -> esq == dir;
            case "!=" -> esq != dir;
            default -> throw new RuntimeException("Operador inválido para este tipo");
        };
    }
    private Object entreDoubleEInteger (Object esq, Object dir, String op){
        return switch (op) {
            case "*" -> (Double) esq * (Integer) dir;
            case "/" -> (Double) esq / (Integer) dir;
            case "+" -> (Double) esq + (Integer) dir;
            case "-" -> (Double) esq - (Integer) dir;
            case "<" -> (Double) esq < (Integer) dir;
            case ">" -> (Double) esq > (Integer) dir;
            case "<=" -> (Double) esq <= (Integer) dir;
            case ">=" -> (Double) esq >= (Integer) dir;
            default -> throw new RuntimeException("Operador inválido para este tipo");
        };
    }

    private Object entreIntegerEDouble (Object esq, Object dir, String op){
        return switch (op) {
            case "*" -> (Integer) esq * (Double) dir;
            case "/" -> (Integer) esq / (Double) dir;
            case "+" -> (Integer) esq + (Double) dir;
            case "-" -> (Integer) esq - (Double) dir;
            case "<" -> (Integer) esq < (Double) dir;
            case ">" -> (Integer) esq > (Double) dir;
            case "<=" -> (Integer) esq <= (Double) dir;
            case ">=" -> (Integer) esq >= (Double) dir;
            default -> throw new RuntimeException("Operador inválido para este tipo");
        };
    }


}
