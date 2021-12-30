import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class Interpretador {
    private final Map<String, HashMap<String, Object>> objetos = new HashMap<>();
    private HashMap<String, Object> atributosCriados = new HashMap<>();

    public String interpretar (ParseTree t){
        String tipo = t.getClass().getSimpleName().replace("Context", "");
        switch (tipo){

            case "Start": {
                for (int c = 0; c < t.getChildCount() - 1; c++) {
                    interpretar(t.getChild(c));
                }
                return "";
            }
            case "Dec": {
                String nomeObj = t.getChild(1).getText();
                for(int c = 4; c < t.getChildCount() - 1; c += 2) {
                    interpretar(t.getChild(c));
                }
                objetos.put(nomeObj, atributosCriados);
                atributosCriados = new HashMap<>();
                return "";
            }
            case "ModificarInserirAtributo": {
                String nomeObj = t.getChild(0).getText();
                if (objetos.containsKey(nomeObj)){
                    String atributo = t.getChild(2).getText();
                    Object valor = verificarTipo(interpretar(t.getChild(4)));
                    objetos.get(nomeObj).put(atributo, valor);

                } else {
                    throw new RuntimeException("Objeto " + nomeObj + " Não declarado");
                }
                return "";
            }
            case "CriarAtributo": {
                String atributo = t.getChild(0).getText();
                Object valor = verificarTipo(interpretar(t.getChild(2)));
                atributosCriados.put(atributo, valor);
                return "";
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
                return "";
            }
            case "PrintObj": {
                String nomeObj = t.getChild(2).getText();
                if(objetos.containsKey(nomeObj)){
                    System.out.print("{");
                    objetos.get(nomeObj).entrySet().forEach(entry -> {
                        System.out.print(" " + entry.getKey() + ":" + " " + entry.getValue() + ",");
                    });
                    System.out.println(" }");
                } else {
                    throw new RuntimeException("Objeto " + nomeObj + " Não declarado");
                }
                return "";
            }

            case "Valor": {
                return t.getText();
            }
            default:
                System.err.println("Não sei interpretar");
                return "erro";
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

    private Object verificarTipo (String valor) {
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


}
