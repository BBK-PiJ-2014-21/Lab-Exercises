// 8. Noah's Ark (*)

public class Amphibian extends Animal implements EggLaying {
	
	public Amphibian(String name) {
		super(name);
	}
	
	public void reproduce() {
		layEggs();
	}
	
	public void makeSound() {
		System.out.println("PSSS...");
	}

}