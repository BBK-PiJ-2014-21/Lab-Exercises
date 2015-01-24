package sortedLists;// 9. From array to list

public class IntNode {
	private int value;
	private IntNode next;
	
	public IntNode(int value) {
		this.value = value;
		this.next = null;
	}
	
	public IntNode getNext() {
		return this.next;
	}
	
	public void setNext(IntNode node) {
		this.next = node;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
}
		
		