package primeDivisors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class PrimeDivisorList implements PrimeDivisor {
    private List<Integer> list;
    
    public PrimeDivisorList() {
        list = new ArrayList<>();
    }
    /**
     *
     *  
     * @param value the prime number to be added to the list
     * @return true if the number is successfully added, false otherwise.
     * @throws IllegalArgumentException if a non-prime number is added as a parameter.
     */
    @Override
    public boolean add(Integer value) throws IllegalArgumentException {
        if (!isPrime(value)) {
            throw new IllegalArgumentException();
        } else {
            list.add(value);
            return true;
        }
    }
    /**
     * 
     * 
     * @return true if the number is found and successfully removed, false otherwise.
     */
    @Override
    public boolean remove(Integer value) {
        try {
            return list.remove(value);
        } catch (NullPointerException ex) {
            return false;
        }
    }
    /**
     *
     *
     * @return
     */
    @Override
    public String toString() {
        Collections.sort(list);
        String values = "[ ";
        if (list.isEmpty()) {
            return values + "]";
        } else {
            values = "[ " + list.get(0).toString();
        }
        long result = list.get(0);
        int i = 1;
        while (i < list.size()) {
            int exp = 1;
            while (list.get(i).equals(list.get(i - 1))) {
                exp++;
                if (exp == 2) {
                    values = values + "^" + exp;
                } else {
                    values = values.substring(0, values.length() - 1);
                    values = values + exp;
                }
                result = result * list.get(i);
                if (list.size() > i + 1) {
                    i++;
                } else {
                    return values + " = " + result + " ]";
                }
            }
            values = values + " * " + list.get(i);
            result = result * list.get(i);
            i++;
        }
        if(list.size()>1) {
            return values + " = " + result + " ]";
        } else {
            return values + " ]";
        }
    }
    
    public boolean isPrime(Integer n) {
        if(n<2) {
            return false;
        } else {
            int divisor = 2;
            while(divisor<n) {
                if(n%divisor==0) {
                    return false;
                }
                divisor++;
            }
        return true;
        }
    }
    
    public int size() {
        return list.size();
    }
    
}
