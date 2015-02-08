package javaMagic;// 6. Java magic
 
/**
 * A lecturer has both teaching and research responsibilities
 */
public class Lecturer extends Teacher {
	// it is necessary to pass to the constructor a String argument as in javaMagic.Teacher class
	public Lecturer(String name) {
		super(name);
	}
	
	public void doResearch(String topic) {
		System.out.println("Doing research on: " + topic);
	}
	
}
