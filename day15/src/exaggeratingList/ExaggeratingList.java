package exaggeratingList;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * Implementation of interface {@see List} for type Integer, with some peculiarities.
 */
public class ExaggeratingList implements java.util.List<Integer> {
    private final int SMALL;
    private int size;
    private Node head;

    /**
     * Constructor for the Integer list.
     *  
     * @param small the largest value for an Integer to be considered "small".
     * Numbers within the value SMALL will be transformed into a bigger element when added to the list.
     */
    public ExaggeratingList(int small) {
        this.SMALL = small;
        size = 0;
        head = null;
    }

    /**
     * Append the specified element to the end of this list.
     * This list does not accepts null elements. 
     * Also, when a small elements is added to the list, it is transformed into a bigger element. 
     * SMALL is the value equals or less than the argument entered with the constructor for this list.
     * All the smallest elements will have their valued multiplied by 2 until that is greater than SMALL.
     *  
     * This method will not throw UnsupportedOperationException, ClassCastException and IllegalArgumentException,
     * as it specify Integer as parameter type, and it supports the add operation for any argument apart from null. 
     *
     * @param n element to be appended to this list
     * @return true if the element is added to the list, false otherwise 
     * (i.e. an attempt to add a null element)
     */
    @Override
    public boolean add(Integer n) {
        try {
            while (n > SMALL) {
                n = n * 2;
            }
            if (isEmpty()) {
                head = new Node(n);
            } else {
                Node aux = head;
                while (aux.getNext() != null) {
                    aux = aux.getNext();
                }
                aux.setNext(new Node(n));
            }
            size++;
            return true;
        } catch (NullPointerException ex) {
            System.out.println("Null values are not allowed in this list.");
            return false;
        }
    }

    @Override
    public void add(int index, Integer element) {

    }

