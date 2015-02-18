package concatenate;

public class CatLaunch {
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		if(args.length==0) {
			System.out.println("No filename entered");
		} else {
			for(String out : args) {
				System.out.println(out.toLowerCase());
				cat.getFile(out);
				System.out.println();
			}
		}
	}
	
}