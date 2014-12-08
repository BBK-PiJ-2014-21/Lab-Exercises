// 3.2 Implementation as tree

public class TreeIntSortedList implements IntSortedList {
	private IntegerTreeNode node;
	
	public class IntegerTreeNode {
		int value;
		IntegerTreeNode right;
		IntegerTreeNode left;
		
		public IntegerTreeNode(int n) {
			this.value = n;
			this.right = null;
			this.left = null;
		}
	}
	
	public TreeIntSortedList(int n) {
		node.value = n;
		node.right = null;
		node.left = null;
	}

	public void add(int n) {
		if(n>this.node.value) {
			if(this.node.right==null) {
				this.node.right = new IntegerTreeNode(n);
			} else {
				this.node.right.add(n);
			}
		} else {
			if(this.node.left==null) {
				this.node.left = new IntegerTreeNode(n);
			} else {
				this.node.left.add(n);
			}
		}
	}
	
	public boolean contains(int n) {
		if(this.node.value==n) {
			return true;
		} else {
			if(n>this.node.value) {
				if(this.node.right==null) {
					return false;
				} else return this.node.right.contains(n);
			} else {
				if(this.node.left==null) {
					return false;
				} else return this.node.left.contains(n);
			}
		}
	}
	
	public String toString() {
		
	}
	

	
}
	