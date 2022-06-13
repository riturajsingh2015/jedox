import java.util.*;
public class Composite implements Component{
    String name;  
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super();
        this.name=name;
    }

    public void addComponent(Component comp) {
        children.add(comp);
    }
    
    public String getName()
    {
        return this.name;
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder(50);
        printTree(buffer, "", "");
        return buffer.toString();
    }

    public void printTree(StringBuilder buffer, String prefix, String childPrefix)
    {   
        buffer.append(prefix);
        buffer.append(this.name);
        buffer.append("\n"); 
        for(Component c : children)
            c.printTree(buffer,childPrefix + "|--", childPrefix + "│   ");                       
    }
    
}
