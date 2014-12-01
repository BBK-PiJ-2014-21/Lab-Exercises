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
			newPerson.setNext(last);
			last = newPerson;
		}
	}
	
	public Person retrieve() {
		if(last==null) {
			return last;
		} else {
			Person aux = last;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			Person p = aux.getPerson();
			Person previous = last;
			while(previous.getNext()!=aux) {
				previous = previous.getNext();
				// 	NOT WORKING, MAKE A COPY_DETAILS() METHOD
			}

			previous.setNext(null);
		}
		return p;
	}
	
}