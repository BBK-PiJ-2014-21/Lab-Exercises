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
	
	public Patient getNext() {
		return this.nextPatient;
	}
	
	public void setNext(Patient patient) {
		this.nextPatient = patient;
	}
	
	public Patient getPrevious() {	// 5. Double-linked lists
		return this.previousPatient;
	}
	
	public void setPrevious(Patient patient) {  // 5. Double-linked lists
		this.previousPatient = patient;
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

}