// 7. Big enough (*)

//  should change this code and use ArrayList();

import java.util.Scanner;

public class BigEnough {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee list = new Employee(2);
		String nameString = "";
		int idNumber = 0;
		int i=0;
		int j=0;
		while(true) {		
			System.out.print("Please enter the name of the employee");
			System.out.print(" (end with empty string) >> ");
			nameString = input.nextLine();
			if(nameString.length() == 0) {
				break;
			}
			System.out.print("Please enter the ID number");
			System.out.print(" (end with 0) >> ");
			idNumber = input.nextInt();
			input.nextLine();
			if(idNumber == 0) {
				break;
			}
			if(list.name[list.name.length-1] != null) {
				list.copyList();
			}
			list.name[i] = nameString;
			list.id[i] = idNumber;
			i++;
			}
		System.out.println("===============================================");
		list.printEvenID();
		System.out.println("===============================================");
		System.out.print("Search employee name or first letter(s): >> ");
		nameString = input.nextLine();
		list.printNameSearch(nameString);
		System.out.println("===============================================");
	}
}