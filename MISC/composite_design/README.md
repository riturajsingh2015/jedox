## Composite Design Pattern Example

Source : [Composite Design Pattern](https://stacktraceguru.com/composite-design-pattern/)

Composite design pattern in java is one of the  structural design patterns.

From the name, "Composite" means the combination or made from different parts. So this pattern provides solution to operate group of objects and single object in similar way.

- Objects can be represented in a tree structure hierarchy

- Composite and individual objects are treated uniformly

Most common example can be file-directory structure. As shown in image. Node can be a directory or a file.

![Directory Structure](https://stacktraceguru.com/wp-content/uploads/2020/03/composite-design-pattern-directory-structure-1.png)

### Composite design pattern structure

The image shows the basic structure of the composite design pattern.
There are 2 types of objects Composite object and Leaf object.
![Directory Structure](https://stacktraceguru.com/wp-content/uploads/2020/03/composite-design-pattern-structure-1.png)

1. **Composite Object** : It is an object which contains other object. This has children e.g: Directory(file folder)
2. **Leaf Object** : It is a single object. It does not have children e.g: File

### Steps to implement composite design Pattern

1. We need to define leaf and composite objects as same data type, by implementing interface or extending class
2. Then write(implement) common method in all the leaf and composite objects
3. In Leaf node perform their own desired behavior
4. In Composite object write customized function or each child of this node can call this function

### UML diagram

![UML](https://stacktraceguru.com/wp-content/uploads/2020/03/Composite-design-pattern-java-Class-Diagram-1.png)

As shown in the image we will create interface for "File". Then we will have two different classes. One for Directory type and second for other than directory like .txt, .doc, etc

- The Directory class is composite class that can contain other files or directories

### Implementing the Composite Design Pattern Example
Let's implement the example for file directory structure. We will create child1.txt and child2.txt files.
Then we will have root directories. Root directories will contain child1.txt and child2.txt files.
Then we will try to get size of child1.txt and root directory.

1. As explained in step 1 lets create parent type as File interface [`File.java`](./File.java)
2. Now lets create classes for file [`TextFile.java`](./TextFile.java) and directory type [`Directory.java`](./Directory.java)
3. Now we have implemented two leaf and one composite object. Both objects are of same time 'File'. We can use getSize() on TextFile class or Direcotry class.

4. Now let's test the code using main method.[`Application.java`](./Application.java)