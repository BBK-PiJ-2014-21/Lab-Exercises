package e02;// 2.3 Trees as sets - Implementation as list

public class ListIntSet implements IntSet {
	private IntegerListNode first;
	
	public ListIntSet() {
		this.first = null;
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
					return false;
				}
				aux = aux.getNext();
			}
			if(aux.getValue()==n) {
				return false;
			} else {
				return true;
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
					return false;
				}
				aux = aux.getNext();
			}
			System.out.println(aux.getValue());
			if(aux.getValue()==n) {
				return false;
			} else {
				return true;
			}
		}
	}

	public String toString() {
		String s = "";
		if(first==null) {
			return s;
		} else {
			IntegerListNode aux = first;
			s = s + first.getValue();
			while(aux.getNext()!=null) {
				aux = aux.getNext();				
				s = s + ", " + aux.getValue();

			}
			if(!aux.equals(first)) {
				s = s + ", " + aux.getValue();
			}
			return s;
		}
	}
	
}