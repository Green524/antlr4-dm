// Generated from java-escape by ANTLR 4.11.1
package g4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalcParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(CalcParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CalcParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CalcParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CalcParser.PrintContext ctx);
}