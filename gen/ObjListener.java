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
	 * labeled alternative in {@link ObjParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterDecObj(ObjParser.DecObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecObj}
	 * labeled alternative in {@link ObjParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitDecObj(ObjParser.DecObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModificaCriaAtributo}
	 * labeled alternative in {@link ObjParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterModificaCriaAtributo(ObjParser.ModificaCriaAtributoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModificaCriaAtributo}
	 * labeled alternative in {@link ObjParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitModificaCriaAtributo(ObjParser.ModificaCriaAtributoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModificaCriaFuncao}
	 * labeled alternative in {@link ObjParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterModificaCriaFuncao(ObjParser.ModificaCriaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModificaCriaFuncao}
	 * labeled alternative in {@link ObjParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitModificaCriaFuncao(ObjParser.ModificaCriaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChamarFuncao}
	 * labeled alternative in {@link ObjParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterChamarFuncao(ObjParser.ChamarFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChamarFuncao}
	 * labeled alternative in {@link ObjParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitChamarFuncao(ObjParser.ChamarFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjParser#decVar}.
	 * @param ctx the parse tree
	 */
	void enterDecVar(ObjParser.DecVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjParser#decVar}.
	 * @param ctx the parse tree
	 */
	void exitDecVar(ObjParser.DecVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ObjParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ObjParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtribVariavel}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void enterAtribVariavel(ObjParser.AtribVariavelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtribVariavel}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void exitAtribVariavel(ObjParser.AtribVariavelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ObjParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ObjParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void enterIf(ObjParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void exitIf(ObjParser.IfContext ctx);
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
	 * Enter a parse tree produced by the {@code CriarFuncao}
	 * labeled alternative in {@link ObjParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterCriarFuncao(ObjParser.CriarFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CriarFuncao}
	 * labeled alternative in {@link ObjParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitCriarFuncao(ObjParser.CriarFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(ObjParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(ObjParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjParser#seq}.
	 * @param ctx the parse tree
	 */
	void enterSeq(ObjParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjParser#seq}.
	 * @param ctx the parse tree
	 */
	void exitSeq(ObjParser.SeqContext ctx);
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
	 * Enter a parse tree produced by the {@code ValorFuncao}
	 * labeled alternative in {@link ObjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValorFuncao(ObjParser.ValorFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValorFuncao}
	 * labeled alternative in {@link ObjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValorFuncao(ObjParser.ValorFuncaoContext ctx);
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
	 * Enter a parse tree produced by the {@code Atributo}
	 * labeled alternative in {@link ObjParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(ObjParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atributo}
	 * labeled alternative in {@link ObjParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(ObjParser.AtributoContext ctx);
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
	 * Enter a parse tree produced by {@link ObjParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(ObjParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(ObjParser.FuncaoContext ctx);
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