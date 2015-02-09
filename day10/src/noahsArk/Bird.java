package noahsArk;// 8. Noah's Ark (*)

public class Bird extends EggLaying {
	
	public Bird(String name) {
		super(name);
	}
	
	@Override
	public void call() {
		System.out.println(this.getName() + " now flying, will come later when tired...");
	}
	
	public void makeSound() {
		System.out.println("WHISTLE...");
	}
	
}