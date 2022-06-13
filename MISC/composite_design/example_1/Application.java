public class Application {

    public static void main(String[] args) {
        TextFile child1 = new TextFile(100L);
        TextFile child2 = new TextFile(200L);

        Directory root = new Directory();
        root.addFile(child1);
        root.addFile(child2);

        System.out.println(child1.getSize()); // output : 100
        System.out.println(root.getSize()); // output : 300
    }
}