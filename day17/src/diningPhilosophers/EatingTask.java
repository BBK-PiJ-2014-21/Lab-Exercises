package diningPhilosophers;

import org.apache.tools.ant.taskdefs.Ear;

/**
 *
 */
public class EatingTask implements Runnable {
    private Thread philosopher;
    private static boolean fork1;
    private static boolean fork2;
    
    public EatingTask(Thread philosopher) {
        this.philosopher = philosopher;
    }
    
    @Override
    public void run() {
        if(!fork1) {
            fork1 = true;
            System.out.println("fork1 taken by " + philosopher.getName());
        }
        if(!fork2) {
            fork2 = true;
            System.out.println("fork2 taken by " + philosopher.getName());
        } else {
            fork1 = false;
            System.out.println("fork1 dropped by " + philosopher.getName());
        }
    }
    
    
}
