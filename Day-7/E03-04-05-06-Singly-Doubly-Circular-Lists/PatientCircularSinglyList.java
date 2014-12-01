// 6. Circular lists

public class PatientCircularSinglyList implements LinkedList {
	private Patient first;
	
	public PatientCircularSinglyList() {
		first = null;
	}
	
	public void add(Patient newPatient) {
		if(first==null) {
			first = newPatient;
			first.setNext(newPatient);
		} else {
			Patient aux = first;
			while(aux.getNext()!=first) {
				aux = aux.getNext();
			}
			aux.setNext(newPatient);
			newPatient.setNext(first);
		}
	}
	
	public boolean delete(Patient patient) {
		if(first==null) {	
			System.out.println("Patient to delete not found: the list is empty");
			return false;
		} else if(first==patient) {
			Patient last = first;
			while(last.getNext()!=first) {
				last = last.getNext();
			}
			last.setNext(first.getNext());
			first = first.getNext();
		} else {
			Patient aux = first;
			while(true) {
				if(aux.getNext()==first) {
					System.out.println("Patient to delete not found");
					return false;
				} else if(aux.getNext()==patient) {
					aux.setNext(aux.getNext().getNext());
					break;
				} else {
					aux = aux.getNext();
				}
			}
		}
		return true;
	}
	
	public void printList() {
		if(first==null) {
			System.out.println("The list is empty");
			return;
		} else {
			printDetails(first);
			Patient aux = first;
			while(aux.getNext()!=first) {
				aux = aux.getNext();				
				printDetails(aux);
			}
		}
	}
	
	public int calculateLength() {
		int length = 0;
		if(first!=null) {
			length++;
			Patient aux = first;
			while(aux.getNext()!=first) {
				length++;
				aux = aux.getNext();
			}
		}
		return length;
	}
					
	public void printDetails(Patient patient) {
		if(patient!=null) {
			System.out.println(patient.getName() + ", " + patient.getAge() + ", " + patient.getIllness());
		} else {
			System.out.println("This patient doesn't appear in the list.");
			return;
		}
	}
	
	public Patient getLastPatient() {
		if(first==null) {
			System.out.println("The list is empty");
			return null;
		} else {
			Patient aux = first;
			while(aux.getNext()!=first) {
				aux = aux.getNext();
			}
			return aux;
		}
	}

}