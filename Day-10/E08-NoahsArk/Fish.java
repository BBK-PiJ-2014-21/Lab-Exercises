// 8. Noah's Ark (*)

public class Fish extends Animal implements EggLaying {
	
	public Fish(String name) {
		super(name);
	}
	
	@Override
	public void call() {
		System.out.println(this.getName() + " will not come...");
	}
	
	public void reproduce() {
		layEggs();
	}
	
	public void makeSound() {
		System.out.println("BLUB...");
	}
	
}