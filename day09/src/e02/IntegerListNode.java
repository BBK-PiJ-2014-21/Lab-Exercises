package e02;// 2.3 Trees as sets - Implementation as list

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
		
	
		
		
