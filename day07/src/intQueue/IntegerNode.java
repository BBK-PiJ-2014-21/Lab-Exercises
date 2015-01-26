package intQueue;// 07. Queues (*)

public class IntegerNode {
	int value;
	IntegerNode next;
	IntegerNode previous;
	
	public IntegerNode(int n) {
		this.value = n;
		this.next = null;
		this.previous = null;
	}
	
	public IntegerNode getNext() {
		return this.next;
	}
	
	public void setNext(IntegerNode next) {
		this.next = next;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int n) {
		this.value = n;
	}
	
}
	
	