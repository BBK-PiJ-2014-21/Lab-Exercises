package errorHandling;// 3. Error handling on user input

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandling {
	
	public static void main(String[] args) {
		ErrorHandling e = new ErrorHandling();
		e.launch(10);	// exercise (a)
		System.out.println();
		e.launch();		// exercise (b)
	}

	public void launch() {
        boolean valid = false;
		long n = 0;
		while(!valid) {
            System.out.print("How many numbers you want to enter? >>");
            n = inputMismatch();
            if (n < 1) {
                System.out.println("Please enter a positive number.");
            } else {
                valid = true;
            }
        }
        launch(n);
	}
	
	public void launch(long total) {
		long i = total;
		int sum = 0;
		while(i>0) {
			long n = inputMismatch();
			sum+=n;
			i--;
		}
		System.out.println("Average = " + sum/total);
	}
	
	public long inputMismatch() {
		long n = 0;
		System.out.print("Please enter a number: ");
		try {
			Scanner sc = new Scanner(System.in);
			n = sc.nextLong();
		} catch(InputMismatchException ex) {
			System.out.println("That is not a number");
		}
		return n;
	}
	
}
			

