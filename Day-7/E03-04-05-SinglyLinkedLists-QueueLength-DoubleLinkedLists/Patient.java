// 3. Singly-linked lists

public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
<<<<<<< HEAD:Day-7/E03-04-SinglyLinkedLists-QueueLength/Patient.java
	private Patient previousPatient;		// 5. Double-linked lists
=======
	private Patient previousPatient;	// 5. Doubly-linked lists
>>>>>>> 52996cdec90c6ced91994cd0ec8ff865ab598032:Day-7/E03-04-05-SinglyLinkedLists-QueueLength-DoubleLinkedLists/Patient.java
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
<<<<<<< HEAD:Day-7/E03-04-SinglyLinkedLists-QueueLength/Patient.java
		this.previousPatient = null;	// 5. Double-linked lists
=======
		this.previousPatient = null;	// 5. Doubly-linked lists
>>>>>>> 52996cdec90c6ced91994cd0ec8ff865ab598032:Day-7/E03-04-05-SinglyLinkedLists-QueueLength-DoubleLinkedLists/Patient.java
	}
	
	public Patient getNextPatient() {
		return this.nextPatient;
	}
	
<<<<<<< HEAD:Day-7/E03-04-SinglyLinkedLists-QueueLength/Patient.java
	public Patient getPreviousPatient() {	// 5. Double-linked lists
		return this.previousPatient;
	}
	
=======
	public Patient getPreviousPatient() {	// 5. Doubly-linked lists
		return this.previousPatient;
	}
	
	public void resetPreviousPatient() {	// to use in deleteFirstPatient() method
		this.previousPatient = null;
	}
	
>>>>>>> 52996cdec90c6ced91994cd0ec8ff865ab598032:Day-7/E03-04-05-SinglyLinkedLists-QueueLength-DoubleLinkedLists/Patient.java
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
<<<<<<< HEAD:Day-7/E03-04-SinglyLinkedLists-QueueLength/Patient.java
			newPatient.previousPatient = this;	// 5. Double-linked lists
=======
			this.nextPatient.previousPatient = this;	// 5. Doubly-linked lists
>>>>>>> 52996cdec90c6ced91994cd0ec8ff865ab598032:Day-7/E03-04-05-SinglyLinkedLists-QueueLength-DoubleLinkedLists/Patient.java
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
<<<<<<< HEAD:Day-7/E03-04-SinglyLinkedLists-QueueLength/Patient.java
	public void printPatient() {
		System.out.println(this.getName() + ", " + this.getAge() + ", " + this.getIllness());
	}
	
	public void printList() {
		System.out.println(this.name + ", " + this.age + ", " + this.illness);
=======
	public Patient getLastPatient() {	// 5. Doubly-linked lists
		if(this.nextPatient==null) {
			return this;
		} else {
			return this.nextPatient.getLastPatient();
		}
	}
		
	
	public void printListForward() {
		printPatientDetails();
>>>>>>> 52996cdec90c6ced91994cd0ec8ff865ab598032:Day-7/E03-04-05-SinglyLinkedLists-QueueLength-DoubleLinkedLists/Patient.java
		if(this.nextPatient == null) {
			return;
		} else {
			this.nextPatient.printListForward();	
		}
	}
	
<<<<<<< HEAD:Day-7/E03-04-SinglyLinkedLists-QueueLength/Patient.java
	public void printListBackwards() {	// 5. Double-linked lists
		System.out.println(this.name + ", " + this.age + ", " + this.illness);		
		if(this.previousPatient == null) {
			return;
		} else {
			this.previousPatient.printListBackwards();
=======
	public void printListBackwards() {	// 5. Doubly-linked lists
		Patient current = getLastPatient();
		while(current.previousPatient!=null) {
			current.printPatientDetails();
			current = current.previousPatient;
		}
		current.printPatientDetails();
	}			
>>>>>>> 52996cdec90c6ced91994cd0ec8ff865ab598032:Day-7/E03-04-05-SinglyLinkedLists-QueueLength-DoubleLinkedLists/Patient.java
	
	public void deletePatient(Patient patient) {
		if(this.nextPatient == null) {
			System.out.println("Patient to delete not found.");
		} else if (this.nextPatient.equals(patient)) {
			this.nextPatient = nextPatient.nextPatient;
<<<<<<< HEAD:Day-7/E03-04-SinglyLinkedLists-QueueLength/Patient.java
			this.nextPatient.previousPatient = this;	// 5. Double-linked lists
=======
			this.nextPatient.previousPatient = this;	// 5. Doubly-linked lists
>>>>>>> 52996cdec90c6ced91994cd0ec8ff865ab598032:Day-7/E03-04-05-SinglyLinkedLists-QueueLength-DoubleLinkedLists/Patient.java
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

