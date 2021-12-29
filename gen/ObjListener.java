// Generated from C:/Users/george.siqueira/IdeaProjects/Projeto_Compiladores/src\Obj.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ObjParser}.
 */
public interface ObjListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ObjParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ObjParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ObjParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(ObjParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(ObjParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InserirAtributo}
	 * labeled alternative in {@link ObjParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterInserirAtributo(ObjParser.InserirAtributoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InserirAtributo}
	 * labeled alternative in {@link ObjParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitInserirAtributo(ObjParser.InserirAtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(ObjParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(ObjParser.ValorContext ctx);
}