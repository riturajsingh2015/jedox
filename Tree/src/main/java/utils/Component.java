package utils;

public interface Component {
	public String getText();
    public void printTree(StringBuilder buffer, String prefix, String childPrefix);
}
