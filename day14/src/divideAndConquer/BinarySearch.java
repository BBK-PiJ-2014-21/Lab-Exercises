package divideAndConquer;

import java.util.List;

/**
 *
 */
public class BinarySearch {
    
    public boolean binarySearch(List<Integer> list, Integer element) {
        if(list.isEmpty()) {
            return false;
        } else if(list.size()==1) {
            if(list.get(0).equals(element)) {
                return true;
            } else {
                return false;
            }
        } else {
            Integer middle = list.get(list.size()/2);
            if(middle.equals(element)) {
                return true;
            } else if(element>middle) {
                return binarySearch(list.subList((list.size()/2), list.size()), element);
            } else {
                return binarySearch(list.subList(0, list.size()/2), element);
            }
        }
    }
    
}
