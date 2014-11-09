// 7. Integer

class Integer2 {
	int value;
	
	int getValue() {
		return value;
	}
	
	void setValue(int n) {
		value = n;
	}
	
	boolean isEven() {
		boolean isEven = true;		
		if (value%2 == 1) {
			isEven = false;
		}
		return isEven;
	}
	
	boolean isOdd() {
		boolean isOdd = true;
		if (value%2 == 0) {
			isOdd = false;
		}
		return isOdd;
	}
	
	void prettyPrint() {
		System.out.println(value);
	}
	
	String toString() {
		String valueString;
		valueString = Integer.toString(value);
		return valueString;
	}
	
}

Integer2 i2 = new Integer2();
print("Enter a number ");
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
print("The number you entered is ");
if (i2.isEven()) {
	println("even");
} else if (i2.isOdd()) {
	println("odd");
} else {
	println("undefined! Your code is buggy!");
}
int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
	println("Your toString() method seems to work fine.");
}