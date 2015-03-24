package antiAircraftAim;

public class AntiAircraftAim {
	public static void main(String[] args) {
		while(true) {
			System.out.println("=================");
			System.out.println("ANTI-AIRCRAFT AIM");
			System.out.println("=================");
			System.out.println("Please select the dimension of the field.");
			System.out.print("Enter a positive integer please: ");
			String s = System.console().readLine();
			int n = Integer.parseInt(s);
			Target matrix = new Target(n);
			matrix.init();
			System.out.println("Here they come! Try to bring the plane down!");
			while(true) {	
				System.out.print("Enter a coordinate X: ");
				s = System.console().readLine();
				int x = Integer.parseInt(s);
				System.out.print("Enter a coordinate Y: ");
				s = System.console().readLine();
				int y = Integer.parseInt(s);
				System.out.print("Enter a coordinate Z: ");
				s = System.console().readLine();
				int z = Integer.parseInt(s);
				if (matrix.fire(x,y,z) == Result.OUT_OF_RANGE) {
					System.out.println("You missed! That shot is way out of range.");
					continue;
				} else if (matrix.fire(x,y,z) == Result.FAIL_LEFT) {
					System.out.println("You missed! The target is to the right!");
					continue;
				} else if (matrix.fire(x,y,z) == Result.FAIL_RIGHT) {
					System.out.println("You missed! The target is to the left!");
					continue;
				} else if (matrix.fire(x,y,z) == Result.FAIL_HIGH) {
					System.out.println("You missed! The target is below!");
					continue;
				} else if (matrix.fire(x,y,z) == Result.FAIL_LOW) {
					System.out.println("You missed! The target is above!");
					continue;
				} else if (matrix.fire(x,y,z) == Result.FAIL_SHORT) {
					System.out.println("You missed! The target is farther!");
					continue;
				} else if (matrix.fire(x,y,z) == Result.FAIL_LONG) {
					System.out.println("You missed! The target is nearer!");
					continue;
				} else if (matrix.fire(x,y,z) == Result.HIT) {
					System.out.println("You hit it! Well done!");
					break;
				}
			}
			System.out.println("Would you like to play again?");
			System.out.print("'y' for yes, any other button to quit: ");
			s = System.console().readLine();
			if (s.equals("y")) {
				continue;
			} else {
				System.out.println("Goodbye.");
				break;
			}
		}
	}
}
			