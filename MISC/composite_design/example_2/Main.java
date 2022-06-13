public class Main {
    public static void main(String[] args) {

        
        Leaf child1 = new Leaf("L1");
        Leaf child2 = new Leaf("L2");
        Leaf child3 = new Leaf("L3");
        Leaf child4 = new Leaf("L4");
        Leaf child5 = new Leaf("L5");
        Leaf child6 = new Leaf("L6");
        Leaf child7 = new Leaf("L7");
        Leaf child8 = new Leaf("L8");



        Composite root = new Composite("Root");

        Composite composite1 = new Composite("C1");
        Composite composite2 = new Composite("C2");
        Composite composite3 = new Composite("C3");
        Composite composite4 = new Composite("C4");
        
        composite3.addComponent(child4);
        composite3.addComponent(child5);

        composite4.addComponent(child6);
        composite4.addComponent(child7);
        composite4.addComponent(child8);
        
        composite1.addComponent(child1);
        composite1.addComponent(composite3);
        composite2.addComponent(composite4);
        composite2.addComponent(child2);
        composite2.addComponent(child3);
        
        
        

        root.addComponent(composite1);
        root.addComponent(composite2);
        
        
        
        System.out.print(root);
        System.out.println();
        

        
        
    }
}
