package e08_stacks;// 8. Stacks (*)

import e07_queues.IntegerNode;

public class IntStack {
	private IntegerNode first;
	private int size;
	
	public IntStack() {
		first = null;
		size = 0;
	}
	
	public void push(int value) {
		System.out.println("Pushing " + value + "...");
		if(first==null) {
			first = new IntegerNode(value);
		} else {
			e07_queues.IntegerNode newInt = new IntegerNode(value);
			newInt.setNext(first);
			first = newInt;
		}
		size++;
	}
	
	public void pop() {
		System.out.print("Popping... ");
		if(first==null) {
			System.out.println("failed. Stack is empty.");
			return;
		} else {
			System.out.println("it's a " + first.getValue());
			if(first.getNext()!=null) {
				first = first.getNext();
			} else {
				first = null;
			}
			size--;
		}
	}
			
	public boolean empty() {
		if(size==0) {
			return true;
		} else {
			return false;
		}
	}
	
}