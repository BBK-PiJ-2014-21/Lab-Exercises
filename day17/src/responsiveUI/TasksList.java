package responsiveUI;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class TasksList {
    private List<Integer> threadsCompletedList;

    public TasksList() {
        threadsCompletedList = new LinkedList<>();
    }
    
    public void add(int e) {
        threadsCompletedList.add(e);
    }
    
    public synchronized void printList() {
        if(threadsCompletedList.isEmpty()) {
            return;
        }
        String list = "";
        for(int task : threadsCompletedList) {
            list += task + ", ";
        }
        list = list.substring(0, list.length()-2);
        threadsCompletedList.clear();
        System.out.print("Finished tasks: " + list);
        System.out.println();
    }
    
}
