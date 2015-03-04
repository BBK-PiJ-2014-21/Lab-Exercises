package responsiveUI;

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
        boolean finished = false;
        while (!finished) {
            try {
                Thread.sleep(time);
                list.add(taskN);
                finished = true;
            } catch (InterruptedException ex) {
                // back to try block unless finished
            }
        }
    }

    public static void main(String[] args) {
        list = new TasksList();
        Scanner sc = new Scanner(System.in);
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the duration (in ms) of task " + (i+1) + ": ");
            int time = sc.nextInt();
            threads[i] = new Thread(new ResponsiveUI(time, i+1));
            System.out.println(threads[i].getName() + " started");
            threads[i].start();
            list.printList();
        }
        for (Thread t : threads) {
            while (t.isAlive()) {
                try {
                    t.join();
                } catch (InterruptedException ex) {
                    //
                }
            }
        }
        list.printList();
        System.out.println("Goodbye");
    }
}