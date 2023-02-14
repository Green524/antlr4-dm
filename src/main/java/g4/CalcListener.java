// Generated from java-escape by ANTLR 4.11.1
package g4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalcParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalcParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(CalcParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(CalcParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CalcParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CalcParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalcParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalcParser.PrintContext ctx);
}