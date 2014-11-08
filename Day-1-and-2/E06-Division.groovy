// 6. Division

print("Please enter the first number: ")
String s = System.console().readLine()
int dividend = Integer.parseInt(s)
print("Please enter the second number: ")
s = System.console().readLine()
int divisor = Integer.parseInt(s)
boolean negativeDivisor = false;
if (divisor < 0) {
	negativeDivisor = true;
}

int resultInteger = 0
int count = 0
if (dividend == 0 && divisor == 0) {
	println("0 divided by 0 is indeterminate.")
	System.exit(1)
} else if (divisor == 0) {
	println ("Division by 0 is impossible.")
	System.exit(1)
	
} else if (Math.abs(dividend) >= divisor) {
	while (count <= Math.abs(dividend)) {
		resultInteger++
		count = count + Math.abs(divisor)
	}
if (count > Math.abs(dividend)) {
	resultInteger--
	count = count - Math.abs(divisor)
}

} // groovysh shows that if dividend is negative the remainder is always negative
  // and viceversa
if ((dividend > 0 && negativeDivisor) || (dividend < 0 && !negativeDivisor)) {
	resultInteger = - resultInteger;
}
print(dividend + " divided by " + divisor + " is " + resultInteger)
print(", remainder ")
if (Math.abs(dividend) < Math.abs(divisor)) {
	println(dividend);
} else {
	if(dividend<0) {
		println(-((Math.abs(dividend-(divisor*resultInteger)))));
	} else {
		println(Math.abs(dividend-(divisor*resultInteger)));	
	}
}