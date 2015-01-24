// 1. Integer Binary Tree

package e01;

public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode right;
	private IntegerTreeNode left;
	
	
	public IntegerTreeNode(int value) {
		this.value = value;
		this.right = null;
		this.left = null;
	}
	
	public int getValue() {
		return this.value;
	}
	
    public IntegerTreeNode getRight() {
        return right;
    }
    
    public void setRight(IntegerTreeNode newNode) {
        right = newNode;
    }
    
    public IntegerTreeNode getLeft() {
        return left;
    }
    
    public void setLeft(IntegerTreeNode newNode) {
        left = newNode;
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
	
	public int getMax() {	// 1.1 First steps: add and seek
		if(this.right==null) {
			return this.value;
		} else {
			return right.getMax();
		}
	}
	
	public int getMin() {	// 1.1 First steps: add and seek
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
	
	public int depth() {	// 1.3 Depth
		int left = 0;
		int right = 0;
		if(this.left!=null) {
			left = 1 + this.left.depth();
		}
		if(this.right!=null) {
			right = 1 + this.right.depth();
		}
		if(right>=left) {
			return right;
		} else return left;
	}
	
	public void remove(int n) {	// 1.4 Deletion of elements (*)
		if(this.right==null && this.left==null) {
			return;
		} else if(this.right!=null && n>this.right.value) {
			this.right.remove(n);
		} else if(this.right==null && n>this.left.value) {
			return;
		} else if(this.left!=null && n<this.left.value) {
			this.left.remove(n);
		} else if(this.left==null && n<this.right.value) {
			return;
		} else if(n==this.left.value) {
			if(this.left.left!=null) {
				this.left.value = this.left.left.value;
				this.left.remove(this.left.left.value);
			} else if(this.left.right!=null) {
				this.left.value = this.left.right.value;
				this.left.remove(this.left.right.value);
			} else {
				this.left = null;		
				return;
			}
		} else if(n==this.right.value) {
			if(this.right.left!=null) {
				this.right.value = this.right.left.value;
				this.right.remove(this.right.left.value);
			} else if(this.right.right!=null) {
				this.right.value = this.right.right.value;
				this.right.remove(this.right.right.value);
			} else {
				this.right = null;
				return;
			}
		}
	}

}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	