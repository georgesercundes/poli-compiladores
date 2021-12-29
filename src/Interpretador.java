import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class Interpretador {
    private final Map<String, HashMap<String, Object>> objetos = new HashMap<>();

    private HashMap<String, Object> atributos = new HashMap<>();

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
                objetos.put(nomeObj, atributos);
                atributos = new HashMap<>();
                return "";
            }

//            case "ModificarCriarAtributo": {
//                String nomeObj = t.getChild(0).getText();
//                String atributo = t.getChild(2).getText();
//                String valor = interpretar(t.getChild(4));
//                verificarTipo(atributo, valor);
//
//            }

            case "InserirAtributo": {
                String atributo = t.getChild(0).getText();
                String valor = interpretar(t.getChild(2));
                verificarTipo(atributo, valor);
                return atributo;
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

    private void verificarTipo (String atributo, String valor) {
        if(isNumber(valor)) {
            atributos.put(atributo, Integer.parseInt(valor));
        } else if (valor.equals("false")) {
            atributos.put(atributo, false);
        } else if (valor.equals("true")) {
            atributos.put(atributo, true);
        } else {
            atributos.put(atributo, valor);
        }
    }


}
