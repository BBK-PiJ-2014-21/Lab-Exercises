/* 3. A bit more practice with doubles
	to fix: double values should be rounded
*/

class Mortgage {
	double cost = 0;
	double rate = 0;
	int years = 0;
	double totalAmount = 0;
	double yearlyPayment = 0;
	
	double getTotalAmount() {
		totalAmount = cost*(1+rate/100)
		return totalAmount;
		
	}
	
	double getYearlyPayment() {
		double yearlyPayment = totalAmount/years;
		return yearlyPayment;
	
	}

	double getYearsToCleanInterest(Mortgage mortgage) {
		mortgage.getTotalAmount();
		mortgage.getYearlyPayment();
		double yearsToCleanInterest = (mortgage.totalAmount-cost)/mortgage.yearlyPayment;
		return(yearsToCleanInterest);
	
	}

}

Mortgage myMortgage = new Mortgage();
System.out.print("Please enter the total amount borrowed: ");
String s = System.console().readLine();
myMortgage.cost = Double.parseDouble(s);
System.out.print("Please enter the interest rate: ");
s = System.console().readLine();
myMortgage.rate = Double.parseDouble(s);
System.out.print("Please enter the number of years to pay it back: ");
s = System.console().readLine();
myMortgage.years = Integer.parseInt(s);
System.out.print("The total amount to be paid is ");
System.out.println(myMortgage.getTotalAmount());
System.out.print("The money to be paid every year is ");
System.out.println(myMortgage.getYearlyPayment());
System.out.print("The number of years before the interest is paid is ");
System.out.println(myMortgage.getYearsToCleanInterest(myMortgage));
