package phone;// 1. Extension, extension...

public class OldPhone implements Phone {
	private String brand = null;	// 3. Passing information to ancestor classes
	
	public OldPhone(String brand) {
		this.brand = brand;
	}
	
	public void call(String number) {
		System.out.println("Calling " + number + "...");
	}
	
	public String getBrand() {	// 3. Passing information to ancestor classes
		return brand;
	}
	
}