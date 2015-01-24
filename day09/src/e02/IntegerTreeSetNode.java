package e02;

import e01.IntegerTreeNode;

public class IntegerTreeSetNode extends IntegerTreeNode {

    public IntegerTreeSetNode(int value) {
        super(value);
    }
    /**
     * Typecast IntegerTreeNode into IntegerTreeSetNode
     * to use recursively containsVerbose() method
     * (which otherwise an IntegerTreeNode object cannot call)
     *
     * @return a left or right IntegerTreeSetNode typecasted from an IntegerTreeNode
     */
    @Override
    public IntegerTreeSetNode getRight() {
        return (IntegerTreeSetNode) this.getRight();
    }

    @Override
    public IntegerTreeSetNode getLeft() {
        return (IntegerTreeSetNode) this.getLeft();
    }
    /**
     * This method ignore an attempt to add a duplicate.
     *
     * @param value the integer to add
     */
    @Override
    public void add(int value) {
        if(value==this.getValue()) {
            return;
        } else if(value>this.getValue()) {
            if(this.getRight()==null) {
                setRight(new IntegerTreeNode(value));
            } else {
                getRight().add(value);
            }
        } else {
            if (getLeft() == null) {
                setLeft(new IntegerTreeNode(value));
            } else {
                getLeft().add(value);
            }
        }
    }

    public boolean containsVerbose(int n) {
        System.out.println(this.getValue());
        if(this.getValue()==n) {
            return true;
        } else if(n>this.getValue()) {
            if(this.getRight()==null) {
                return false;
            } else {
                return this.getRight().containsVerbose(n);
            }
        } else {
            if(this.getLeft()==null) {
                return false;
            } else {
                return this.getLeft().containsVerbose(n);
            }
        }
    }

    // TODO: override this method, should separate values by commas, not brackets (as per interface)
    public String toString() {
        return this.toStringSimplified();
    }

}	