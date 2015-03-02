package diningPhilosophers;

import java.util.Scanner;

/**
 *
 */
public class DiningPhilosophers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please select the number of philosophers: ");
        int n = sc.nextInt();
        Thread[] philosophers = new Thread[n];
        for(int i=0; i<philosophers.length; i++) {
            philosophers[i] = new Thread(new EatingTask());
        }
        
        
        
    }
    
}
