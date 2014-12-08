// 2.2 Trees as sets - Implementation as tree

public class TreeIntSet implements IntSet {
	private IntegerTreeNode first;
	
	public TreeIntSet() {
		first = null;
	}
	
	public void add(int n) {
		if(first==null) {
			first = new IntegerTreeNode(n);
		} else {
			first.add(n);
		}
	}
	
	public boolean contains(int n) {
		if(first==null) {
			return false;
		} else {
			return first.contains(n);
		}
	}
	
	public boolean containsVerbose(int n) {
		if(first==null) {
			return false;
		} else {
			return first.containsVerbose(n);
		}
	}
	
	public String toString() {
		if(first==null) {
			return "";
		} else {
			return first.toString();
		}
	}
		
}	