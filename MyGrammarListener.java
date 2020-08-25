// Generated from MyGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(MyGrammarParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(MyGrammarParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(MyGrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(MyGrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#comment_line}.
	 * @param ctx the parse tree
	 */
	void enterComment_line(MyGrammarParser.Comment_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#comment_line}.
	 * @param ctx the parse tree
	 */
	void exitComment_line(MyGrammarParser.Comment_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#command_line}.
	 * @param ctx the parse tree
	 */
	void enterCommand_line(MyGrammarParser.Command_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#command_line}.
	 * @param ctx the parse tree
	 */
	void exitCommand_line(MyGrammarParser.Command_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(MyGrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(MyGrammarParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#note_cmd}.
	 * @param ctx the parse tree
	 */
	void enterNote_cmd(MyGrammarParser.Note_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#note_cmd}.
	 * @param ctx the parse tree
	 */
	void exitNote_cmd(MyGrammarParser.Note_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#command_name}.
	 * @param ctx the parse tree
	 */
	void enterCommand_name(MyGrammarParser.Command_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#command_name}.
	 * @param ctx the parse tree
	 */
	void exitCommand_name(MyGrammarParser.Command_nameContext ctx);
}