package e02;

public class ListIntSet implements IntSet {
	private IntegerListNode first;
	
	public ListIntSet() {
		first = null;
	}
	
	public void add(int n) {
		if(first==null) {
			first = new IntegerListNode(n);
		} else if(contains(n)) {
			return;
		} else {
			IntegerListNode aux = first;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			IntegerListNode newNode = new IntegerListNode(n);
			aux.setNext(newNode);
		}
	}
	
	public boolean contains(int n) {
		if(first==null) {
			return false;
		} else {
			IntegerListNode aux = first;
			while(aux.getNext()!=null) {
				if(aux.getValue()==n) {
					return true;
				}
				aux = aux.getNext();
			}
			if(aux.getValue()==n) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public boolean containsVerbose(int n) {
		if(first==null) {
			return false;
		} else {
			IntegerListNode aux = first;
			while(aux.getNext()!=null) {
				System.out.println(aux.getValue());
				if(aux.getValue()==n) {
					return true;
				}
				aux = aux.getNext();
			}
			System.out.println(aux.getValue());
			if(aux.getValue()==n) {
				return true;
			} else {
				return false;
			}
		}
	}

	public String toString() {
		String s = "";
		if(first==null) {
			return "<The list is empty>";
		} else {
			IntegerListNode aux = first;
			s = s + first.getValue();
			while(aux.getNext()!=null) {
				aux = aux.getNext();				
				s = s + ", " + aux.getValue();

			}
			return s;
		}
	}
	
}