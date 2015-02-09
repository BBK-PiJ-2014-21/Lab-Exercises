// 1. Don't Repeat Yourself

package dry;

import java.util.Scanner;

public class ComparatorTest {
	public static void main(String[] args) {
		Comparator x = new Comparator();
		Scanner sc = new Scanner(System.in);
		System.out.println('\n' + "Enter two integers:");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println("getMax(" + n + "," + m + ") = " + x.getMax(n,m) + '\n');
		System.out.println("Enter two doubles:");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		System.out.println("getMax(" + d1 + "," + d2 + ") = " + x.getMax(d1,d2) + '\n');
		System.out.println("Enter two integers:");
		String number1 = sc.next();
		String number2 = sc.next();
		System.out.println("getMax(\"" + number1 + "\",\"" + number2 + "\") = " + x.getMax(number1,number2));
	}
}