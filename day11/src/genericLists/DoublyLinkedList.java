package genericLists;

/**
 *
 */
public class DoublyLinkedList<T> {
    private Node<T> first;

    public DoublyLinkedList() {
        first = null;
    }

    public void add(T newValue) {
        Node<T> newNode = new Node<T>(newValue);
        if (first == null) {
            first = newNode;
            return;
        } else {
            Node aux = first;
            while (aux.getNext() != null) {
                if (aux.getNext().getValue().equals(newNode.getValue()))
                    aux = aux.getNext();
            }
            aux.setNext(newNode);
            newNode.setPrevious(aux);
        }
    }

    public boolean delete(T value) {
        Node<T> node = new Node<T>(value);
        if (first == null) {
            return false;
        } else if (first.getValue().equals(node.getValue())) {
            if(first.getNext()!=null) {
                first = first.getNext();
                first.setPrevious(null);
            } else {
                first = null;
            }
            return true;
        } else {
            Node<T> aux = first;
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
            return false;
        }
    }

    public int size() {  // 4. Queue length
        int length = 0;
        if (first != null) {
            length = 1;
            Node aux = first;
            while (aux.getNext() != null) {
                length++;
                aux = aux.getNext();
            }
        }
        return length;
    }

    public T getLast() {
        if (first == null) {
            System.out.println("The list is empty");
            return null;
        } else {
            Node<T> aux = first;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            return aux.getValue();
        }
    }

    public T get(int index) {
        int i = index;
        if (first == null || index < 0 || index > size() - 1) {
            return null;
        } else {
            Node<T> aux = first;
            while (i > 0) {
                aux = aux.getNext();
                i--;
            }
            return aux.getValue();
        }
    }
    
    public int indexOf(T value) {
        int index = 0;
        if(first==null) {
            return -1;
        } else {
            if(first.getValue().equals(value)) {
                return index;
            } else {
                Node<T> aux = first;
                while(aux.getNext()!=null) {
                    aux = aux.getNext();
                    index++;
                    if (aux.getValue().equals(value)) {
                        return index;
                    }
                }
                return -1;
            }
        }
    }
    
    public boolean contains(T value) {
        if (first == null) {
            return false;
        } else {
            if (first.getValue().equals(value)) {
                return true;
            }
            Node<T> aux = first;
            while (aux.getNext() != null) {
                if (aux.getValue().equals(value)) {
                    return true;
                } else {
                    aux = aux.getNext();
                }
            }
            return false;
        }
    }

}
