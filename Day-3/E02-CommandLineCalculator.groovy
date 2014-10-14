// 2 - Command-line calculator (*)

// doesn't work with addition, it makes some weird concatenation;
// still have to find out why.

System.out.println("Command-line calculator for the four basic operations.");
while (true) {
	System.out.print(">> ");
	String s = System.console().readLine()
	int i = 1;
	String operation, operationValues = "";
	for (i=1; i<s.length()-1; i++) {
		if (s.charAt(i) == '+') {
			System.out.print(i);
			operation = "+";
			break;
		} else if (s.charAt(i) == '-') {
			operation = "-";
			break;
		} else if (s.charAt(i) == '*') {
			operation = "*";
			break;
		} else if (s.charAt(i) == '/') {
			operation = "/";
			break;
		}
	}
	operationValues = s.substring(0,i);
	Double operand = Double.parseDouble(operationValues);
	operationValues = s.substring(i+1);
	Double operator = Double.parseDouble(operationValues);
	if (operation.equals("+")) {
		println(operand+operator);
	} else if (operation.equals("-")) {
		println(operand-operator);
	} else if (operation.equals("*")) {
		println(operand*operator);
	} else if (operation.equals("/")) {
		println(operand/operator);
	}	
	print("Press q to quit, any other button to start again >> ");
	String again = System.console().readLine();
	if (again == "q") {
		break;
	} 
}	
	