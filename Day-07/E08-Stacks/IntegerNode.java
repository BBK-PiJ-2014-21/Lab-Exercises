// 8. Stacks (*)

public class IntegerNode {
	private int value;
	private IntegerNode next;
	
	public IntegerNode(int value) {
		this.value = value;
		this.next = null;
	}
	
	public IntegerNode getNext() {
		return this.next;
	}
	
	public void setNext(IntegerNode node) {
		this.next = node;
	}
	
	public int getValue() {
		return this.value;
	}

}