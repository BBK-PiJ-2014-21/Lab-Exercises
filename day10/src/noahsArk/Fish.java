package noahsArk;// 8. Noah's Ark (*)

public class Fish extends EggLaying {
	
	public Fish(String name) {
		super(name);
	}
	
	@Override
	public void call() {
		System.out.println(this.getName() + " will not come...");
	}
	
	public void makeSound() {
		System.out.println("BLUB...");
	}
	
}