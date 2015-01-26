// 4. More patients

public class MorePatients {
	
	private class Patient {
		String name;
		int age;
	
		private Patient(String name, int age) {
			this.name = name;
			if(age<0 || age>130) {
				throw new IllegalArgumentException();
			} else {
				this.age = age;
			}
		}
	}
	
	public void getData() {
		System.out.print("Please enter the name of the next Patient: ");
		// TODO: to be completed
	
}