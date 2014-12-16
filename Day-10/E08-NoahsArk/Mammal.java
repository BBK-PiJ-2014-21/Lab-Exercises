// 8. Noah's Ark (*)

public abstract class Mammal extends Animal {

	public Mammal(String name) {
		super(name);
	}

	public void reproduce() {
		giveBirth();
	}
	
	public void giveBirth() {
		System.out.println("Giving birth...");
	}
	
	public abstract void makeSound();
}