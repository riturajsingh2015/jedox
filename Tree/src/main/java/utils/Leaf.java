package utils;

public class Leaf implements Component {

	String text;
    public Leaf(String text) {
        super();
        this.text=text;
    }
	
	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return this.text;
	}

	@Override
	public void printTree(StringBuilder buffer, String prefix, String childPrefix) {
		// TODO Auto-generated method stub
		buffer.append(prefix+this.text+"\n");     
	}

}
