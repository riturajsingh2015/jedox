## Composite Design Pattern Example

Source : [Composite Design Patter](https://stacktraceguru.com/composite-design-pattern/)

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