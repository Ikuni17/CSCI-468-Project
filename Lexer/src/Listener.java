/**
 * Created by Will on 3/26/2017.
 */
public class Listener extends lexerGrammarBaseListener
{
    public SymbolTable current_scope;
    public int block_id = 1;
    public IRGenerator ir_generator;

    public Listener()
    {
        current_scope = new SymbolTable(null, "GLOBAL");
        ir_generator = new IRGenerator();
    }

    @Override
    public void enterVar_decl(lexerGrammarParser.Var_declContext ctx)
    {
        String var_type = ctx.var_type().getText();

        // Add the first id
        Symbol id_sym = new Symbol(var_type, ctx.id_list().id().getText());
        current_scope.add(id_sym.get_name(), id_sym);

        // Add the remainder of the id list
        lexerGrammarParser.Id_tailContext tail = ctx.id_list().id_tail();
        while (tail.getChildCount() != 0)
        {
            Symbol tail_sym = new Symbol(var_type, tail.id().getText());
            current_scope.add(tail_sym.get_name(), tail_sym);
            tail = tail.id_tail();
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
    public void enterRead_stmt(lexerGrammarParser.Read_stmtContext ctx)
    {
        // Get the first id
        Symbol id_sym = current_scope.find(ctx.id_list().id().getText());
        add_read_instruction(id_sym);

        // Add the remainder of the id list
        lexerGrammarParser.Id_tailContext tail = ctx.id_list().id_tail();
        while (tail.getChildCount() != 0)
        {
            id_sym = current_scope.find(tail.id().getText());
            add_read_instruction(id_sym);
            tail = tail.id_tail();
        }
    }

    @Override
    public void enterWrite_stmt(lexerGrammarParser.Write_stmtContext ctx)
    {
        // Get the first id
        Symbol id_sym = current_scope.find(ctx.id_list().id().getText());
        add_write_instruction(id_sym);

        // Add the remainder of the id list
        lexerGrammarParser.Id_tailContext tail = ctx.id_list().id_tail();
        while (tail.getChildCount() != 0)
        {
            id_sym = current_scope.find(tail.id().getText());
            add_write_instruction(id_sym);
            tail = tail.id_tail();
        }
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

    @Override
    public void enterAssign_expr(lexerGrammarParser.Assign_exprContext ctx)
    {
        // Generate a new instruction with the symbol as the target
        Symbol lvalue = current_scope.find(ctx.id().getText());
        IRInstruction assign_inst = ir_generator.push_instruction();
        assign_inst.result = Operand.symbol_operand(lvalue);
    }

    @Override
    public void exitAssign_expr(lexerGrammarParser.Assign_exprContext ctx)
    {
        // If the op was never determined, it should be a store
        IRInstruction assign_inst = ir_generator.pop();
        if (assign_inst != null && assign_inst.op == null)
        {
            if (assign_inst.result.type == Operand.Type.INT_VAR)
            {
                assign_inst.op = IRInstruction.OP.STOREI;
            }
            else if (assign_inst.result.type == Operand.Type.FLOAT_VAR)
            {
                assign_inst.op = IRInstruction.OP.STOREF;
            }
        }
    }

    @Override
    public void enterFactor_prefix(lexerGrammarParser.Factor_prefixContext ctx)
    {
        // If this isn't ACTUALLY a factor prefix, skip it
        if (ctx.getChildCount() == 0)
        {
            return;
        }

        expr_recurse();
    }

    @Override
    public void enterExpr_prefix(lexerGrammarParser.Expr_prefixContext ctx)
    {
        // If this isn't ACTUALLY an expr prefix, skip it
        if (ctx.getChildCount() == 0)
        {
            return;
        }

        expr_recurse();
    }

    @Override
    public void enterPrimary(lexerGrammarParser.PrimaryContext ctx)
    {
        if (ctx.id() != null)
        {
            Symbol sym = current_scope.find(ctx.id().getText());
            Operand operand = Operand.symbol_operand(sym);
            assign_operand(operand);
            pop_if_complete();
        }
        else if (ctx.INTLITERAL() != null)
        {
            assign_operand(Operand.int_lit_operand(ctx.INTLITERAL().getText()));
            pop_if_complete();
        }
        else if (ctx.FLOATLITERAL() != null)
        {
            assign_operand(Operand.float_lit_operand(ctx.FLOATLITERAL().getText()));
            pop_if_complete();
        }
    }

    @Override
    public void enterAddop(lexerGrammarParser.AddopContext ctx)
    {
        IRInstruction instr = ir_generator.top_instruction();

        // First operand's type must have been determined (only ints and floats are allowed for ADD/SUB)
        assert(instr.operand_1.is_int() || instr.operand_1.is_float());
        assert(instr.op == IRInstruction.OP.UNDETERMINED_RESERVED);

        if (ctx.getText().equals("+"))
        {
            if (instr.operand_1.is_int())
            {
                instr.op = IRInstruction.OP.ADDI;
            }
            else
            {
                instr.op = IRInstruction.OP.ADDF;
            }
        }
        else
        {
            assert(ctx.getText().equals("-"));
            if (instr.operand_1.is_int())
            {
                instr.op = IRInstruction.OP.SUBI;
            }
            else
            {
                instr.op = IRInstruction.OP.SUBF;
            }
        }
    }

    @Override
    public void enterMulop(lexerGrammarParser.MulopContext ctx)
    {
        IRInstruction instr = ir_generator.top_instruction();

        // First operand's type must have been determined (only ints and floats are allowed for MUL/DIV)
        assert(instr.operand_1.is_int() || instr.operand_1.is_float());
        assert(instr.op == IRInstruction.OP.UNDETERMINED_RESERVED);

        if (ctx.getText().equals("*"))
        {
            if (instr.operand_1.is_int())
            {
                instr.op = IRInstruction.OP.MULTI;
            }
            else
            {
                instr.op = IRInstruction.OP.MULTF;
            }
        }
        else
        {
            assert(ctx.getText().equals("/"));
            if (instr.operand_1.is_int())
            {
                instr.op = IRInstruction.OP.DIVI;
            }
            else
            {
                instr.op = IRInstruction.OP.DIVF;
            }
        }
    }

    private void expr_recurse()
    {
        // If the current instruction hasn't actually be assigned anything yet
        IRInstruction instr = ir_generator.top_instruction();
        if (instr.op != null)
        {
            instr = push_temp_instruction();
        }

        instr.op = IRInstruction.OP.UNDETERMINED_RESERVED;
    }

    private IRInstruction push_temp_instruction()
    {
        Operand temp = ir_generator.allocate_temporary();
        assign_operand(temp);
        IRInstruction instr = ir_generator.push_instruction();
        instr.result = temp;
        return instr;
    }

    private void determine_result_type()
    {
        IRInstruction instr = ir_generator.top_instruction();
        if (instr.result.type != null)
        {
            return;
        }

        assert(instr.operand_1.is_int() || instr.operand_1.is_float());

        if (instr.operand_1.is_int())
        {
            instr.result.type = Operand.Type.INT_VAR;
        }
        else
        {
            instr.result.type = Operand.Type.FLOAT_VAR;
        }
    }

    private void assign_operand(Operand operand)
    {
        IRInstruction instr = ir_generator.top_instruction();
        assert(instr.operand_1 == null || instr.operand_2 == null);

        if (instr.operand_1 == null)
        {
            instr.operand_1 = operand;
        }
        else
        {
            instr.operand_2 = operand;
        }
    }

    private void pop_if_complete()
    {
        IRInstruction instr = ir_generator.top_instruction();
        if (instr != null && instr.operand_1 != null && instr.op != null && instr.operand_2 != null)
        {
            determine_result_type();
            ir_generator.pop();
            pop_if_complete();
        }
    }

    private void add_read_instruction(Symbol symbol)
    {
        IRInstruction instr = ir_generator.add_instruction();
        instr.result = Operand.symbol_operand(symbol);
        if (symbol.get_type().equals("INT"))
        {
            instr.op = IRInstruction.OP.READI;
        }
        else if (symbol.get_type().equals("FLOAT"))
        {
            instr.op = IRInstruction.OP.READF;
        }
    }

    private void add_write_instruction(Symbol symbol)
    {
        IRInstruction instr = ir_generator.add_instruction();
        instr.result = Operand.symbol_operand(symbol);
        if (symbol.get_type().equals("INT"))
        {
            instr.op = IRInstruction.OP.WRITEI;
        }
        else if (symbol.get_type().equals("FLOAT"))
        {
            instr.op = IRInstruction.OP.WRITEF;
        }
        else if (symbol.get_type().equals("STRING"))
        {
            instr.op = IRInstruction.OP.WRITES;
        }
    }
}
