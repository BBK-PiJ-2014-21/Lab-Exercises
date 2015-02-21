package uniq;

/**
 *
 */
public class UniqLaunch {
    
    public static void main(String[] args) {
        if(args.length!=1) {
            System.out.println("USAGE: Please enter one String as the file to print.");
        } else {
            Uniq u = new Uniq();
            u.uniq(args[0]);
        }
        
    }
    
}
