package utils;

import java.util.ArrayList;
import java.util.List;



public class Tree implements Component{

    private String text;
    private List<Component> children = new ArrayList<>();

    public Tree(String text) {
    	super();
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void addComponent(Component comp) {
        children.add(comp);
    }


    public Tree searchChildren(Tree node) //search a node in list of children of the parent
    {
    	Tree found_node=null;
    	for(Component c : this.children)
    	{
    		Tree t = (Tree) c;
    		if(t.equals(node))
    			found_node=t; // return the node already present
    	}
    	return found_node;
    	
    }




    @Override
    public boolean equals(Object o) {
        Tree c = (Tree) o;
        return this.text.equals(c.getText());
    }

	@Override
    public String toString() {
        //return text + ":" + children;
		StringBuilder buffer = new StringBuilder(50);
        printTree(buffer, "", "");
        return buffer.toString();		
    }

	@Override
	public void printTree(StringBuilder buffer, String prefix, String childPrefix) {
		// TODO Auto-generated method stub
		 buffer.append(prefix);
	     buffer.append(this.text);
	     buffer.append("\n"); 
	     for(Component c : children)
	    	 c.printTree(buffer,childPrefix + "|--", childPrefix + "   ");        
	}


}