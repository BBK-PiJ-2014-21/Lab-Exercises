package morePatients;// 4. More patients

import java.util.InputMismatchException;
import java.util.Scanner;

public class MorePatients {

    private class Patient {
        String name;
        int age;

        private Patient(String name, int age) {
            this.name = name;
            if (age < 0 || age > 130) {
                throw new IllegalArgumentException();
            } else {
                this.age = age;
            }
        }
    }

    public void getData() {
        String loop;
        do {
            System.out.print("Please enter the name of the Patient: ");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            int age = 0;
            boolean valid = false;
            do {
                try {
                    System.out.print("Please enter the age of the Patient: ");
                    age = sc.nextInt();
                    valid = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Invalid input");
                } finally {
                    sc.nextLine();
                }
            } while (!valid);
            Patient patient = new Patient(name, age);
            System.out.print("Do you want to enter data for another patient? ");
            loop = sc.next();
        } while (loop.equalsIgnoreCase("y"));
    }
}