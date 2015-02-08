package phone;/* 4.2 Reducing visibility
 * cannot override with access private, as it outputs
 * "attempting to assign weaker access privileges; was public"
 * it seems therefore necessary to override the code itself
 * inside the public method.
 */

public class RestrictedSmartPhone extends SmartPhone {
	
	public RestrictedSmartPhone(String brand) {
		super(brand);
	}

	@Override
	public void playGame(String game) {
		System.out.println(game + " has restricted access on this version of " + getBrand());
	}
	
}