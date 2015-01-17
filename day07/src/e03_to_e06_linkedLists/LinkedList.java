package e03_to_e06_linkedLists;

/**
* Interface for Singly-linked, Doubly-linked and Circular lists (exercises 3,4,5)
*/
public interface LinkedList {
	/**
	* Add an element in the list;
	*/
	void add(Patient element);
	/**
	* Delete an element in the list;
	*/
	boolean delete(Patient element);
	/**
	* Print the elements in the list;
	*/
	void printList();
	/** 
	* Calculate the length of the list;
	*/
	int calculateLength();
	
}