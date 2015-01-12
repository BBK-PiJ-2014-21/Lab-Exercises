package maps;// maps.Node class to use for maps.SimpleMapImpl

public class Node {
	private int key;
	private String name;
	private Node next;
	
	public Node(int key, String name) {
		this.key = key;
		this.name = name;
		next = null;
	}

	public int getKey() {
		return key;
	}
	
	public String getName() {
		return name;
	}
		
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}