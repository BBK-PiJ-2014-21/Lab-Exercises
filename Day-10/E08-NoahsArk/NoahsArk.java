// 8. Noah's Ark (*)

public class NoahsArk {
	private Animal[] ark;
	
	public NoahsArk() {
		ark = new Animal[10]; 
	}
	
	public void testMethods() {
		for(int i=0; i<ark.length; i++) {
			if(ark[i]==null) {
				break;
			} else {
				ark[i].call();
				ark[i].makeSound();
				ark[i].reproduce();
			}
		}
	}
	
	public void fetch(Animal a) {
		for(int i=0; i<ark.length; i++) {
			if(ark[i]==null) {
				ark[i] = a;
				return;
			}
		}
		Animal[] temp = ark;
		ark = new Animal[temp.length*2];
		for(int i=0; i<temp.length; i++) {
			ark[i] = temp[i];
		}
	}	

	public static void main(String[] args) {
		NoahsArk ark = new NoahsArk();
		Animal bear = new Bear();
		ark.fetch(bear);
		Animal beetle = new Beetle();
		ark.fetch(beetle);
		Animal cat = new Cat();
		ark.fetch(cat);
		Animal crocodile = new Crocodile();
		ark.fetch(crocodile);
		Animal dog = new Dog();
		ark.fetch(dog);
		Animal dolphin = new Dolphin();
		ark.fetch(dolphin);
		Animal eagle = new Eagle();
		ark.fetch(eagle);
		Animal fly = new Fly();
		ark.fetch(fly);
		Animal frog = new Frog();
		ark.fetch(frog);
		Animal lizard = new Lizard();
		ark.fetch(lizard);
		Animal monkey = new Monkey();
		ark.fetch(monkey);
		Animal pigeon = new Pigeon();
		ark.fetch(pigeon);
		Animal salmon = new Salmon();
		ark.fetch(salmon);
		Animal shark = new Shark();
		ark.fetch(shark);
		Animal snake = new Snake();
		ark.fetch(snake);
		Animal whale = new Whale();
		ark.fetch(whale);
		ark.testMethods();
	}

}