package queues;

public class PersonQueueLinkedListImpl implements PersonQueue {
	Person last;
	
	public PersonQueueLinkedListImpl() {
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
		} else if(last.getNext()==null) {
			Person copy = last;
			last = null;
			return copy;
		} else {
			Person second = last;
			Person first = last.getNext();
			while(first.getNext()!=null) {
				first = first.getNext();
				second = second.getNext();
			}
			second.setNext(null);
			return first;
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