// 3. Singly-linked lists

public class Hospital {
	private Patient p = null;
	
	public void launch() {	
		deleteFirstPatient();
		Patient allen = new Patient("Woody", 78, "Hypochondriasis");
		p = allen;
		System.out.println();
		printListBackAndForth();
		System.out.println("Last patient:");
		p.getLastPatient().printPatientDetails();
		System.out.println("Deleting patient allen...");
		deleteFirstPatient();
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
		printListBackAndForth();
		System.out.println("Deleting patient fox...");
		p.deletePatient(fox);
		System.out.println();
		printListBackAndForth();
		System.out.println("Deleting patient weaving...");
		p.deletePatient(weaving);
		System.out.println();
		printListBackAndForth();
		System.out.println("Deleting patient allen...");
		p.deletePatient(allen);	// not found, has to be deleted from outside the list
		System.out.println();
		System.out.println("Deleting patient allen...");
		deleteFirstPatient();
		System.out.println();
		printListBackAndForth();
		System.out.println("Last patient:");
		p.getLastPatient().printPatientDetails();
		System.out.println();
	}

	public static void main(String[] args) {
		Hospital h = new Hospital();
		System.out.println();
		System.out.println("========================================");
		System.out.println("             HOSPITAL LIST");            
		System.out.println("========================================");
		h.launch();
	}
	
	public void deleteFirstPatient() {
		if(p==null) {
			System.out.println("The list is empty");
			return;
		}
		if(p.getNextPatient()==null) {
			System.out.println("Deleting process aborted");
			System.out.println("At least two patients are needed to delete the first one");
			return;
		} else {
			p = p.getNextPatient();
			p.resetPreviousPatient();
		}
	}
	
	public void printListCount() {
		System.out.println("NUMBER OF PATIENTS: " + p.getListLength() + '\n');
	}

	public void printListForwardVerbose() {
		System.out.println("===================");
		System.out.println("LIST GOING FORWARD:");
		System.out.println("===================");
		p.printListForward();
	}
	
	public void printListBackwardsVerbose() {
		System.out.println("=====================");
		System.out.println("LIST GOING BACKWARDS:");
		System.out.println("=====================");
		p.printListBackwards();
		System.out.println("=====================");
	}
	
	public void printListBackAndForth() {
		printListForwardVerbose();
		printListBackwardsVerbose();
		printListCount();
	}

}