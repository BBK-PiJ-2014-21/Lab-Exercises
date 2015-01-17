package queues;

public class PersonQueueOldestImpl implements PersonQueue {
	private Person last;
	
	public PersonQueueOldestImpl() {
		last = null;
	}
	
	public void insert(Person newPerson) {
		if(last==null) {
			last = newPerson;
		} else {
			newPerson.setNext(last);
			last = newPerson;
		}
	}

	public Person retrieve() {
		if(last==null) {
			return null;
		} else {
			Person oldest = last;
			if(last.getNext()==null) {
				last = null;
			} else {
				Person aux = last;
				while(aux.getNext()!=null) {
					if(aux.getAge()>=oldest.getAge()) {
						oldest = aux;
					}
					aux = aux.getNext();
				}
				
				if(aux.getAge()>=oldest.getAge()) {	// oldest is the last element
					while(!oldest.getNext().equals(aux)) {
						oldest = oldest.getNext();
					}
					oldest.setNext(null);
					return aux;
				} else if(oldest.equals(last)) {	// oldest is the first element
					last = oldest.getNext();
				} else {
					aux = last;
					while(!aux.getNext().equals(oldest)) {
						aux = aux.getNext();
					} 
					aux.setNext(aux.getNext().getNext());
				}
			}
		return oldest;
		}
	}
		
	public void printList() {
		if(last==null) {
			System.out.println("The queue is empty");
			return;
		} else {
			Person toPrint = last;
			while(toPrint.getNext()!=null) {
				toPrint = toPrint.getNext();
			}
			Person previous = last;
			int list = 1;
			while(true) {
				if(last.equals(toPrint)) {
					System.out.println(list + ". " + toPrint.getName() + ", " + toPrint.getAge());					
					break;
				}
				while(!previous.getNext().equals(toPrint)) {
					previous = previous.getNext();
				}
				System.out.println(list + ". " + toPrint.getName() + ", " + toPrint.getAge());
				list++;
				toPrint = previous;
				previous = last;
			}
		}		
	}

}
