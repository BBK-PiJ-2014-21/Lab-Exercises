// 3. Singly-linked lists

public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient previousPatient;	// 5. Doubly-linked lists
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.previousPatient = null;	// 5. Doubly-linked lists
	}
	
	public Patient getNextPatient() {
		return this.nextPatient;
	}
	
	public Patient getPreviousPatient() {	// 5. Doubly-linked lists
		return this.previousPatient;
	}
	
	public void resetPreviousPatient() {	// to use in deleteFirstPatient() method
		this.previousPatient = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getIllness() {
		return this.illness;
	}
	
	public void setIllness(String illness) {
		this.illness = illness;
	}
	
	public void printPatientDetails() {	// 5. Doubly-linked lists
		System.out.println(this.getName() + ", " + this.getAge() + ", " + this.getIllness());
	}

	public void addPatient(Patient newPatient) {
		if(this.nextPatient == null) {
			this.nextPatient = newPatient;
			this.nextPatient.previousPatient = this;	// 5. Doubly-linked lists
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public Patient getLastPatient() {	// 5. Doubly-linked lists
		if(this.nextPatient==null) {
			return this;
		} else {
			return this.nextPatient.getLastPatient();
		}
	}
		
	
	public void printListForward() {
		printPatientDetails();
		if(this.nextPatient == null) {
			return;
		} else {
			this.nextPatient.printListForward();	
		}
	}
	
	public void printListBackwards() {	// 5. Doubly-linked lists
		Patient current = getLastPatient();
		while(current.previousPatient!=null) {
			current.printPatientDetails();
			current = current.previousPatient;
		}
		current.printPatientDetails();
	}			
	
	public void deletePatient(Patient patient) {
		if(this.nextPatient == null) {
			System.out.println("Patient to delete not found.");
		} else if (this.nextPatient.equals(patient)) {
			this.nextPatient = nextPatient.nextPatient;
			this.nextPatient.previousPatient = this;	// 5. Doubly-linked lists
			return;
		} else {
			this.nextPatient.deletePatient(patient);
		}
	}

// 4. Queue length

	public int getListLength() {
		if(this.nextPatient == null) {
			return 1;
		} else {
			return 1 + this.nextPatient.getListLength();
		}
	}

}

