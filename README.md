# Datasource to Tree

The goal of this homework is to read an excel datasource and convert it to **Tree** datastructure.
The source code is written in Java 

## About the Project
`Tree` is the project folder used which contains all the required files and dependencies as a maven project.
- Eclipse was used to build the project


- [`pom.xml`](./Tree/pom.xml) contains all the dependencies for the maven project
- [`data`](./Tree/data) folder contains our Excel file `Book1.xlsx` used as datasource
- [`Main.java`](./Tree/src/main/java/utils/Main.java) the Entry point to our project
- [`Parser.java`](./Tree/src/main/java/utils/Parser.java) contains a parser to parse  `Book1.xlsx` 
- `Parser.java` also contains a `parse` method to get Tree as output

## Implementation with Composite Design Pattern
We used Composite Design pattern

- It uses [`Component.java`](./Tree/src/main/java/utils/Component.java) as it an interface which provides the requirement specifications
- The [`Leaf.java`](./Tree/src/main/java/utils/Leaf.java) and [`Tree.java`](./Tree/src/main/java/utils/Tree.java) implement `Component.java`
- Both `Leaf.java` and `Tree.java` overide the same method `printTree`
- Hence when calling using `printTree` gives a feel viz similar to recursion

- `Tree.java` contains implementation of Tree class with corresponding methods

### About Parser.java

- Contains a variable `rows` which denotes how many rows of `Book1.xlsx` you want to scan
- After every node insertion you need to give integer as input. This was done to hold the check the output on console

- Important Code Snippet which inserts a new node in the Tree.

```bash
        for(int i=1; i < rows ; i++) { 
        	Tree pointer=root;
        	for(int j=cols-1; j >= 0 ; j--) {
        		Tree child= new Tree(array[i][j]);
        		Tree child_present=pointer.searchChildren(child);
        		if (child_present==null)
        			pointer.addComponent(child);
        		
        		//update the pointer
        		pointer=pointer.searchChildren(child);
        		
        		System.out.println(root);
                keyboard.nextInt();
            }

        	System.out.println("_____________________________________________");
        }

```

### Output

The `printTree` method helps us in printing the nodes of the Tree as show below in the output
![Output](./Tree/Output.jpg)
