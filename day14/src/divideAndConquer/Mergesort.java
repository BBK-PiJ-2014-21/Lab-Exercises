package divideAndConquer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Mergesort <T extends Number> {

    public static <T extends Comparable<? super T>> List<T> mergeSort(List<T> list) {
        if (list.size() < 2) {
            return list;
        } else {
            List<T> list1 = mergeSort(list.subList(0, list.size() / 2));
            List<T> list2 = mergeSort(list.subList(list.size() / 2, list.size()));
            return merge(list1, list2);
        }
    }
    
    private static <T extends Comparable<? super T>> List<T> merge(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        int i = 0;    // index of the first list
        int j = 0;    // index of the second list
        while (i < list1.size()) {
            while (j < list2.size()) {
                if (list2.get(j).compareTo(list1.get(i))<=0) {  // element to add is in the second list
                    result.add(list2.get(j));
                    j++;
                } else break;   // element to add is in the first list
            }
            result.add(list1.get(i));
            i++;
        }
        while (j<list2.size()) {    // if the first list becomes empty but the second had larger elements
            result.add(list2.get(j));
            j++;
        }
    return result;
    }

}
