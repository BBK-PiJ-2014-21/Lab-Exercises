package sort;

/**
 *
 */
public class SortLaunch {
    
    public static void main(String[] args) {
        if(args.length!=1) {
            System.out.println("USAGE: Please enter a String as the name of the file you would like to print sorted");
        } else {
            Sort s = new Sort();
            s.sort(args[0]);
        }
        
    }
    
}
