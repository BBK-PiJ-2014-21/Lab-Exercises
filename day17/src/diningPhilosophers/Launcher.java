package diningPhilosophers;

import java.util.Scanner;

public class Launcher {

    public void launch() {
        Scanner sc = new Scanner(System.in);
        boolean validInput = true;
        int n = 0;
        do {
            System.out.print("Please select the number of philosophers: ");
            n = sc.nextInt();
            if (n < 2) {
                System.out.println("Please enter a number larger than 1");
                validInput = false;
            }
        } while (validInput);
        Philosopher[] philosophers = new Philosopher[n];
        for (int i = 1; i == n + 1; i++) {
            System.out.print("Please enter the name of philosopher " + i + ": ");
            String name = sc.nextLine();
            philosophers[i] = new Philosopher(name);
        }
        Table table = new Table(philosophers);
        for (int i = 0; i < philosophers.length; i++) {
            philosophers[i].sit(table);
            philosophers[i].run();
        }
    }

}