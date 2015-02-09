package genericLists;

/**
 * Generic node class to use as a field for the generic {@see DoublyLinkedList}.
 */
public class Node<T> {
    T value;
    Node next;
    Node previous;
    
    public Node(T value) {
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
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node<T> newNode) {
        next = newNode;
    }
    
    public Node getPrevious() {
        return previous;
    }
    
    public void setPrevious(Node<T> newNode) {
        previous = newNode;
    }
}

