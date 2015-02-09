package genericLists;

/**
 * Generic linked list. It accepts duplicates.
 */
public class GenericDoublyLinkedList<T> {
    private GenericNode<T> first;

    public GenericDoublyLinkedList() {
        first = null;
    }
    
    public GenericNode<T> getFirst() {
        return first;
    }
    
    public void setFirst(GenericNode<T> newNode) {
        first = newNode;
    }
    
    /**
     * Add an element to the list.
     *
     * @param newValue the new element which is to be added to the list.
     */
    public void add(T newValue) {
        GenericNode<T> newNode = new GenericNode<T>(newValue);
        if (first == null) {
            first = newNode;
        } else {
            GenericNode<T> aux = first;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(newNode);
            newNode.setPrevious(aux);
        }
    }
    /**
     * Delete an element in the list. 
     * 
     * @param value the element to delete.
     * @return true if the value is found and deleted, false if not found or for an empty list.
     */
    public boolean delete(T value) {
        GenericNode<T> node = new GenericNode<T>(value);
        if (first != null) {
            if (first.getValue().equals(node.getValue())) {
                if(first.getNext()==null) {
                    first = null;
                } else {
                    first = first.getNext();
                    first.setPrevious(null);
                }
                return true;
            } else {
                GenericNode<T> aux = first;
                while (aux.getNext() != null) {
                    if (aux.getNext().getValue().equals(node.getValue())) {
                        aux.setNext(aux.getNext().getNext());
                        if(aux.getNext()!=null) {
                            aux.getNext().setPrevious(aux);
                        }
                        return true;
                    } else {
                        aux = aux.getNext();
                    }
                }
            }
        }
        return false;
    }
    /**
     * Calculate the size of the list. Please note it doesn't just return a counter value, but it
     * goes throughout the list each time this method is called, so it might not be very efficient 
     * for long lists. 
     *  
     * @return the size of the list.
     */
    public int size() {  // 4. Queue length
        int length = 0;
        if (first != null) {
            length = 1;
            GenericNode<T> aux = first;
            while(aux.getNext() != null) {
                length++;
                aux = aux.getNext();
            }
        }
        return length;
    }
    /**
     * Returns the element at a specific index.
     *   
     * @param index the position of the value to return.
     * @return the value at the position index, or null for an out of bounds search.
     */
    public T get(int index) {
        int i = index;
        if (first == null || index < 0 || index > size() - 1) {
            return null;
        } else {
            GenericNode<T> aux = first;
            while (i > 0) {
                aux = aux.getNext();
                i--;
            }
            return aux.getValue();
        }
    }
    /**
     * Method which returns the index position of an element of the list.
     *  
     * @param value the value to search throughout the list.
     * @return the index position of the value found, or -1 if either the value is not found or the list is empty.
     */
    public int indexOf(T value) {
        int index = 0;
        if(first!=null) {
            if(first.getValue().equals(value)) {
                return index;
            } else {
                GenericNode<T> aux = first;
                while(aux.getNext()!=null) {
                    aux = aux.getNext();
                    index++;
                    if (aux.getValue().equals(value)) {
                        return index;
                    }
                }
            }
        }
        return -1;
    }
    /**
     * Boolean method to check if a value is contained in the list. 
     * 
     * @param value the value which is searched throughout the list.
     * @return true if the value is in the list, false otherwise.
     */
    public boolean contains(T value) {
        if (first!=null) {
            if (first.getValue().equals(value)) {
                return true;
            }
            GenericNode<T> aux = first;
            while (aux.getNext() != null) {
                if (aux.getValue().equals(value)) {
                    return true;
                } else {
                    aux = aux.getNext();
                }
            }
            if(aux.getValue().equals(value)) {  // check last element
                return true;
            }
        }
        return false;
    }

}
