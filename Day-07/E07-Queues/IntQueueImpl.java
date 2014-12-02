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
		count++;
		IntegerNode newInt = new IntegerNode(n);
		if(first==null) {
			first = newInt;
		} else {
			newInt.setNext(first);
			first = newInt;
		}
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
				System.out.println("failed. Different request at the end of the queue.");
				return;
			}
		} else {
			IntegerNode aux = first;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			if(aux.getValue()!=n) {
				System.out.println("failed. Different request at the end of the queue.");
				return;
			} else {
				if(first.getNext()!=null) {
					IntegerNode previous = first;
					while(previous.getNext()!=aux) {
						previous = previous.getNext();
					}
					previous.setNext(null);
					System.out.println("done.");
				}
			}
		}
		count--;
	}
	
	public int size() {
		return count;
	}
	
	public void printSize() {
		if(count!=1) {
			System.out.println("There are " + count + " requests in the queue.");
		} else {
			System.out.println("There is " + count + " request in the queue.");
		}
	}
	
}