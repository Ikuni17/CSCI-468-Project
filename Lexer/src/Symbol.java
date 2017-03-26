/**
 * Created by Will on 3/26/2017.
 */
public class Symbol
{
    public Symbol(String type, String name)
    {
        _type = type;
        _name = name;
    }

    public Symbol(String type, String name, String value)
    {
        _type = type;
        _name = name;
        _value = value;
    }

    public String get_type()
    {
        return _type;
    }

    public String get_name()
    {
        return _name;
    }

    public String get_value()
    {
        return _value;
    }

    @Override
    public String toString()
    {
        return "name" + _name + " type " + _type + (_value != null ? " value " + _value : "");
    }

    private String _type;
    private String _name;
    private String _value;
}
