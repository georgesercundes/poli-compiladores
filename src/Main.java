import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Executando o intepretador");
        CharStream src = CharStreams.fromFileName("src/teste.obj");
        ObjLexer lexer = new ObjLexer(src);
        TokenStream tokens = new CommonTokenStream(lexer);
        ObjParser parser = new ObjParser(tokens);

        ParseTree tree = parser.start();
        if(parser.getNumberOfSyntaxErrors() > 0) {
            System.out.println("Entrada errada");
        } else {
            System.out.println("Entrada Válida");
            AnalisadorSemantico analisador = new AnalisadorSemantico();
            if(analisador.analise(tree)) {
                Interpretador interpretador = new Interpretador();
                interpretador.interpretar(tree);
            } else {
                System.out.println("Erros de semântica detectados");
            }
        }

    }
}
