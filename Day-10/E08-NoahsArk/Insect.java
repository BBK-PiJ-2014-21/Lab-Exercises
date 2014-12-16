// 8. Noah's Ark (*)

public class Insect extends Animal implements EggLaying {
	
	public Insect(String name) {
		super(name);
	}

	public void reproduce() {
		layEggs();
	}
	
	public void makeSound() {
		System.out.println("BUZZ...");
	}
}