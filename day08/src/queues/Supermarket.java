package queues;

public class Supermarket {
	
	public void addPerson(PersonQueue q, Person newPerson) {
		q.insert(newPerson);
	}
	
	public void servePerson(PersonQueue q) {
		q.retrieve();
	}
	
}