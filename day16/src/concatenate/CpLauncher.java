package concatenate;

public class CpLauncher {
	
	public static void main(Strin[] args) {
		CopyFile cp = new CopyFile();
		if(args.length<2) {
			System.out.println("You need to enter at least two filenames.");
		} else {
			cp.readInput(args[0], args[1]);
		}
	}
	
}