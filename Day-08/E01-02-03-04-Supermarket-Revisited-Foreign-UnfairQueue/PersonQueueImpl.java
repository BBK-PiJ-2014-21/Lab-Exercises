// 1. Supermarket queue - implementation

public class PersonQueueImpl implements PersonQueue {
	Person last;
	
	public PersonQueueImpl() {
		last = null;
	}
	
	public void insert(Person newPerson) {	
		if(last==null) {
			last = newPerson;
		} else {
			Person aux = last;
			while(aux.getNext()!=null) {	// don't insert() duplicates
				if(aux.equals(newPerson)) {
					return;
				}
				aux = aux.getNext();
			}
			newPerson.setNext(last);
			last = newPerson;
		}
	}
	
	public Person retrieve() {
		if(last==null) {
			return null;
		} else {
			Person first = last;
			if(last.getNext()==null) {
				last = null;
				return first;
			} else {
				first = last.getNext();
				Person previous = last;
				while(first.getNext()!=null) {
					first = first.getNext();
					previous = previous.getNext();
				}
			previous.setNext(null);
			return first;
			}
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
			System.out.println(list + ". " + toPrint.getName() + ", " + toPrint.getAge());
		}
	}	
	
	public Person retrieveOldest() {	// 4.1 Unfair queue (*) Simple
		if(last==null) {
			return null;
		} else if(last.getNext()==null) {
			Person oldest = last;
			last = null;
			return oldest;
		} else {
			Person oldest = last;
			Person aux = last;
			while(aux.getNext()!=null) {
				if(aux.getAge()>=oldest.getAge()) {
					oldest = aux;
				}
				aux = aux.getNext();
			}
			Person previous = last;
			if(aux.getAge()>=oldest.getAge()) {	// the oldest is the last element
				while(!previous.getNext().equals(aux)) {
					previous = previous.getNext();
				}
				previous.setNext(null);
				return aux;
			}
			if(last.equals(oldest)) {	// the oldest is the first element
				last = oldest.getNext();
			} else {
				while(!previous.getNext().equals(oldest)) {
					previous = previous.getNext();
				}
				previous.setNext(oldest.getNext());
			}
		return oldest;	
		}
	}
	
	public Person retrieveOver(int age) {	// 4.1 Unfair queue (*) Clustered
		if(last==null) {
			return null;
		} else {
			Person oldest = null;
			if(last.getAge()>=age) {
				oldest = last;
			}
			Person aux = last;
			while(aux.getNext()!=null) {
				if(aux.getAge()>=age) {
					oldest = aux;
				}
				aux = aux.getNext();
			}
			Person previous = last;
			if(aux.getAge()>=age) {	// person to retrieve is the last element
				while(!previous.getNext().equals(aux)) {
					previous = previous.getNext();
				}
				previous.setNext(null);
				return aux;
			}
			if(oldest!=null) {
				if(last.equals(oldest)) {	// person to retrieve is the first element
					last = oldest.getNext();
				} else {
					while(!previous.getNext().equals(oldest)) {
						previous = previous.getNext();
					}
					previous.setNext(oldest.getNext());
				}
			}
		return oldest;	
		}
	}
	
	public Person retrieveClustered() {	// 4.1 Unfair queue (*) Clustered
		if(last==null) {
			return null;
		} else {
			Person aux = null;
			aux = retrieveOver(65);
			if(aux==null) {
				aux = retrieveOver(18);
			} 
			return aux;
		}
	}
			
		
}