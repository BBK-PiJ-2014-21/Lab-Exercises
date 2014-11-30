// 3. Singly-linked lists

public class PatientSinglyLinkedList implements LinkedList {
	private Patient first;
	
	public PatientSinglyLinkedList() {
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
		}
	}
	
	public boolean delete(Patient patient) {
		if(first==null) {
			return false;
		} else if(first==patient) {	
			first = first.getNext();
		} else {
			Patient aux = first;
			while(true) {
				if(aux.getNext()==null) {
					System.out.println("Patient to delete not found");
					return false;
				} else	if(aux.getNext()==patient) {
					aux.setNext(aux.getNext().getNext());
					break;
				} else {
					aux = aux.getNext();
				}
			}
		}
		return true;
	}

	public Patient getLastPatient() {
		if(first==null) {
			System.out.println("The list is empty");
			return null;
		} else {
			Patient aux = first;
			while(true) {
				if(aux.getNext()==null) {
					return aux;
				} else {
					aux=aux.getNext();
				}
			}
		}
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
	
}