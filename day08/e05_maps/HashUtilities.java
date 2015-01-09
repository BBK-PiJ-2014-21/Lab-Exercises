// 5.1 Hash function

package E05_maps;

public class HashUtilities {
	
	public static int shortHash(int value) {
		return Math.abs(value%1000);
	}

}