// 1. Supermarket queue

public class Supermarket {
//	PersonQueueLinkedListImpl q = new PersonQueueLinkedListImpl();	// 1st implementation test
	PersonQueuePriorityListImpl q = new PersonQueuePriorityListImpl();	// 2nd implementation test
	
	public void addPerson(Person newPerson) {
		q.insert(newPerson);
	}
	
	public void servePerson() {
		q.retrieve();
	}
	
	public void printList() {
		q.printList();
	}

}