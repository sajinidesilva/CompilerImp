package symbols;

/**
 * Created with IntelliJ IDEA.
 * User: harsha
 * Date: 9/26/13
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Symbol{
    private String name;
    private Object value;
    private String type;

    public Symbol(String name) {
      this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
