package queues;// 2. queues.Supermarket queue revisited (*)

public class PersonQueuePriorityListImpl extends PersonQueueLinkedListImpl {

	private Person retrieveOver(int age) {
		if(last==null) {
			return null;
		} else {
			Person oldest = null;
			if(last.getAge()>=age) {
                oldest = last;
                if (last.getNext() == null) {  // just one Person in the list, to be retrieved
                    last = null;
                    return oldest;
                }
            }
			Person aux = last;
			while(aux.getNext()!=null) {
				if(aux.getAge()>=age) {
					oldest = aux;
				}
				aux = aux.getNext();
			}
            if(oldest==null) {  //  whole queue checked, no over-age Person found
                return null;
            }
            Person previous = last;
			if(aux.getAge()>=age) {	// Person to retrieve is the last element
                while(!previous.getNext().equals(aux)) {
					previous = previous.getNext();
				}
				previous.setNext(null);
				return aux;
			}
			if(last.equals(oldest)) {	// Person to retrieve is the first (if alone is already returned)
				last = oldest.getNext();
			} else {
                while (!previous.getNext().equals(oldest)) {
                    previous = previous.getNext();
                }
                previous.setNext(oldest.getNext());
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