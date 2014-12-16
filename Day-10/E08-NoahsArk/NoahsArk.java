// 8. Noah's Ark (*)

public class NoahsArk {
	
	public static void main(String[] args) {
		Insect bee = new Insect("bee");
		Fish dolphin = new Fish("dolphin");
		Amphibian crocodile = new Amphibian("crocodile");
		bee.call();
		bee.makeSound();
		bee.reproduce();
		dolphin.call();
		dolphin.makeSound();
		dolphin.reproduce();
		crocodile.call();
		crocodile.makeSound();
		crocodile.reproduce();
	}
	
}