package concatenate;

public class CpLauncher {
	
	public static void main(String[] args) {
		CopyFile cp = new CopyFile();
		if(args.length<2) {
			System.out.println("You need to enter at least two file names.");
		} else {
			cp.copyToFile(args[0], args[1]);
		}
	}
	
}