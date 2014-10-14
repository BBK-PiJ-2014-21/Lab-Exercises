// 1 - Calculator

System.out.print("Please enter the first number: ");
String s = System.console().readLine()
Double n1 = Double.parseDouble(s)
System.out.print("Please enter the second number: ");
s = System.console().readLine()
Double n2 = Double.parseDouble(s)
while(true) {
	System.out.println("Please select the operation:");
	System.out.println("Press 1 for Addition");
	System.out.println("Press 2 for Subtraction");
	System.out.println("Press 3 for Multiplication");
	System.out.println("Press 4 for Division");
	System.out.print(">> ");
	s = System.console().readLine();
	short operation = Short.parseShort(s);
	if (operation == 1) {
		println(n1+n2);
		break;
	} else if (operation == 2) {
		println(n1-n2);
		break;
	} else if (operation == 3) {
		println(n1*n2);
		break;
	} else eif (operation == 4) {
		println(n1/n2);
		break;
	} else {
		println("Invalid input.")
	}
}