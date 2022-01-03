// Generated from C:/Users/georg/IdeaProjects/Projeto_Compiladores/src\Obj.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by the {@code DecObj}
	 * labeled alternative in {@link ObjParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDecObj(ObjParser.DecObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecObj}
	 * labeled alternative in {@link ObjParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDecObj(ObjParser.DecObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecVar}
	 * labeled alternative in {@link ObjParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDecVar(ObjParser.DecVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecVar}
	 * labeled alternative in {@link ObjParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDecVar(ObjParser.DecVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModificarInserirAtributo}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void enterModificarInserirAtributo(ObjParser.ModificarInserirAtributoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModificarInserirAtributo}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void exitModificarInserirAtributo(ObjParser.ModificarInserirAtributoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(ObjParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(ObjParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ObjParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ObjParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintAtrib}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void enterPrintAtrib(ObjParser.PrintAtribContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintAtrib}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void exitPrintAtrib(ObjParser.PrintAtribContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CriarAtributo}
	 * labeled alternative in {@link ObjParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterCriarAtributo(ObjParser.CriarAtributoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CriarAtributo}
	 * labeled alternative in {@link ObjParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitCriarAtributo(ObjParser.CriarAtributoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variavel}
	 * labeled alternative in {@link ObjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(ObjParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variavel}
	 * labeled alternative in {@link ObjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(ObjParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Op}
	 * labeled alternative in {@link ObjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOp(ObjParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Op}
	 * labeled alternative in {@link ObjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOp(ObjParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constante}
	 * labeled alternative in {@link ObjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstante(ObjParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constante}
	 * labeled alternative in {@link ObjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstante(ObjParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Grupo}
	 * labeled alternative in {@link ObjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGrupo(ObjParser.GrupoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Grupo}
	 * labeled alternative in {@link ObjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGrupo(ObjParser.GrupoContext ctx);
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