    /**
     * Appends all of the elements in the specified collection to the end of this list.
     * This method doesn't throw UnsupportedOperationException or IllegalArgumentException
     * as the addAll operation is supported, and it accepts any element as long as they are
     * not null and of Integer type. 
     *  
     * @param c collection containing elements to be added to the list
     * @return true if this list changed as a result of the call
     * @throws ClassCastException if the class of an element of the specified collection
     * prevents it from being added to this list (i.e. is not an Integer)
     * @throws NullPointerException if the specified collection contains one or more null elements,
     * or if the specified collection is null
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean change = false;
        if(c==null) {
            throw new NullPointerException("Argument is null");
        } else {
            for(Object o : c) {
                if(o==null) {
                    throw new NullPointerException("The list does not allow null elements");
                } else if(!(o instanceof Integer)) {
                    throw new ClassCastException("Incompatible type: required Integer");
                } else {
                    add((Integer)o);
                    change = true;
                }
            }
        }
        return change;
    }

    /**
     * Inserts all of the elements in the specified collection into this list at the 
     * specified position. Shifts the element currently at that position (if any) and
     * any subsequent elements to the right (increases their indices). The new elements
     * will appear in this list in the order that they are returned by the specified
     * collection's iterator.  
     * 
     * Does not throw UnsupportedOperationException and IllegalArgumentException as
     * the addAll operation is supported and accepts any element as long as they're not 
     * null and of Integer type. 
     *  
     * @param index index at which to insert the first element from the specified collection
     * @param c collection containing elements to be added to this list
     * @return true if this list changed as a result of the call
     * @throws ClassCastException if the class of an element of the specified collection
     * prevents it from being added to this list (i.e. is not an Integer)
     * @throws NullPointerException if the specified collection contains one or more null elements,
     * or if the specified collection is null
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size()) 
     */
    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        if(c==null) {
            throw new NullPointerException("Argument is null");
        } else if(index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        } else {
            for (Object o : c) {
                if (o == null) {
                    throw new NullPointerException("The list does not allow null elements");
                } else if (!(o instanceof Integer)) {
                    throw new ClassCastException("Incompatible type: required Integer");
                }
            }
            Node aux = head;
            if (index == 0) {
                head = null;
            } else {
                aux = head.getNext();
                Node previous = head;
                int i = index;
                while (i > 1) {
                    aux = aux.getNext();
                    previous = previous.getNext();
                    i--;
                }
                previous.setNext(null);
            }
            addAll(c);
            add((Integer) aux.getValue());
            while (aux.getNext() != null) {
                aux = aux.getNext();
                add((Integer) aux.getValue());
            }
        }
        return true;
    }
    
    @Override
    public void clear() {
        //TODO
    }

    /**
     * Returns true if this list contains the specified element. More formally, returns
     * true if and only if this list contains at least one element e such that 
     * (0==null ? e==null : o.equals(e)). 
     * 
     * @param o element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     * @throws ClassCastException if the type of the specified element is not an Integer
     * @throws NullPointerException if the specified element is null
     */
    @Override
    public boolean contains(Object o) {
        if(o == null) {
            throw new NullPointerException("Argument is null.");
        } else if(!(o instanceof Integer)) {
            throw new ClassCastException("Argument is not an Integer.");
        } else {
            for(int i=0; i<size(); i++) {
                if (head.getValue().equals(o)) {
                    return true;
                } else {
                    Node aux = head;
                    while (aux.getNext() != null) {
                        aux = aux.getNext();
                        if (aux.getValue().equals(o)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /**
     * Returns true if the list contains all of the elements of the specified collection.
     *   
     * @param c collection to be checked for containment in this list
     * @return true if this list contains all of the elements of the specified collection
     * @throws ClassCastException if the types of one or more elements in the specified collection
     * are incompatible with this list (i.e. are not Integer).
     * @throws NullPointerException if the specified collection contains one or more null elements,
     * or if the specified collection is null 
     */
    @Override
    public boolean containsAll(Collection<?> c) {
       if(c==null) {
           throw new NullPointerException("Argument is null");
       } else {
           for (Object o : c) {
               if (o == null) {
                   throw new NullPointerException("The list does not permit null elements");
               }
               if (!(o instanceof Integer)) {
                   throw new ClassCastException("Incompatible type: required Integer");
               } else {
                   if(!contains(o)) {
                       return false;
                   }
               }
           }
           return true;
       }
    }

    @Override
    public boolean equals(Object o) {
        return false;   // TODO
    }

    /**
     * Returns the element at the specified position in this list. 
     * 
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size()) 
     */
    @Override
    public Integer get(int index) {
        if(index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            Node aux = head;
            while(index>0) {
                aux = aux.getNext();
                index--;
            }
            return (Integer) aux.getValue();
        }
    }

    @Override
    public int hashCode() {
        return 0;   // TODO
    }

    @Override
    public int indexOf(Object o) {
        return 0;   // TODO
    }

    /**
     * Returns true if this list contains no elements.
     *  
     * @return true if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;    // TODO
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;   // TODO
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;    // TODO
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;    // TODO
    }

    @Override
    public Integer remove(int index) {
        return null;    // TODO
    }

    /**
     * Removes the first occurrence of the specified element from this list, if it is
     * present. If this list does not contain the element, it is unchanged. More formally,
     * removes the element with the lowest index which is equal to the specified value.
     * Returns true if this list contained the specified element (or equivalently, if this list
     * changed as a result of the call). 
     *  
     * @param o element to be removed from this list, if present
     * @return true if this list contained the specified element
     */
    @Override
    public boolean remove(Object o) {
        if(o != null && !isEmpty()) {
            if(head.getValue().equals(o)) {
                if(head.getNext()!=null) {
                    head = head.getNext();
                } else {
                    head = null;
                }
                size--;
            } else {
                Node aux = head.getNext();
                Node previous = head;
                while(aux!=null) {
                    if (aux.getValue().equals(o)) {
                        previous.setNext(aux.getNext());
                        size--;
                        return true;
                    } else {
                        aux = aux.getNext();
                        previous = previous.getNext();
                    }
                }
            }
        }
        return false;
    }

    /**
     * Operation not supported by this list
     *  
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * Operation not supported by this list
     *
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(UnaryOperator<Integer> operator) {
        // TODO
    }

    @Override
    public void sort(Comparator<? super Integer> c) {
        // TODO
    }

    @Override
    public Integer set(int index, Integer element) {
        return null;    // TODO
    }

    /**
     * Returns twice the number of elements in this list. If the halved list contains
     * more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
     *  
     * @return two times the number of elements in this list
     */
    @Override
    public int size() {
        return size * 2;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;    // TODO
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return null;    // TODO
    }

    /**
     * Returns an array containing all of the elements in this list in proper sequence
     * (from first to last element).
     * 
     * The returner array should be "safe" in that no references to it are maintained by
     * this list. The caller is thus free to modify the returned array.
     *  
     * @return an array containing all of the elements in this list in proper sequence
     */
    @Override
    public Object[] toArray() {
        Object[] array = new Object[size()];
        int i=0;
        for(Integer v : this) {
            array[i] = v;
            i++;
        }
        return array;
    }

    /**
     * Being this list a Integer-type only list, this method is not implemented.
     * It will just check if the specified array is not null, then it will
     * call toArray() method. The ArrayStoreException cannot be thrown here as the
     * specified array can have only one runtime type, namely Integer.
     *
     * @param a an Integer[]
     * @return an array containing all of the elements in this list in proper sequence
     * @throws NullPointerException if the specified array is null
     */
    @Override
    public <Integer> Integer[] toArray(Integer[] a) {
        if (a == null) {
            throw new NullPointerException("The specified array is null.");
        } else {
            return (Integer[]) toArray();
        }
    }
}
