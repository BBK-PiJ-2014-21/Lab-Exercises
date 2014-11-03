// 2. Copying arrays - Tester

import java.util.Arrays;

public class ArrayCopier_Tester {
	public static void main(String[] args) {
		ArrayCopier a = new ArrayCopier();
		int[] sameSizeSource = {5,6,7,8};
		int[] sameSizeDestination = {1,2,3,4,};
		int[] longerSource = {55,66,77};
		int[] shorterDestination = {3999};
		int[] shorterSource = {6, 2};
		int[] longerDestination = new int[10];
		
		System.out.println("Array source = " + Arrays.toString(sameSizeSource));
		System.out.println("Array destination = " + Arrays.toString(sameSizeDestination));
		a.copy(sameSizeSource, sameSizeDestination);
		System.out.println("Array destination after copy() = " + Arrays.toString(sameSizeDestination) + "\n");
		
		System.out.println("Array source = " + Arrays.toString(longerSource));
		System.out.println("Array destination = " + Arrays.toString(shorterDestination));
		a.copy(longerSource, shorterDestination);
		System.out.println("Array destination after copy() = " + Arrays.toString(shorterDestination)+"\n");
		
		System.out.println("Array source = " + Arrays.toString(shorterSource));
		System.out.println("Array destination = " + Arrays.toString(longerDestination));
		a.copy(shorterSource, longerDestination);
		System.out.println("Array destination after copy() = " + Arrays.toString(longerDestination)+"\n");
		
	}
	
}