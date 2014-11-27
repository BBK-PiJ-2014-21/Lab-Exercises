// 1. Integer Binary Tree

public class IntegerTreeNode {
	int value;
	IntegerTreeNode right;
	IntegerTreeNode left;
	
	
	public IntegerTreeNode(int value) {
		this.value = value;
		this.right = null;
		this.left = null;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void add(int newNumber) {
		if(newNumber>this.value) {
			if(right==null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if(left==null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) {
		if(n==this.value) {
			return true;
		} else if(n>this.value) {
				if(right==null) {
					return false;
				} else {
					return right.contains(n);
				} 
		} else {
			if(left==null) {
				return false;
			} else {
				return left.contains(value);
			}
		}
	}
	
	public int getMax() {
		if(this.right==null) {
			return this.value;
		} else {
			return right.getMax();
		}
	}
	
	public int getMin() {
		if(this.left==null) {
			return this.value;
		} else {
			return left.getMin();
		}
	}

	public String toString() {	// 1.2 Tree traversal
		String s = "";
		s = s + "[" + this.value + " ";
		s = s + "L";
		if(this.left!=null) {
			s = s + this.left.toString();
		}
		s = s + "[] ";
		s = s + "R";
		if(this.right!=null) {
			s = s + this.right.toString();
		} else {
			s = s + "[]";
		}
		s = s + "]";
		return s;
	}
	
	public String toStringSimplified() {	// 1.2 Tree traversal
		String s = "";
		s = s + "[" + this.value;
		if(this.left!=null) {
			s = s + " " + this.left.toStringSimplified();
		}
		if(this.right!=null) {
			s = s + " " + this.right.toStringSimplified();
		}
		s = s + "]";
		return s;
	}
		
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	