// 3. Singly-linked lists

public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient previousPatient;		// 5. Double-linked lists
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.previousPatient = null;	// 5. Double-linked lists
	}
	
	public Patient getNextPatient() {
		return this.nextPatient;
	}
	
	public Patient getPreviousPatient() {	// 5. Double-linked lists
		return this.previousPatient;
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

	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
			newPatient.previousPatient = this;	// 5. Double-linked lists
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public void printPatient() {
		System.out.println(this.getName() + ", " + this.getAge() + ", " + this.getIllness());
	}
	
	public void printList() {
		System.out.println(this.name + ", " + this.age + ", " + this.illness);
		if(this.nextPatient == null) {
			return;
		} else {
			this.nextPatient.printList();	
		}
	}
	
	public void printListBackwards() {	// 5. Double-linked lists
		System.out.println(this.name + ", " + this.age + ", " + this.illness);		
		if(this.previousPatient == null) {
			return;
		} else {
			this.previousPatient.printListBackwards();
	
	public void deletePatient(Patient patient) {
		if(this.nextPatient == null) {
			System.out.println("Patient to delete not found.");
		} else if (this.nextPatient.equals(patient)) {
			this.nextPatient = nextPatient.nextPatient;
			this.nextPatient.previousPatient = this;	// 5. Double-linked lists
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

