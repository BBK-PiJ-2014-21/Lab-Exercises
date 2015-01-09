// 2. Supermarket queue revisited (*)

public class PersonQueuePriorityListImpl extends PersonQueueLinkedListImpl {

	public Person retrieveOver(int age) {
		if(last==null) {
			return null;
		} else {
			Person oldest = null;
			if(last.getAge()>=age) {
				oldest = last;
			}
			Person aux = last;
			while(aux.getNext()!=null) {
				if(aux.getAge()>=age) {
					oldest = aux;
				}
				aux = aux.getNext();
			}
			Person previous = last;
			if(aux.getAge()>=age) {	// person to retrieve is the last element
				while(!previous.getNext().equals(aux)) {
					previous = previous.getNext();
				}
				previous.setNext(null);
				return aux;
			}
			if(oldest!=null) {
				if(last.equals(oldest)) {	// person to retrieve is the first element
					last = oldest.getNext();
				} else {
					while(!previous.getNext().equals(oldest)) {
						previous = previous.getNext();
					}
					previous.setNext(oldest.getNext());
				}
			}
		return oldest;	
		}
	}
	
	@Override
	public Person retrieve() {	// 4.2 Unfair queue (*) Clustered (don't retrieve under 18s)
		Person aux = null;
		aux = retrieveOver(65);
		if(aux==null) {
			aux = retrieveOver(18);
		} 
		return aux;
	}

}	