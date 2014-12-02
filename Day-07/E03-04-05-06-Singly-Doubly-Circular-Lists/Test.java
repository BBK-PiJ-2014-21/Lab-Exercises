// Tests for 3. Singly-linked lists; 4.Queue length; 5. Doubly-linked lists 
	
public class Test {
	
	public void launchSinglyTest() {			
		PatientSinglyLinkedList h = new PatientSinglyLinkedList();
		System.out.println("SINGLY-LINKED LIST - (TEST)");
		System.out.println("===================");
		Patient allen = new Patient("Woody", 78, "Hypochondriasis");
		h.add(allen);
		Patient fox = new Patient("Michael J.", 53, "Parkinson");
		h.add(fox);
		Patient weaving = new Patient("Hugo", 54, "Epilepsy");
		h.add(weaving);
		Patient bates = new Patient("Kathy", 66, "Breast cancer");
		h.add(bates);
		Patient nelson = new Patient("Prince", 56, "Epilepsy");
		h.add(nelson);
		Patient freeman = new Patient("Morgan", 77, "Fibromyalgia");
		h.add(freeman);
		Patient hanks = new Patient("Tom", 58, "Diabetes");
		h.add(hanks);
		Patient zetajones = new Patient("Catherine", 45, "Bipolar disorder");
		h.add(zetajones);
		printListForwardVerbose(h);
		System.out.println();
		System.out.println("Deleting patient fox...");
		h.delete(fox);
		System.out.println("Deleting patient weaving...");
		h.delete(weaving);
		System.out.println();
		printListForwardVerbose(h);
		System.out.println();
		System.out.println("Deleting patient allen...");
		h.delete(allen);
		System.out.println();
		printListForwardVerbose(h);
		System.out.println();
		System.out.println("Last patient: ");
		h.printDetails(h.getLastPatient());
	}
	
	public void launchDoublyTest() {
		PatientDoublyLinkedList h = new PatientDoublyLinkedList();
		System.out.println("===================");		
		System.out.println("DOUBLY-LINKED LIST - (TEST)");
		System.out.println("===================");
		Patient allen = new Patient("Woody", 78, "Hypochondriasis");
		h.add(allen);
		Patient fox = new Patient("Michael J.", 53, "Parkinson");
		h.add(fox);
		Patient weaving = new Patient("Hugo", 54, "Epilepsy");
		h.add(weaving);
		Patient bates = new Patient("Kathy", 66, "Breast cancer");
		h.add(bates);
		Patient nelson = new Patient("Prince", 56, "Epilepsy");
		h.add(nelson);
		Patient freeman = new Patient("Morgan", 77, "Fibromyalgia");
		h.add(freeman);
		Patient zetajones = new Patient("Catherine", 45, "Bipolar disorder");
		h.add(zetajones);
		printListForwardVerbose(h);
		printListBackwardsVerbose(h);
		System.out.println();
		System.out.println("Deleting patient fox...");
		h.delete(fox);
		System.out.println("Deleting patient weaving...");
		h.delete(weaving);
		System.out.println();
		printListForwardVerbose(h);
		printListBackwardsVerbose(h);
		System.out.println();
		System.out.println("Deleting patient allen...");
		h.delete(allen);
		System.out.println();
		printListForwardVerbose(h);
		printListBackwardsVerbose(h);
		System.out.println();
		Patient hanks = new Patient("Tom", 58, "Diabetes");
		h.add(hanks);
		printListForwardVerbose(h);
		printListBackwardsVerbose(h);
		System.out.println();
		System.out.println("Deleting patient fox...");
		h.delete(fox);
		System.out.println();
		System.out.println("Last patient: ");
		h.printDetails(h.getLastPatient());
	}
	
	public void launchCircularSinglyTest() {
		PatientCircularSinglyList h = new PatientCircularSinglyList();
		System.out.println("===========================");
		System.out.println("CIRCULAR-SINGLY-LINKED LIST - (TEST)");
		System.out.println("===========================");
		Patient allen = new Patient("Woody", 78, "Hypochondriasis");
		h.add(allen);
		Patient fox = new Patient("Michael J.", 53, "Parkinson");
		h.add(fox);
		Patient weaving = new Patient("Hugo", 54, "Epilepsy");
		h.add(weaving);
		Patient bates = new Patient("Kathy", 66, "Breast cancer");
		h.add(bates);
		Patient nelson = new Patient("Prince", 56, "Epilepsy");
		h.add(nelson);
		Patient freeman = new Patient("Morgan", 77, "Fibromyalgia");
		h.add(freeman);
		Patient zetajones = new Patient("Catherine", 45, "Bipolar disorder");
		h.add(zetajones);
		printListForwardVerbose(h);
		System.out.println();
		System.out.println("Deleting patient fox...");
		h.delete(fox);
		System.out.println("Deleting patient weaving...");
		h.delete(weaving);
		System.out.println();
		printListForwardVerbose(h);
		System.out.println();
		System.out.println("Deleting patient allen...");
		h.delete(allen);
		System.out.println();
		printListForwardVerbose(h);
		System.out.println();
		Patient hanks = new Patient("Tom", 58, "Diabetes");
		h.add(hanks);
		printListForwardVerbose(h);
		System.out.println();
		System.out.println("Deleting patient fox...");
		h.delete(fox);
		System.out.println();
		System.out.println("Last patient: ");
		h.printDetails(h.getLastPatient());
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println();
		System.out.println("========================================");
		System.out.println("             HOSPITAL LIST");            
		System.out.println("========================================");
		t.launchSinglyTest();
		System.out.println();
		t.launchDoublyTest();
		System.out.println();
		t.launchCircularSinglyTest();
	}

	public void printListForwardVerbose(LinkedList x) {
		System.out.println("LIST GOING FORWARD:");
		x.printList();
	}
	
	public void printListBackwardsVerbose(PatientDoublyLinkedList x) {
		System.out.println("LIST GOING BACKWARDS:");
		x.printListBackwards();
	}

}