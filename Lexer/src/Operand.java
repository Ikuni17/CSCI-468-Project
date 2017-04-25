/**
 * Created by Will on 4/24/2017.
 */
public class Operand
{
    public enum Type
    {
        INT_VAR,
        FLOAT_VAR,
        STRING_VAR,
        INT_LIT,
        FLOAT_LIT,
        LABEL
    }

    public static Operand symbol_operand(Symbol symbol)
    {
        Operand result = new Operand();
        result.value = symbol.get_name();

        if (symbol.get_type().equals("INT"))
        {
            result.type = Type.INT_VAR;
        }
        else if (symbol.get_type().equals("FLOAT"))
        {
            result.type = Type.FLOAT_VAR;
        }
        else if (symbol.get_type().equals("STRING"))
        {
            result.type = Type.STRING_VAR;
        }

        return result;
    }

    public static Operand temp_operand(String name, Type type)
    {
        Operand result = new Operand();
        result.value = name;
        result.type = type;
        return result;
    }

    public static Operand label_operand(String name)
    {
        Operand result = new Operand();
        result.type = Type.LABEL;
        result.value = name;
        return result;
    }

    @Override
    public String toString()
    {
        return value;
    }

    public static Operand int_lit_operand(String value)
    {
        Operand result = new Operand();
        result.type = Type.INT_LIT;
        result.value = value;
        return result;
    }

    public static Operand float_lit_operand(String value)
    {
        Operand result = new Operand();
        result.type = Type.FLOAT_LIT;
        result.value = value;
        return result;
    }

    public boolean is_int()
    {
        return type == Type.INT_LIT || type == Type.INT_VAR;
    }

    public boolean is_float()
    {
        return type == Type.FLOAT_VAR || type == Type.FLOAT_LIT;
    }

    public boolean is_lit()
    {
        return type == Type.INT_LIT || type == Type.FLOAT_LIT;
    }

    public Type type;
    public String value;
}
