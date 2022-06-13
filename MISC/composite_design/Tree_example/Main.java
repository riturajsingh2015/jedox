public class Main {
    public static void main(String[] args) {
        Leaf child1 = new Leaf("Leaf1");
        Leaf child2 = new Leaf("Leaf2");
        Leaf child3 = new Leaf("Leaf3");
        Leaf child4 = new Leaf("Leaf4");
        Leaf child5 = new Leaf("Leaf5");


        Composite root = new Composite("Root");

        Composite composite1 = new Composite("Composite1");
        Composite composite2 = new Composite("Composite2");
        Composite composite3 = new Composite("Composite3");
        
        composite3.addComponent(child4);
        composite3.addComponent(child5);

        
        composite1.addComponent(child1);
        composite1.addComponent(composite3);
        composite2.addComponent(child2);
        composite2.addComponent(child3);
        
        

        root.addComponent(composite1);
        root.addComponent(composite2);
        
         
        root.printName(); 
    }
}
