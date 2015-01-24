package e03;

import e02.IntegerListNode;
import e02.ListIntSet;

/**
 * This class inherits the methods to implement the interface from a previous exercise
 * (package e02 - ListIntSet), overriding just the add() method to accept duplicates. 
 */
public class LinkedIntSortedList extends ListIntSet implements IntSortedList {
    
    public LinkedIntSortedList() {
        super();
    }
    
    @Override
    public void add(int n) {
        if(getNode()==null) {
            setNode(new IntegerListNode(n));
        } else {
            IntegerListNode aux = getNode();
            while(aux.getNext()!=null) {
                aux = aux.getNext();
            }
            aux.setNext(new IntegerListNode(n));
        }
        
    }
    
}
