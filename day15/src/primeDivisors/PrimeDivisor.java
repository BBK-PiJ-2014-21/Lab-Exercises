package primeDivisors;

/**
 * A List of Integers which accepts only prime numbers.
 *
 */
public interface PrimeDivisor {
    /**
     * Add an element to the list. It has to be a valid prime number. 
     * 
     * @param value the prime number to be added to the list
     * @throws NullPointerException if a null number is passed as parameter.
     * @throws IllegalArgumentException if a non-prime number is added as a parameter.
     */
    public boolean add(Integer value);
    /**
     * * 
     */
    public boolean remove(Integer value);
    /**
     * Overrides toString in class Object.
     * A String representation of the elements in the list: e.g. [ 2 * 3^2 * 7 = 126 ]
     * The caret stands for multiple elements of a same value.
     */
    public String toString();
    
}
