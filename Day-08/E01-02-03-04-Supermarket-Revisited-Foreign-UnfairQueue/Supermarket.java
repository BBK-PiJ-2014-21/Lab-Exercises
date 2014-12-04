// 1. Supermarket queue

public class Supermarket {
	PersonQueueImpl q;
	
	public void addPerson(Person newPerson) {
		q.insert(newPerson);
	}
	
	public void servePerson() {
		q.retrieve();
	}
	
}