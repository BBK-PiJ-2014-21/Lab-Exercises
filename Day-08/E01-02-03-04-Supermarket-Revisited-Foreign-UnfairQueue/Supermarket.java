// 1. Supermarket queue

public class Supermarket {
	PersonQueueImpl q = new PersonQueueImpl();
	
	public void addPerson(Person newPerson) {
		q.insert(newPerson);
	}
	
	public void servePerson() {
		q.retrieve();
	}
	
	public void serveOldest() {
		q.retrieveOldest();
	}
	
	public void serveOver(int age) {
		q.retrieveOver(age);
	}
	
	public void serveClustered() {
		q.retrieveClustered();
	}
	
	public void printList() {
		q.printList();
	}
	
}