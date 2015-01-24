package treesAsSets;

public class TreeIntSet implements IntSet {
    private IntegerTreeSetNode first;
    
	public TreeIntSet() {
		first = null;
	}

    public void add(int value) {
        if(first==null) {
            first = new IntegerTreeSetNode(value);
        } else {
            first.add(value);
        }
    }

    public boolean contains(int value) {
        if(first==null) {
            return false;
        } else {
            return first.contains(value);
        }
    }
    
    public boolean containsVerbose(int value) {
        if(first==null) {
            return false;
        } else {
            return first.containsVerbose(value);
        }
    }

    public String toString() {
        if (first == null) {
            return "<The list is empty>";
        } else {
            return first.toString();
        }
    }
		
}	