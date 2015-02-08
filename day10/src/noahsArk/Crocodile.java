package noahsArk;// 8. Noah's Ark

public class Crocodile extends Amphibian {
	
	public Crocodile() {
		super("noahsArk.Crocodile");
	}
	
	@Override
	public void makeSound() {
		System.out.println("GRUNT...");
	}
	
}