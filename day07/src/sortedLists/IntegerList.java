package sortedLists;

// 9. From array to list

public class IntegerList {
	private IntNode first;
	private int size;
	
	public IntegerList() {
		first = null;
		size = 0;
	}
	
    public IntNode getFirst() {
        return first;
    }
    
	public void add(int value) {	// add the value at the end of the list
		IntNode newNode = new IntNode(value);
		if(first==null) {
			first = newNode;
		} else {
			IntNode last = first;
			while(last.getNext()!=null) {
				last = last.getNext();
			}
			last.setNext(newNode);
		}
        size++;
	}
	
	public void push(int value) {	// push the value at the beginning of the list
		IntNode newNode = new IntNode(value);
		if(first==null) {
			first = newNode;
		} else {
			newNode.setNext(first);
			first = newNode;
		}
        size++;
	}
	
	public void insert(int value) {	// 10. A sorted list (insert the value towards the beginning if smaller,
		IntNode newNode = new IntNode(value);		// towards the end if larger, keeping the list sorted
		size++;
        if(first==null) {							
			first = newNode;
		} else if(first.getValue()>newNode.getValue()) {
			newNode.setNext(first);
			first = newNode;
		} else if(first.getNext()==null) {
			first.setNext(newNode);
		} else {
			IntNode aux = first.getNext();
			IntNode previous = first;
			while(aux.getValue()<=value) {
				if(aux.getNext()==null) {
					aux.setNext(newNode);
					return;
				} else {
					aux = aux.getNext();
					previous = previous.getNext();
				}
			}
			newNode.setNext(aux);
			previous.setNext(newNode);
		}
	}
	
    public int size() {
        return size;
    }
    
	public void prettyPrint() {
		if(first==null) {
			System.out.println("The list is empty.");
		} else {
			IntNode aux = first;
			System.out.println("LIST:");
			System.out.println(aux.getValue());
			while(aux.getNext()!=null) {
				aux = aux.getNext();
				System.out.println(aux.getValue());
			}
		}
	}
		
}			