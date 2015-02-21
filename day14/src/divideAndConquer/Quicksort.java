package divideAndConquer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Quicksort {
    
    public static <T extends Comparable<? super T>> List<T> quickSort(List<T> list) {
           if(list.size()<1) {
               return list;
           } else {
               T pivot = list.get(0);
               List<T> list1 = new ArrayList<>();
               List<T> list2 = new ArrayList<>();
               List<T> result = new ArrayList<>();
               for (int i = 1; i < list.size(); i++) {
                   if (list.get(i).compareTo(pivot)<=0) {
                       list1.add(list.get(i));
                   } else {
                       list2.add(list.get(i));
                   }
               }
               list1 = quickSort(list1);
               list2 = quickSort(list2);
               for (T i : list1) {
                   result.add(i);
               }
               result.add(pivot);
               for (T i : list2) {
                   result.add(i);
               }
               return result;
           }
    }
    
}
