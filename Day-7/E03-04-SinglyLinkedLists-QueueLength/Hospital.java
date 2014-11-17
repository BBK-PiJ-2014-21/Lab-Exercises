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
		printList(p);
		System.out.println();			// trying equality of both methods
		p.printList();				// one created from class Patient other from Hospital
	}

	 public static void main(String[] args) {
		Hospital h = new Hospital();
		h.launch();
	}
	
	public void printList(Patient list) {
		System.out.println(list.getName() + ", " + list.getAge() + ", " + list.getIllness());
		if(list.getNextPatient() == null) {
			return;
		} else {
			printList(list.getNextPatient());
		}
	}
	
}