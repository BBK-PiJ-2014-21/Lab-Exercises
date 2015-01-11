// 9. From array to list

public class ListUtilities {

	public static IntegerList arrayToList(int[] intArray) {	// 9. From array to list
		IntegerList intList = new IntegerList();
		for(int i=0; i<intArray.length; i++) {
			intList.add(intArray[i]);
		}
		return intList;
	}
	
	public static IntegerList sortedList(int[] intArray) {	// 10. A sorted list
		IntegerList intList = new IntegerList();
		for(int i=0; i<intArray.length; i++) {
			intList.insert(intArray[i]);
		}
		return intList;
	}

	public static void bubbleSort(IntegerList intList) {	// 11. Bubble sort (*) not completed
		if(first==null || first.getNext()==null) {
			return;
		} else {
			
	
}