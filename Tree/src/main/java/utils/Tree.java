package utils;

import java.util.ArrayList;
import java.util.List;



public class Tree {

    private String text;
    private List<Tree> children = new ArrayList<>();

    public Tree(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }



    public Tree search(Tree node) //search a node in list of children of the parent
    {
    	Tree found_node=null;
    	for( Tree t : this.children)
    		if(t.equals(node))
    			found_node=t; // return the node already present
    	return found_node;
    	
    }

    public List<Tree> getChildren() {
        return children;
    }


    @Override
    public boolean equals(Object o) {
        Tree c = (Tree) o;
        return this.text.equals(c.getText());
    }

	@Override
    public String toString() {
        return text + ":" + children;
    }


}