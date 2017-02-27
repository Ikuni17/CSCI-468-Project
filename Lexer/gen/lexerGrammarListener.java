// Generated from C:/Users/white_000/OneDrive/School/CSCI-468 Compilers/CSCI-468-Project/Lexer/src\lexerGrammar.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lexerGrammarParser}.
 */
public interface lexerGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(lexerGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(lexerGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(lexerGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(lexerGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void enterPgm_body(lexerGrammarParser.Pgm_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void exitPgm_body(lexerGrammarParser.Pgm_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(lexerGrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(lexerGrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void enterString_decl(lexerGrammarParser.String_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void exitString_decl(lexerGrammarParser.String_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(lexerGrammarParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(lexerGrammarParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(lexerGrammarParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(lexerGrammarParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(lexerGrammarParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(lexerGrammarParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(lexerGrammarParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(lexerGrammarParser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(lexerGrammarParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(lexerGrammarParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_tail(lexerGrammarParser.Id_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_tail(lexerGrammarParser.Id_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_list(lexerGrammarParser.Param_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_list(lexerGrammarParser.Param_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(lexerGrammarParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(lexerGrammarParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_tail(lexerGrammarParser.Param_decl_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_tail(lexerGrammarParser.Param_decl_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declarations(lexerGrammarParser.Func_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declarations(lexerGrammarParser.Func_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(lexerGrammarParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(lexerGrammarParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(lexerGrammarParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(lexerGrammarParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(lexerGrammarParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(lexerGrammarParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(lexerGrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(lexerGrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBase_stmt(lexerGrammarParser.Base_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBase_stmt(lexerGrammarParser.Base_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(lexerGrammarParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(lexerGrammarParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(lexerGrammarParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(lexerGrammarParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(lexerGrammarParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(lexerGrammarParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(lexerGrammarParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(lexerGrammarParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(lexerGrammarParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(lexerGrammarParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(lexerGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(lexerGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(lexerGrammarParser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(lexerGrammarParser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(lexerGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(lexerGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void enterFactor_prefix(lexerGrammarParser.Factor_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void exitFactor_prefix(lexerGrammarParser.Factor_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expr(lexerGrammarParser.Postfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expr(lexerGrammarParser.Postfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(lexerGrammarParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(lexerGrammarParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(lexerGrammarParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(lexerGrammarParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(lexerGrammarParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(lexerGrammarParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(lexerGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(lexerGrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(lexerGrammarParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(lexerGrammarParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(lexerGrammarParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(lexerGrammarParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(lexerGrammarParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(lexerGrammarParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(lexerGrammarParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(lexerGrammarParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(lexerGrammarParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(lexerGrammarParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(lexerGrammarParser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(lexerGrammarParser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(lexerGrammarParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(lexerGrammarParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexerGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(lexerGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexerGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(lexerGrammarParser.StartContext ctx);
}