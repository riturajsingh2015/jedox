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

    public void printName()
    {
        System.out.println("\t"+this.name);
    }


}
