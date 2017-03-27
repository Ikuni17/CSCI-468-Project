/**
 * Created by Will on 3/26/2017.
 */
public class Listener extends lexerGrammarBaseListener
{
    public SymbolTable current_scope;
    public String decl_type;
    public boolean in_var_decl = false;
    public int block_id = 1;

    public Listener()
    {
    }

    @Override
    public void enterPgm_body(lexerGrammarParser.Pgm_bodyContext ctx)
    {
        current_scope = new SymbolTable(null, "GLOBAL");
    }

    @Override
    public void exitPgm_body(lexerGrammarParser.Pgm_bodyContext ctx)
    {
        System.out.println(current_scope.toString());
    }

    @Override
    public void enterVar_decl(lexerGrammarParser.Var_declContext ctx)
    {
        decl_type = ctx.var_type().getText();
        in_var_decl = true;
    }

    @Override
    public void exitVar_decl(lexerGrammarParser.Var_declContext ctx)
    {
        in_var_decl = false;
    }

    @Override
    public void enterId(lexerGrammarParser.IdContext ctx)
    {
        if (in_var_decl)
        {
            Symbol sym = new Symbol(decl_type, ctx.getText());
            current_scope.add(sym.get_name(), sym);
        }
    }

    @Override
    public void enterString_decl(lexerGrammarParser.String_declContext ctx)
    {
        Symbol sym = new Symbol("STRING", ctx.id().getText(), ctx.str().getText());
        current_scope.add(sym.get_name(), sym);
    }

    @Override
    public void enterFunc_decl(lexerGrammarParser.Func_declContext ctx)
    {
        current_scope = new SymbolTable(current_scope, ctx.id().getText());
    }

    @Override
    public void exitFunc_decl(lexerGrammarParser.Func_declContext ctx)
    {
        current_scope = current_scope.get_parent();
    }

    @Override
    public void enterParam_decl(lexerGrammarParser.Param_declContext ctx)
    {
        Symbol sym = new Symbol(ctx.var_type().getText(), ctx.id().getText());
        current_scope.add(sym.get_name(), sym);
    }

    @Override
    public void enterIf_stmt(lexerGrammarParser.If_stmtContext ctx)
    {
        current_scope = new SymbolTable(current_scope, "BLOCK " + block_id);
        block_id += 1;
    }

    @Override
    public void exitIf_stmt(lexerGrammarParser.If_stmtContext ctx)
    {
        current_scope = current_scope.get_parent();
    }

    @Override
    public void enterElse_part(lexerGrammarParser.Else_partContext ctx)
    {
        if (ctx.getChildCount() == 0)
        {
            return;
        }

        // The else should not be a child of the if
        current_scope = current_scope.get_parent();
        current_scope = new SymbolTable(current_scope, "BLOCK " + block_id);
        block_id += 1;
    }

    @Override
    public void enterWhile_stmt(lexerGrammarParser.While_stmtContext ctx)
    {
        current_scope = new SymbolTable(current_scope, "BLOCK " + block_id);
        block_id += 1;
    }

    @Override
    public void exitWhile_stmt(lexerGrammarParser.While_stmtContext ctx)
    {
        current_scope = current_scope.get_parent();
    }
}
