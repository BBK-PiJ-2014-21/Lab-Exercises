package hailstoneNumbers;

import java.util.Scanner;

/**
 *
 */
 public class HailstoneTest {
	
	public static void main(String[] args) {
		Hailstone h = new Hailstone();
        Scanner sc = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("HAILSTONE CALCULATOR");
        System.out.println("====================");
        System.out.print("Please select a starting number: ");
        int n = sc.nextInt();
		h.hailstoneCalc(n);
		h.printList();
	}
	
}
		