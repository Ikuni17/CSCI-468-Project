/**
 * Created by Will on 4/24/2017.
 */
public class IRInstruction
{
    public enum OP
    {
        ADDI,
        ADDF,
        SUBI,
        SUBF,
        MULTI,
        MULTF,
        DIVI,
        DIVF,
        STOREI,
        STOREF,
        GT,
        GE,
        LT,
        LE,
        NE,
        EQ,
        JUMP,
        LABEL,
        READI,
        READF,
        WRITEI,
        WRITEF,
        WRITES,
        UNDETERMINED_RESERVED,
    }

    @Override
    public String toString()
    {
        String str = op.toString();
        if (operand_1 != null)
        {
            str += " " + operand_1;
        }
        if (operand_2 != null)
        {
            str += " " + operand_2;
        }

        return str + " " + result;
    }

    public OP op = null;
    public Operand operand_1 = null;
    public Operand operand_2 = null;
    public Operand result = null;
}
