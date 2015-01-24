package treesAsLists;

import treesAsSets.IntegerListNode;
import treesAsSets.ListIntSet;

/**
 * This class inherits the methods to implement the interface from a previous exercise
 * (package treesAsSets - ListIntSet), overriding just the add() method to accept duplicates and
 * TODO sorting the list! see if you can inherit a method from Day 7 or 8 (sorted list/queue)
 */
public class ListIntSortedList extends ListIntSet implements IntSortedList {
    
    public ListIntSortedList() {
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
