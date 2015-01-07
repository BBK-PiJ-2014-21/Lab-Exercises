// 1. Extension, extension...

public class SmartPhone extends MobilePhone {
	
	public SmartPhone(String brand) {
		super(brand);	// 3. Passing information to ancestor classes
	}
	
	public void browseWeb(String url) {
		System.out.println("Opening " + url + "...");
	}
	
	public double[] findPosition() {
		double[] location = {51.52140989999999, -0.1302395999999817};
		System.out.println("Latitude: " + location[0]);
		System.out.println("Longitude: " + location[1]);
		return location;
	}
	
	@Override	// 2. Overriding
	public void call(String number) {
		if(number.charAt(0)=='0' && number.charAt(1)=='0') {
			System.out.println("Calling " + number + " through the internet to save money");
			saveCall(number);
		} else {
			super.call(number);
		}
	}

	public void playGame(String gameName) {	// 4.1 Increasing visibility
		System.out.println("Opening " + gameName + "...");
	}
	
}
	