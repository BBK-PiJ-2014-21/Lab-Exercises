// 5. Multiplication

println("Please enter the first number: ")
String s = System.console().readLine()
int firstNumber = Integer.parseInt(s)
println("Now enter the second number: ")
s = System.console().readLine()
int secondNumber = Integer.parseInt(s)
int secondNumber2 = secondNumber;
int result = firstNumber;

if (firstNumber == 0 || secondNumber == 0) {
	result = 0;
} else if (secondNumber > 0) {
	while (secondNumber2 > 1) {
		secondNumber2--;
		result = result + firstNumber;
	}
	if (firstNumber < 0) {
		result = - result;
	}
} else if (secondNumber < 0) {
	while (secondNumber2 < -1) {
		secondNumber2++;
		result = result + firstNumber;
	}
	if (firstNumber>0) {
		result = - result;
	}
}
println(firstNumber + " multiplied by " + secondNumber + " is " + result + ".");
