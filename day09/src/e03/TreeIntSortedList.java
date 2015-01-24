package e03;

import e01.IntegerTreeNode;
/**
 * This implementation re-use the code in package e01 (IntegerTreeNode class)
 * as all the methods were already implemented recursively on that class
 * (which is used here as the node). Duplicates are added towards the left branch.
 */
public class TreeIntSortedList implements IntSortedList {
	private IntegerTreeNode node;

	public TreeIntSortedList() {
		node = null;
	}

	public void add(int n) {
        if (node == null) {
            node = new IntegerTreeNode(n);
        } else {
            node.add(n);
        }
    }
	
	public boolean contains(int n) {
        if (node == null) {
            return false;
        } else {
            return node.contains(n);
        }
    }

//TODO: override to print by commas instead of brackets (create subclass of e02_IntegerTreeSetNode and override add())
//      (if possible without modifying IntegerTreeNode)
    public String toString() {
        if(node==null) {
            return "<The list is empty>";
        } else {
            return node.toStringSimplified();
        }
	}
    
}
	