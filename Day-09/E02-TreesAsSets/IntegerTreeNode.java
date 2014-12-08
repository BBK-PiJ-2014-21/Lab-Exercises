// 2.2 Trees as sets - Implementation as tree

public class IntegerTreeNode {
	int value;
	IntegerTreeNode right;
	IntegerTreeNode left;
	
	public IntegerTreeNode(int value) {
		this.value = value;
		this.right = null;
		this.left = null;
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
	
	public boolean containsVerbose(int n) {
		System.out.println(this.value);
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
	
	public String toString() {
		String s = "";
		s = s + this.value;
		if(this.left!=null) {
			s = s + ", " + this.left.toString();
		}
		if(this.right!=null) {
			s = s + ", " + this.right.toString();
		}
		return s;
	}
	
}