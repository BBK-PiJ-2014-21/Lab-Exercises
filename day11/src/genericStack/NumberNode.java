package genericStack;
import genericLists.GenericNode;

/**
 *
 */
public class NumberNode<T extends Number> extends GenericNode<T> {
    
    public NumberNode(T value) {
        super(value);
    }
    
    @Override
    public NumberNode<T> getNext() {
        return (NumberNode<T>)super.getNext();
    }
    
}
