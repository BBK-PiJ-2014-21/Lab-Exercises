// 3. Error handling on user input

import java.util.Scanner;
import java.util.InputMismatchException;

public class ErrorHandling {
	
	public static void main(String[] args) {
		ErrorHandling e = new ErrorHandling();
		e.launch(10);	// exercise (a)
		System.out.println();
		e.launch();		// exercise (b)
	}

	public void launch() {
		boolean valid = false;
		int n = 0;
		while(!valid) {
			System.out.println("How many numbers you want to enter? ");
			n = intNumberFormatException();
			if(n<=0) {
				System.out.println("Please enter a positive number.");
			} else {
				valid = true;
			}
		}
		launch(n);
	}
	
	public void launch(int total) {
		int i = total;
		int n = 0;
		int sum = 0;
		while(i>0) {
			n = intNumberFormatException();
			sum+=n;
			i--;
		}
		System.out.println("Average = " + sum/total);
	}
	
	public int intNumberFormatException() {
		int n = 0;
		System.out.print("Please enter a number: ");
		try {
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		} catch(NumberFormatException ex) {
			System.out.println("That is not a number");
		} catch(InputMismatchException e) {
			System.out.println("That is not a number");
		}
		return n;
	}
	
}
			

