public class SimpleMapImpl implements SimpleMap {
	private Node head;
	private int size;
	
	public SimpleMapImpl() {
		head = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		if(size==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void put(int key, String name) {
		Node newNode = new Node(key, name);
		if(isEmpty()) {
			head = newNode;
			size++;
		} else {
			if(head.getKey()==key) {
				return;
			} else {
				Node aux = head;
				while(aux.getNext()!=null) {
					if(aux.getNext().getKey()==key) {
						return;
					}
				aux = aux.getNext();
				}
				aux.setNext(newNode);
				size++;
			}
		}
	}
	
	public String get(int key) {
		if(isEmpty()) {
			return null;
		} else if (head.getKey()==key) {
			return head.getName();
		} else {
			Node aux = head;
			while(aux.getNext()!=null) {
				if(aux.getNext().getKey()==key) {
					return aux.getNext().getName();
				}
				aux = aux.getNext();
			}
		}
		return null;
	}
	
	public void remove(int key) {
		if(isEmpty()) {
			return;
		} else if(head.getKey()==key) {
			size--;
			if(head.getNext()!=null) {
				head = head.getNext();
			} else {
				head = null;
			}
		} else {
			Node aux = head;
			while(aux.getNext()!=null) {
				if(aux.getNext().getKey()==key) {
					size--;
					aux.setNext(aux.getNext().getNext());
				} else {
					aux = aux.getNext();
				}
			}
		}
	}
	
}
	
	
	
	
	
	
