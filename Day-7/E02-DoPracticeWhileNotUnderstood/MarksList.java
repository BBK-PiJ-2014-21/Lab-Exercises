// 2. do {practice} while (!understood);

import java.util.Scanner;

public class MarksList {
	private int students = 0;
	private int distinctions = 0;
	private int pass = 0;
	private int fails = 0;
	private int invalid = 0;

	
	public void readLine() {
		Scanner getInput = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("Enter a mark: ");
			n = getInput.nextInt();
			if(n<-1 || n>100) {
				invalid++;
			} else {
				if (n!=-1) {
					students++;
					if(n>=0 && n<50) {
						fails++;
					} else if (n<70) {
						pass++;
					} else {
						distinctions++;
					}
				}
			}
		} while (n!=-1);
	}
	
	public void finalOutput() {
		if(students<1) {
			System.out.println("There are no students.");
		} else if (students==1) {
			System.out.print("There is one student: ");
		} else {
			System.out.print("There are " + students + " students: ");
		}
		if(distinctions==1) {
			System.out.print("1 distinction, ");
		} else {
			System.out.print(distinctions + " distinctions, ");
		}
		if(pass==1) {
			System.out.print("1 pass, ");
		} else {
			System.out.print(pass + " passes, ");
		}
		if(fails==1) {
			System.out.print("1 fail");
		} else {
			System.out.print(fails + " fails");
		}
		if(invalid==1) {
			System.out.println(" (plus 1 invalid)");
		} else if(invalid>1) {
			System.out.println(" (plus " + invalid + " invalids)");
		} else {
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		MarksList list = new MarksList();
		list.readLine();
		list.finalOutput();
	}	
	
}
	
					
					
					
			
			