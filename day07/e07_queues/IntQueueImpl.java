// 07. Queues (*)

public class IntQueueImpl {
	private int count;
	private IntegerNode first;

	public IntQueueImpl() {
		count = 0;
		first = null;
	}
	
	public void insert(int n) {
		System.out.println("Inserting request " + n + "...");
		IntegerNode newInt = new IntegerNode(n);
		if(first==null) {
			first = newInt;
		} else {
			IntegerNode search = first;
			while(search.getNext()!=null) {
				if(search.getNext().getValue()==n) {
					System.out.println("Request " + n + " is already in the queue.");
					return;
				}
				search = search.getNext();
			}
			newInt.setNext(first);
			first = newInt;
		}
		count++;
	}
	
	public void retrieve(int n) {
		System.out.print("Retrieving request " + n + "... ");
		if(first==null) {
			System.out.println("failed. The queue is empty.");
			return;
		} else if(first.getNext()==null) {
			if(first.getValue()==n) {
				System.out.println("done.");
				first = null;
			} else {
				System.out.println("failed. Different request at the head of the queue.");
				return;
			}
		} else {
			IntegerNode aux = first;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			if(aux.getValue()!=n) {
				System.out.println("failed. Different request at the head of the queue.");
				return;
			} else {
				IntegerNode previous = first;
				while(previous.getNext()!=aux) {
					previous = previous.getNext();
				}
				previous.setNext(null);
				System.out.println("done.");
			}
		}
		count--;
	}
	
	public int getSize() {
		return count;
	}
	
	public void printSize() {
		if(count!=1) {
			System.out.println("There are " + getSize() + " requests in the queue.");
		} else {
			System.out.println("There is " + getSize() + " request in the queue.");
		}
	}
	
}