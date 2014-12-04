// 5. Doubly-linked lists

public class PatientDoublyLinkedList implements LinkedList {
	private Patient first;
	
	public PatientDoublyLinkedList() {
		first = null;
	}

	public void add(Patient newPatient) {
		if(first==null) {
			first = newPatient;
			return;
		} else {
			Patient aux = first;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			aux.setNext(newPatient);
			newPatient.setPrevious(aux);
		}
	}
	
	public boolean delete(Patient patient) {
		if(first==null) {
			System.out.println("Patient to delete not found: the list is empty");
			return false;
		} else if(first==patient) {	
			first = first.getNext();
			first.setPrevious(null);
		} else {
			Patient aux = first;
			while(true) {
				if(aux.getNext()==null) {
					System.out.println("Patient to delete not found");
					return false;
				} else	if(aux.getNext()==patient) {
					aux.setNext(aux.getNext().getNext());
					aux.getNext().setPrevious(aux);
					break;
				} else {
					aux = aux.getNext();
				}
			}
		}
		return true;
	}
	
	public void printDetails(Patient patient) {
		if(patient!=null) {
			System.out.println(patient.getName() + ", " + patient.getAge() + ", " + patient.getIllness());
		} else {
			System.out.println("This patient doesn't appear in the list.");
			return;
		}
	}
	
	public void printList() {
		if(first==null) {
			System.out.println("The list is empty.");
			return;
		} else {
			Patient aux = first;
			while(aux.getNext()!=null) {
				printDetails(aux);
				aux=aux.getNext();
			}
			printDetails(aux);
		}
	}
	
	public void printListBackwards() {
		if(first==null) {
			System.out.println("The list is empty.");
			return;
		} else {	
			Patient aux = first;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			printDetails(aux);
			while(aux.getPrevious()!=null) {
				aux = aux.getPrevious();
				printDetails(aux);
			}
		}
	}	
	
	public int calculateLength() {  // 4. Queue length
		int length = 0;
		if(first!=null) {
			length = 1;
			Patient aux = first;
			while(aux.getNext()!=null) {
				length++;
				aux = aux.getNext();
			}
		}
		return length;
	}	
	
	public Patient getLastPatient() {
		if(first==null) {
			System.out.println("The list is empty");
			return null;
		} else {
			Patient aux = first;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			return aux;
		}
	}
			
	
}