package responsiveUI;

import org.junit.runners.Parameterized;

import java.util.Scanner;

/**
 *
 */
public class ResponsiveUI implements Runnable {
    private final int time;
    private final int taskN;
    private static TasksList list;

    public ResponsiveUI(int time, int taskN) {
        this.time = time;
        this.taskN = taskN;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(time);
                list.add(taskN);
            } catch (InterruptedException ex) {
                // back to main
            }
        }
    }

    public static void main(String[] args) {
        list = new TasksList();
        Scanner sc = null;
        Thread t;
        for (int i = 0; i <= 10; i++) {
            sc = new Scanner(System.in);
            System.out.print("Enter the duration (in ms) of task " + i + ": ");
            int time = sc.nextInt();
            t = new Thread(new ResponsiveUI(time, i));
            t.start();
            list.printList();
        }
    }
}