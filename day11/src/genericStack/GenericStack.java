package genericStack;
/**
 *
 */
public class GenericStack<T extends Number> {
    private NumberNode<T> top;
    private int size;

    public GenericStack() {
        top = null;
        size = 0;
    }
    
    public int size() {
        return size;
    }
    
    public void push(T value) {
        NumberNode<T> newNode = new NumberNode<>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }
    
    public T pop() {
        if(isEmpty()) {
            return null;
        } else {
            T toReturn = top.getValue();
            top = top.getNext();
            size--;
            return toReturn;
        }
    }
    
    public T peek() {
        if(isEmpty()) {
            return null;
        } else {
            return top.getValue();
        }
    }
    
    public boolean isEmpty() {
        return (size==0);
    }
    
}
