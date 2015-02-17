package divideAndConquer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Mergesort {

    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            List<Integer> list1 = mergeSort(list.subList(0, list.size() / 2));
            List<Integer> list2 = mergeSort(list.subList(list.size() / 2, list.size()));
            return merge(list1, list2);
        }
    }
    
    private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0;    // index of the first list
        int j = 0;    // index of the second list
        while (i < list1.size()) {
            while (j < list2.size()) {
                if (list2.get(j) < list1.get(i)) {  // element to add is in the second list
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
