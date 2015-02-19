package concatenate;

/**
 *
 */
public class CpDirLauncher {
    
    public static void main(String[] args) {
        CopyFile cp = new CopyFile();
        if(args.length<=1) {
            System.out.println("You need to enter at least two arguments.");
        } else {
            String[] input = new String[args.length-1];
            for(int i=0; i<input.length; i++) {
                input[i] = args[i];
            }
            cp.copyToDirectory(input, args[args.length-1]);
        }
    }
    
}
