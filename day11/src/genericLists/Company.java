package genericLists;

/**
 * This class keeps two linked lists, one with the names of the employees
 * and one with their National Insurance Number.
 * Deletion of an element in a list (either the employee name or his NIN) should automatically cause 
 * the deletion of the corresponding value in the other list, so at the same index of both list
 * should be the corresponding value.
 * Also this class accepts duplicate names but not duplicate insurance numbers: it does a check before 
 * adding a nino: if it is attempted to add a number already in the list, the request is ignored.
 */
public class Company {
    private DoublyLinkedList<String> employeeName;
    private DoublyLinkedList<Integer> ninoList;
    
    public Company() {
        employeeName = new DoublyLinkedList<String>();
        ninoList = new DoublyLinkedList<Integer>();
    }
    
    public void add(String name, Integer nino) {
        if (!ninoList.contains(nino)) {
            employeeName.add(name);
            ninoList.add(nino);
        }
    }
    
    public void delete(String name) {
        int index = employeeName.indexOf(name);
        if(index!=-1) {
            employeeName.delete(name);
            Integer ninToDelete = ninoList.get(index);
            ninoList.delete(ninToDelete);
        }
    }

    public void delete(Integer nino) {
        int index = ninoList.indexOf(nino);
        if(index!=-1) {
            ninoList.delete(nino);
            String nameToDelete = employeeName.get(index);
            employeeName.delete(nameToDelete);
        }
    }
    
    public void printList() {
        if (employeeName.size() == 0) {
            System.out.println("<the list is empty>");
        } else {
            for (int i = 0; i < employeeName.size(); i++) {
                System.out.println(i + ". " + employeeName.get(i) + " (" + ninoList.get(i) + ")");
            }
        }
    }
    
    public int size() {
        return employeeName.size(); 
    }
    
}
