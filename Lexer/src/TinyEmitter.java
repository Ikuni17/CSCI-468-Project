import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Will on 4/25/2017.
 */
public class TinyEmitter
{
    private static final String SWAP_REG = "r0";

    public String emit_code(SymbolTable symbols, List<IRInstruction> instructions)
    {
        StringBuilder result = new StringBuilder();

        // Allocate variables
        for (Symbol sym : symbols.get_symbols())
        {
            if (sym.get_type().equals("STRING"))
            {
                _allocations.put(sym.get_name(), sym.get_name());
                result.append("str ");
                result.append(sym.get_name());
                result.append(" ");
                result.append(sym.get_value());
                result.append("\n");
                continue;
            }

            _allocations.put(sym.get_name(), "v_" + sym.get_name());
            result.append("var ");
            result.append("v_" + sym.get_name());
            result.append("\n");
        }

        // begin emitting code
        for (IRInstruction instr : instructions)
        {
            switch (instr.op)
            {
                case LABEL:
                    gen_1ac(result, "label", instr.result.value);
                    break;

                case JUMP:
                    gen_1ac(result, "jmp", instr.result.value);
                    break;

                case GT:
                    gen_cmp(result, instr.operand_1, instr.operand_2);
                    gen_1ac(result, "jgt", instr.result.value);
                    break;

                case GE:
                    gen_cmp(result, instr.operand_1, instr.operand_2);
                    gen_1ac(result, "jge", instr.result.value);
                    break;

                case LT:
                    gen_cmp(result, instr.operand_1, instr.operand_2);
                    gen_1ac(result, "jlt", instr.result.value);
                    break;

                case LE:
                    gen_cmp(result, instr.operand_1, instr.operand_2);
                    gen_1ac(result, "jle", instr.result.value);
                    break;

                case NE:
                    gen_cmp(result, instr.operand_1, instr.operand_2);
                    gen_1ac(result, "jne", instr.result.value);
                    break;

                case EQ:
                    gen_cmp(result, instr.operand_1, instr.operand_2);
                    gen_1ac(result, "jeq", instr.result.value);
                    break;

                case STOREI:
                case STOREF:
                    // Only one argument to MOVE may be a memory address
                    if (!is_lit_or_reg(instr.operand_1))
                    {
                        gen_store_in_swap(result, get_opmr(instr.operand_1));
                        gen_2ac(result, "move", SWAP_REG, get_opmr(instr.result));
                    }
                    else
                    {
                        gen_2ac(result, "move", get_opmrl(instr.operand_1), get_opmr(instr.result));
                    }
                    break;

                case ADDI:
                    gen_store_in_swap(result, get_opmrl(instr.operand_1));
                    gen_2ac(result, "addi", get_opmrl(instr.operand_2), SWAP_REG);
                    gen_load_from_swap(result, get_opmr(instr.result));
                    break;

                case ADDF:
                    gen_store_in_swap(result, get_opmrl(instr.operand_1));
                    gen_2ac(result, "addr", get_opmrl(instr.operand_2), SWAP_REG);
                    gen_load_from_swap(result, get_opmr(instr.result));
                    break;

                case SUBI:
                    gen_store_in_swap(result, get_opmrl(instr.operand_1));
                    gen_2ac(result, "subi", get_opmrl(instr.operand_2), SWAP_REG);
                    gen_load_from_swap(result, get_opmr(instr.result));
                    break;

                case SUBF:
                    gen_store_in_swap(result, get_opmrl(instr.operand_1));
                    gen_2ac(result, "subr", get_opmrl(instr.operand_2), SWAP_REG);
                    gen_load_from_swap(result, get_opmr(instr.result));
                    break;

                case MULTI:
                    gen_store_in_swap(result, get_opmrl(instr.operand_1));
                    gen_2ac(result, "muli", get_opmrl(instr.operand_2), SWAP_REG);
                    gen_load_from_swap(result, get_opmr(instr.result));
                    break;

                case MULTF:
                    gen_store_in_swap(result, get_opmrl(instr.operand_1));
                    gen_2ac(result, "mulr", get_opmrl(instr.operand_2), SWAP_REG);
                    gen_load_from_swap(result, get_opmr(instr.result));
                    break;

                case DIVI:
                    gen_store_in_swap(result, get_opmrl(instr.operand_1));
                    gen_2ac(result, "divi", get_opmrl(instr.operand_2), SWAP_REG);
                    gen_load_from_swap(result, get_opmr(instr.result));
                    break;

                case DIVF:
                    gen_store_in_swap(result, get_opmrl(instr.operand_1));
                    gen_2ac(result, "divr", get_opmrl(instr.operand_2), SWAP_REG);
                    gen_load_from_swap(result, get_opmr(instr.result));
                    break;

                case READI:
                    gen_1ac(result, "sys readi", get_opmr(instr.result));
                    break;

                case READF:
                    gen_1ac(result, "sys readr", get_opmr(instr.result));
                    break;

                case WRITEI:
                    gen_1ac(result, "sys writei", get_opmr(instr.result));
                    break;

                case WRITEF:
                    gen_1ac(result, "sys writer", get_opmr(instr.result));
                    break;

                case WRITES:
                    gen_1ac(result, "sys writes", get_opmr(instr.result));
                    break;

                default:
                    assert(false); // Unsupported op
                    break;
            }
        }

        // Output post
        result.append("sys halt\n");
        result.append("end\n");

        // Output result
        return result.toString();
    }

    private static void gen_1ac(StringBuilder result, String op, String arg)
    {
        result.append(op);
        result.append(" ");
        result.append(arg);
        result.append("\n");
    }

    private static void gen_2ac(StringBuilder result, String op, String opmrl, String reg_result)
    {
        result.append(op);
        result.append(" ");
        result.append(opmrl);
        result.append(" ");
        result.append(reg_result);
        result.append("\n");
    }

    private static void gen_store_in_swap(StringBuilder result, String opmrl)
    {
        gen_2ac(result, "move", opmrl, SWAP_REG);
    }

    private static void gen_load_from_swap(StringBuilder result, String opmr)
    {
        gen_2ac(result, "move", SWAP_REG, opmr);
    }

    private void gen_cmp(StringBuilder result, Operand lhs, Operand rhs)
    {
        // Store the RHS in the swap reg, because RHS of CMP instruction is required to be a register
        gen_store_in_swap(result, get_opmrl(rhs));

        // Determine if we should use float or integer comparison
        if (lhs.is_int())
        {
            gen_2ac(result, "cmpi", get_opmrl(lhs), SWAP_REG);
        }
        else if (lhs.is_float())
        {
            gen_2ac(result, "cmpr", get_opmrl(lhs), SWAP_REG);
        }
        else
        {
            assert(false);
        }
    }

    private String get_opmrl(Operand operand)
    {
        if (operand.type == Operand.Type.INT_LIT || operand.type == Operand.Type.FLOAT_LIT)
        {
            return operand.value;
        }

        return get_opmr(operand);
    }

    private String get_opmr(Operand operand)
    {
        assert(!operand.is_lit());

        if (!_allocations.containsKey(operand.value))
        {
            String reg = "r" + _next_reg;
            _next_reg += 1;
            _allocations.put(operand.value, reg);
            _reg_variables.add(operand.value);
            return reg;
        }

        return _allocations.get(operand.value);
    }

    private boolean is_lit_or_reg(Operand operand)
    {
        return operand.is_lit() || _reg_variables.contains(operand.value);
    }

    private HashSet<String> _reg_variables = new HashSet<>();
    private HashMap<String, String> _allocations = new HashMap<>();
    private int _next_reg = 1; // r0 is reserved for swap
}
