import org.antlr.v4.misc.OrderedHashMap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Will on 3/26/2017.
 */
public class SymbolTable
{
    public SymbolTable(SymbolTable parent, String scope_name)
    {
        _parent = parent;
        _children = new ArrayList<>();
        _scope_name = scope_name;
        _symbols = new OrderedHashMap<>();

        if (parent != null)
        {
            parent._children.add(this);
        }
    }

    public SymbolTable get_parent()
    {
        return _parent;
    }

    public Symbol find(String name)
    {
        Symbol result = _symbols.get(name);
        if (result != null)
        {
            return result;
        }
        else if (_parent != null)
        {
            return _parent.find(name);
        }

        return null;
    }

    public void add(String name, Symbol symbol) throws IllegalArgumentException
    {
        if (_symbols.containsKey(name))
        {
            throw new IllegalArgumentException("DECLARATION ERROR " + name);
        }

        assert(name != null && symbol != null);
        _symbols.put(name, symbol);
    }

    @Override
    public String toString()
    {
        String result = "Symbol table " + _scope_name;
        for (Symbol entry : _symbols.values())
        {
            result += "\n" + entry.toString();
        }

        for (SymbolTable child : _children)
        {
            result += "\n\n" + child.toString();
        }

        return result;
    }

    private SymbolTable _parent;
    private ArrayList<SymbolTable> _children;
    private String _scope_name;
    private OrderedHashMap<String, Symbol> _symbols;
}
