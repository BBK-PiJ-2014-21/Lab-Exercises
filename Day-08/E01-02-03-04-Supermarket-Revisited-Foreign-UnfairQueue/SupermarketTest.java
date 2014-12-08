
public class SupermarketTest {
	
	public static void main(String[] args) {
		Supermarket s = new Supermarket();
		System.out.println("======================");
		System.out.println("WELCOME TO SUPERMARKET");
		System.out.println("======================" + '\n');
		Person jack = new Person("Jack", 2);
		Person donnie = new Person("Donnie", 44);
		Person jimmy = new Person("Jimmy", 66);
		Person timmy = new Person("Timmy", 19);
		s.addPerson(donnie);
		s.addPerson(jack);
		s.addPerson(jimmy);
		s.addPerson(timmy);
		s.addPerson(timmy);	// this should be ignored
		s.printList();
		System.out.println();
		s.serveClustered();
		s.printList();
		System.out.println();
		s.serveClustered();		
		s.printList();
		System.out.println();
		s.serveClustered();
		s.printList();
		System.out.println();
		s.serveClustered();
		s.printList();
		System.out.println();
	}
	
}