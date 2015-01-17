package e08_stacks;// 8. Stacks (*)

public class IntegerNode {
	private int value;
	private e07_queues.IntegerNode next;
	
	public IntegerNode(int value) {
		this.value = value;
		this.next = null;
	}
	
	public e07_queues.IntegerNode getNext() {
		return this.next;
	}
	
	public void setNext(e07_queues.IntegerNode node) {
		this.next = node;
	}
	
	public int getValue() {
		return this.value;
	}

}