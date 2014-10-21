// Day Four - 03. A bit more practice with doubles

// JUST A FIRST DRAFT - TO BE COMPLETED
class Mortgage {
	double c = 0;
	int y = 0;
	double r = 0;
	double t = 0;
	
	void printTotalAmount() {
		t = c * (1+r/100);
		System.out.println(t);
		
	}
	
	double printYearlyPayment() {
		double yearlyPayment = t/12;
		return yearlyPayment;
	
}

}

Mortgage myMortgage = new Mortgage();
myMortgage.t = 0;
System.out.print("Please enter the total amount borrowed: ");
String s = System.console().readLine();
myMortgage.c = Double.parseDouble(s);
System.out.print("Please enter the number of years to pay it back: ");
s = System.console().readLine();
myMortgage.y = Integer.parseInt(s);
System.out.print("Please enter the interest rate: ");
s = System.console().readLine();
myMortgage.r = Double.parseDouble(s);
System.out.print("The total amount to be paid is ");
myMortgage.printTotalAmount();
System.out.println("The money to be paid every year is ");
myMortgage.printYearlyPayment();
