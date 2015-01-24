package e02;

public class IntegerTreeSetNode {
    private int value;
    private IntegerTreeSetNode right;
    private IntegerTreeSetNode left;
    
    public IntegerTreeSetNode(int value) {
        this.value = value;
        right = null;
        left = null;
    }
  
    public int getValue() {
        return value;
    }
    
    public IntegerTreeSetNode getRight() {
        return right;
    }
            
    public IntegerTreeSetNode getLeft() {
        return left;
    }
    
    public void setRight(IntegerTreeSetNode newNode) {
        this.right = newNode;
    }
    
    public void setLeft(IntegerTreeSetNode newNode) {
        this.left = newNode;
    }
    
    public void add(int value) {
        if(value==this.getValue()) {
            return;
        } else if(value>this.getValue()) {
            if(this.getRight()==null) {
                setRight(new IntegerTreeSetNode(value));
                return;
            } else {
                getRight().add(value);
            }
        } else {
            if (getLeft() == null) {
                setLeft(new IntegerTreeSetNode(value));
                return;
            } else {
                getLeft().add(value);
            }
        }
    }

    public boolean contains(int n) {
        if(this.getValue()==n) {
            return true;
        } else if(n>this.getValue()) {
            if(this.getRight()==null) {
                return false;
            } else {
                return this.getRight().contains(n);
            }
        } else {
            if(this.getLeft()==null) {
                return false;
            } else {
                return this.getLeft().contains(n);
            }
        }
    }
    
    public boolean containsVerbose(int n) {
       System.out.println(this.getValue()); 
       if(this.getValue()==n) {
           return true;
       } else if(this.getValue() < n) {
           if (this.getRight() == null) {
               return false;
           } else {
               return this.getRight().containsVerbose(n);
           }
       } else {
           if(this.getLeft() == null) {
               return false;
           } else {
               return this.getLeft().containsVerbose(n);
           }
       }
    }
    
    public String toString() {
        String s = this.getValue() + "";
        if(this.getLeft()!=null) {
            s = s + ", " + this.getLeft().toString();
        } if(this.getRight()!=null) {
            s = s + ", " + this.getRight().toString();
        }
        return s;
    }

}	