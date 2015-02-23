package concatenate;

public class CatLaunch {
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		if(args.length==0) {
			System.out.println('\n' + "No filename entered");
		} else {
			for(String out : args) {
				System.out.println('\n' + out);
				cat.getFile(out);
				System.out.println();
			}
		}
	}
	
}