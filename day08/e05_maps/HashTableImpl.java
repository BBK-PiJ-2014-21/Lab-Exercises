
public class HashTableImpl implements HashTable {
	private Node head;
	private int size;
	private String[] list;
	
	public HashTableImpl() {
		head = null;
		size = 0;
		list = new String[8];
	}
	
	public String put(int key, String name) {
		Node newNode = new Node(key, name);
		if(isEmpty()) {
			head = newNode;
		} else {
			Node aux = head;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			aux.setNext(newNode);
		}
		size++;
		return newNode.getName();
	}
	
	public String[] get(int key) {
		if(!isEmpty()) {
			int i=0;
			if(head.getKey()==key) {
				list[0] = head.getName();
				i++;
			}
			Node aux = head;
			while(aux.getNext()!=null) {
				if(aux.getNext().getKey()==key) {
					list[i] = aux.getNext().getName();
					i++;
				}
				if(list[list.length-1]!=null) {
					String[] temp = new String[list.length*2];
					for(int j=0; j<list.length-1; j++) {
						temp[j] = list[j];
					}
					list = temp;
				}
			}
		}
		if(list[0]==null) {
			return null;
		} else {
			return list;
		}			
	}
	
	public void remove(int key, String name){
		if(!isEmpty()) {
			if(head.getKey()==key && head.getName().equals(name)) {
				if(head.getNext()!=null) {
					head = head.getNext();
				} else {
					head = null;
				}
			} else {
				Node aux = head;
				while(aux.getNext()!=null) {
					if(aux.getNext().getKey()==key && aux.getNext().getName().equals(name)) {
						aux.setNext(aux.getNext().getNext());
					} else {
						aux = aux.getNext();
					}
				}
			}
		}
	}
	
	public boolean isEmpty() {
		return (size==0) ? true : false;
	}
	
}
