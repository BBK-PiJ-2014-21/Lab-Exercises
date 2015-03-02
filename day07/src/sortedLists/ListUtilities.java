package sortedLists;

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
    // TODO TO TEST
	public static void bubbleSort(IntegerList intList) {	// 11. Bubble sort (*) not completed
        if(intList.size()<2) {
            return;
        } else {
            boolean finish = false;
            while(!finish) {
                finish = true;
                IntNode previous = intList.getFirst();
                IntNode aux = intList.getFirst();
                while(aux.getNext()!=null) {
                    aux = aux.getNext();
                    if (previous.getValue() > aux.getValue()) {
                        finish = false;
                        int temp = previous.getValue();
                        previous.setValue(aux.getValue());
                        aux.setValue(temp);
                    }
                    previous = previous.getNext();
                }
            }
        }
    }

}