package sortedLists;// 9. From array to list / 10. A sorted list

public class ListTests {
	
	public static void main(String[] args) {
		ListUtilities util = new ListUtilities();
		int[] intArray = {1, 9, 8, 7, 6, 5, 3};
		System.out.println("UNSORTED");
		util.arrayToList(intArray).prettyPrint();
		System.out.println("SORTED");
		util.sortedList(intArray).prettyPrint();
		
	}
	
	
}