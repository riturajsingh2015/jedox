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

    public void printName()
    {
        System.out.println(this.name);
        for(Component c : children)
            c.printName();
    }

    
    ///////////////Comment added in Composite.java
    
}
