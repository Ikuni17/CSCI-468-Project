import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Will on 4/24/2017.
 */
public class IRGenerator
{
    public IRGenerator()
    {
        label_stack = new Stack<>();
        expr_instructions = new Stack<>();
        instructions = new ArrayList<>();
        next_temp = 1;
    }

    public Operand allocate_temporary()
    {
        Operand result = Operand.temp_operand("$T" + next_temp, null);
        next_temp += 1;
        return result;
    }

    public IRInstruction add_instruction()
    {
        IRInstruction result = new IRInstruction();
        instructions.add(result);
        return result;
    }

    public IRInstruction push_instruction()
    {
        IRInstruction top = new IRInstruction();
        expr_instructions.push(top);
        return top;
    }

    public IRInstruction top_instruction()
    {
        if (!expr_instructions.empty())
        {
            return expr_instructions.peek();
        }
        else
        {
            return null;
        }
    }

    public IRInstruction pop()
    {
        if (!expr_instructions.empty())
        {
            IRInstruction top = expr_instructions.pop();
            instructions.add(top);
            return top;
        }
        else
        {
            return null;
        }
    }

    public void push_label(String label)
    {
        label_stack.push(label);
    }

    public String pop_label()
    {
        return label_stack.pop();
    }

    public String top_label()
    {
        return label_stack.peek();
    }

    public Stack<String> label_stack;
    public Stack<IRInstruction> expr_instructions;
    public ArrayList<IRInstruction> instructions;
    public int next_temp;
}
