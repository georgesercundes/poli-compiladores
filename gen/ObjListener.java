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
	 * Enter a parse tree produced by the {@code ObjNVazio}
	 * labeled alternative in {@link ObjParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterObjNVazio(ObjParser.ObjNVazioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjNVazio}
	 * labeled alternative in {@link ObjParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitObjNVazio(ObjParser.ObjNVazioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjVazio}
	 * labeled alternative in {@link ObjParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterObjVazio(ObjParser.ObjVazioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjVazio}
	 * labeled alternative in {@link ObjParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitObjVazio(ObjParser.ObjVazioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void enterCom(ObjParser.ComContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjParser#com}.
	 * @param ctx the parse tree
	 */
	void exitCom(ObjParser.ComContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atributo}
	 * labeled alternative in {@link ObjParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(ObjParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atributo}
	 * labeled alternative in {@link ObjParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(ObjParser.AtributoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncaoComArgumentos}
	 * labeled alternative in {@link ObjParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoComArgumentos(ObjParser.FuncaoComArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncaoComArgumentos}
	 * labeled alternative in {@link ObjParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoComArgumentos(ObjParser.FuncaoComArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncaoSemArgumentos}
	 * labeled alternative in {@link ObjParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoSemArgumentos(ObjParser.FuncaoSemArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncaoSemArgumentos}
	 * labeled alternative in {@link ObjParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoSemArgumentos(ObjParser.FuncaoSemArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link ObjParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterFalse(ObjParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link ObjParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitFalse(ObjParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link ObjParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterTrue(ObjParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link ObjParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitTrue(ObjParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link ObjParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterNum(ObjParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link ObjParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitNum(ObjParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link ObjParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterString(ObjParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link ObjParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitString(ObjParser.StringContext ctx);
}