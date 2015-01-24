package e02;

public class IntegerListNode {
	private int value;
	private IntegerListNode next;
	
	public IntegerListNode(int value) {
		this.value = value;
		this.next = null;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public IntegerListNode getNext() {
		return this.next;
	}
	
	public void setNext(IntegerListNode node) {
		this.next = node;
	}

}
		
	
		
		
