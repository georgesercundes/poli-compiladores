import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class Interpretador {
    private final Map<String, ArrayList<String>> atributos = new HashMap<>();
    private final Map<String, String> strings = new HashMap<>();
    private final Map<String, Integer> inteiros = new HashMap<>();
    private final Map<String, Boolean> booleanos = new HashMap<>();

    public String interpretar (ParseTree t){
        String tipo = t.getClass().getSimpleName().replace("Context", "");
        switch (tipo){

            case "Start": {
                for (int c = 0; c < t.getChildCount() - 1; c++) {
                    interpretar(t.getChild(c));
                }
            }

            case "Dec": {
                String nomeObj = t.getChild(1).getText();
                ArrayList<Integer> objVars = new ArrayList<>();
                for(int c = 4; c < t.getChildCount() - 1; c += 2) {
                    interpretar(t.getChild(c));
                }
            }
            case "Atrib": {

            }
            default:
                System.err.println("Não sei interpretar");
                return "erro";
        }
    }


}
