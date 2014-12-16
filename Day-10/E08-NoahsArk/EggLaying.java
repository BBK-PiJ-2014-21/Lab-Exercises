// 8. Noah's Ark (*)

public abstract class EggLaying extends Animal {
		
	public EggLaying(String name) {
		super(name);
	}
	
	public void reproduce() {
		layEggs();
	}
	 
	public void layEggs() {
		System.out.println("Laying Eggs...");
	}
	
	public abstract void makeSound();
}


	
	