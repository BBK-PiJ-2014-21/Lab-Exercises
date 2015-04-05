package diningPhilosophers;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.launch();
    }

    public void launch() {
        Scanner sc = new Scanner(System.in);
        boolean validInput;
        int n = 0;
        do {
            System.out.print("Please select the number of philosophers: ");
            n = sc.nextInt();
            if (n < 2) {
                System.out.println("Please enter a number larger than 1");
                validInput = false;
            } else {
                validInput = true;
            }
        } while (!validInput);
        Table table = new Table(n);
        table.setUp();
        sc.nextLine();
        Thread[] philosophers = new Thread[n];
        for (int i = 0; i < n ; i++) {
            System.out.print("Please enter the name of philosopher " + (i+1) + ": ");
            String name = sc.nextLine();
            Runnable r = new Philosopher(table, name, i);
            Thread t = new Thread(r);
            philosophers[i] = t;
        }
       for(int i=0; i<philosophers.length; i++) {
           philosophers[i].start();
       }
    }

}