// 7. Big enough (*) - Employee List class

import java.util.Arrays;

public class Employee {
	public String[] name;
	public int[] id;
	
	public Employee(int n) {
		name = new String[n];
		id = new int[n];
	}
	
	public void copyList() {
		name = Arrays.copyOf(name, name.length*2);
		id = Arrays.copyOf(id, id.length*2);	
	}
	
	public void printEvenID() {
		System.out.println("Employees with even ID:");
		int count=0;
		for(int i=0; i<name.length; i++) {
			if(id[i]%2==0) {
				if(name[i]!=null) {
					System.out.print(name[i]);
					System.out.println(" (" + id[i] + ")");
					count++;
				}
			}
		}
		if (count==0) {
			System.out.println("<none found>");
		}
	}
	
	public void printNameSearch(String s) {
		System.out.println("Employees with name starting with \"" + s + "\":");
		int count=0;
		for(int i=0; i<name.length; i++) {
			if(name[i]!= null && name[i].length() >= s.length()) {
					if(name[i].substring(0,s.length()).equalsIgnoreCase(s)) {
						System.out.print(name[i]);
						System.out.println(" (" + id[i] + ")");
						count++;
					}
			}			
		}
		if (count==0) {
			System.out.println("<none found>");
		}
	}

}