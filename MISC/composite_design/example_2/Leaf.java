public class Leaf implements Component{
    String name;
    public Leaf(String name) {
        super();
        this.name=name;
    }
    
    public String getName()
    {
        return this.name;
    }

    public void printTree(StringBuilder buffer, String prefix, String childPrefix)
    {
     buffer.append(prefix+this.name+"\n");        
    }


}
