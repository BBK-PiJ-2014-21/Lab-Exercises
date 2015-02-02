
public class CatLaunch {
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		if(args.length==0) {
			System.out.println("No filename entered");
		} else {
			for(int i=0; i<args.length; i++) {
				System.out.println(args[i].toUpperCase());
				cat.getFile(args[i]);
				System.out.println();
			}
		}
	}
	
}