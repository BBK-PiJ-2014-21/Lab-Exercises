// 3. A bit more practice with doubles

// TODO double values should be rounded

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
