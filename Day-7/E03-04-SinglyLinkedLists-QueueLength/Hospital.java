// 3. Singly-linked lists

public class Hospital {
	private Patient p = null;
	
	public void launch() {
		Patient allen = new Patient("Woody", 78, "Hypochondriasis");
		p = allen;
		Patient fox = new Patient("Michael J.", 53, "Parkinson");
		p.addPatient(fox);
		Patient weaving = new Patient("Hugo", 54, "Epilepsy");
		p.addPatient(weaving);
		Patient bates = new Patient("Kathy", 66, "Breast cancer");
		p.addPatient(bates);
		Patient nelson = new Patient("Prince", 56, "Epilepsy");
		p.addPatient(nelson);
		Patient freeman = new Patient("Morgan", 77, "Fibromyalgia");
		p.addPatient(freeman);
		Patient hanks = new Patient("Tom", 58, "Diabetes");
		p.addPatient(hanks);
		Patient zetajones = new Patient("Catherine", 45, "Bipolar disorder");
		p.addPatient(zetajones);
		System.out.println();
		p.printList();
		System.out.println("NUMBER OF PATIENTS: " + p.getListLength() + '\n');
		System.out.println("Deleting patient fox...");
		p.deletePatient(fox);
		p.printList();
		System.out.println("NUMBER OF PATIENTS: " + p.getListLength() + '\n');
		System.out.println("Deleting patient weaving...");
		p.deletePatient(weaving);
		p.printList();
		System.out.println("NUMBER OF PATIENTS: " + p.getListLength() + '\n');
		System.out.println("Deleting patient allen...");
		p.deletePatient(allen);		// not found, has to be deleted from outside the list
		p.printList();
		System.out.println("NUMBER OF PATIENTS: " + p.getListLength() + '\n');
		System.out.println("Deleting patient allen...");
		deleteFirstPatient();
		p.printList();
		System.out.println("NUMBER OF PATIENTS: " + p.getListLength() + '\n');
	
	}

	public static void main(String[] args) {
		Hospital h = new Hospital();
		h.launch();
	}
	
	public void deleteFirstPatient() {
		if (p == null) {
			System.out.println("The list is empty.");
		} else {
			p = p.getNextPatient();
		}
	}
	
}