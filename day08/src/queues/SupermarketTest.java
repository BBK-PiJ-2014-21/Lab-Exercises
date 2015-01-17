package queues;

public class SupermarketTest {
	
	public static void main(String[] args) {
		SupermarketTest test = new SupermarketTest();
		Supermarket s = new Supermarket();
	//	queues.PersonQueueLinkedListImpl q = new queues.PersonQueueLinkedListImpl();
		PersonQueueOldestImpl q = new PersonQueueOldestImpl();
		System.out.println("======================");
		System.out.println("WELCOME TO SUPERMARKET");
		System.out.println("======================" + '\n');
		Person jack = new Person("Jack", 2);
		Person donnie = new Person("Donnie", 66);
		Person jimmy = new Person("Jimmy", 44);
		Person timmy = new Person("Timmy", 19);
		s.addPerson(q, jack);
		System.out.println("Jack(2yo) joined the queue.");
		q.printList();
		s.servePerson(q);
		System.out.println('\n' + "servePerson()");
		q.printList();
		System.out.println();
		s.addPerson(q, jimmy);
		s.addPerson(q, timmy);
		s.addPerson(q, donnie);
		System.out.println("Jimmy(44yo), Timmy(19yo) and Donnie(66yo) joined the queue.");
		q.printList();
		s.servePerson(q);
		System.out.println('\n' + "servePerson()");
		q.printList();
		s.servePerson(q);
		System.out.println('\n' + "servePerson()");
		q.printList();
		s.servePerson(q);
		System.out.println('\n' + "servePerson()");
		q.printList();
		s.servePerson(q);
		System.out.println('\n' + "servePerson()");
		q.printList();
		System.out.println();
	}

}