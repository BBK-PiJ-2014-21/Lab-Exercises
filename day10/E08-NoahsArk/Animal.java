/** 8. Noah's Ark (*)
 * This is the superclass Animal; the name field name will be passed from the specific race object.
 * Two abstract subclasses are descendant of Animal: EggLaying and Mammal; they will implement the reproduce() and makeSound() methods;
 * Below that, the abstract classes Bird, Insect, Fish, Amphibian and Reptile implements some specific specie's behaviour
 * (e.g. Fish and Bird override the call() method as per this specs).
 */
public abstract class Animal {
	private String name;
	/**
	 *
	 */
	public Animal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	/**
	 * When called, all animals answer (i.e. print on screen) "<name of the animal> coming..."/
	 * The exceptions are aquatic animals, which are not affected by the rain and answer
	 * "<name of the animal> will not come..."; and flying animals, that answer "<name of the animal> 
	 * now flying, will come later when tired...". Method call() MUST NOT be implemented in every class:
	 * use inheritance to reuse methods and constructors to pass information to parent classes.
	 */
	public void call() {
		System.out.println(this.name + " coming...");
	}
	/**
	 * The method reproduce() should be overridden to the specific method of reproduction
	 * i.e. layEggs() for insects, fish, amphibians, reptiles and birds, giveBirth() for mammals.
	 */
	public abstract void reproduce();
	/**
	 * All animals make a sound. The method can be implemented by descendant classes.
	 */
	public abstract void makeSound();
}