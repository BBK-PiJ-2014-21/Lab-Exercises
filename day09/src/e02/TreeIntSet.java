package e02;

/**
 * This class doesn't have a separated node class, it inherits directly
 * from {@see IntegerTreeNode} its properties as a Node and most methods
 * (already done in the previous exercise - package e01) which implements {@see IntSet}
 */
public class TreeIntSet implements IntSet {
    private IntegerTreeSetNode first;
    
	public TreeIntSet() {
		first = null;
	}

    @Override
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
        
    // TODO: override this method, should separate values by commas, not brackets (as per interface)
    public String toString() {
        return first.toStringSimplified();
    }
		
}	