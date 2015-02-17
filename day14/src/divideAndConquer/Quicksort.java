package divideAndConquer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Quicksort {
    
    public static List<Integer> quickSort(List<Integer> list) {
           if(list.size()<1) {
               return list;
           } else {
               Integer pivot = list.get(0);
               List<Integer> list1 = new ArrayList<>();
               List<Integer> list2 = new ArrayList<>();
               List<Integer> result = new ArrayList<>();
               for (int i = 1; i < list.size(); i++) {
                   if (list.get(i) < pivot) {
                       list1.add(list.get(i));
                   } else {
                       list2.add(list.get(i));
                   }
               }
               list1 = quickSort(list1);
               list2 = quickSort(list2);
               for (int i : list1) {
                   result.add(i);
               }
               result.add(pivot);
               for (int i : list2) {
                   result.add(i);
               }
               return result;
           }
    }
    
}
