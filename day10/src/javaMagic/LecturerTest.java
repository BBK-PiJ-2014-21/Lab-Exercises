package javaMagic;// 6. Java magic

public class LecturerTest {
	
	public static void main(String[] args) {
		Lecturer john = new Lecturer("John");
		System.out.println("javaMagic.Lecturer name: " + john.getName());
		john.doResearch("Anthropology");
		john.teach("History");
	}
	
}