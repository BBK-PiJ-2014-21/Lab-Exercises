package divideAndConquer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Mergesort {
    
    public static List<Integer> mergeSort(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        if (list.size() < 2) {
            return list;
        } else {
            list1 = mergeSort(list.subList(0, list.size() / 2));
            list2 = mergeSort(list.subList(list.size() / 2, list.size()));
        }
        while (!list1.isEmpty() && !list2.isEmpty()) {
            System.out.println("?");
            if (list1.get(0) > list2.get(0)) {
                result.add(list1.remove(0));
            } else {
                result.add(list2.remove(0));
            }
        }
        return result;
    }
    
}
    
