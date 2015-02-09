package genericLists;

/**
 * Generic node class to use as a field for the generic {@see DoublyLinkedList}.
 */
public class GenericNode<T> {
    T value;
    GenericNode<T> next;
    GenericNode<T> previous;
    
    public GenericNode(T value) {
        this.value = value;
        next = null;
        previous = null;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
    
    public GenericNode<T> getNext() {
        return next;
    }
    
    public void setNext(GenericNode<T> newNode) {
        next = newNode;
    }
    
    public GenericNode<T> getPrevious() {
        return previous;
    }
    
    public void setPrevious(GenericNode<T> newNode) {
        previous = newNode;
    }
}

