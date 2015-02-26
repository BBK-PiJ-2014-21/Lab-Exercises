// 4. Binary and decimal

class Mortgage {
    double cost = 0;
    double rate = 0;
    int years = 0;
    double totalAmount = 0;
    double yearlyPayment = 0;

    double getTotalAmount() {
        totalAmount = cost * (1 + rate / 100)
        return totalAmount;
    }

    double getYearlyPayment() {
        double yearlyPayment = totalAmount / years;
        return yearlyPayment;
    }

    double getYearsToCleanInterest(Mortgage mortgage) {
        mortgage.getTotalAmount();
        mortgage.getYearlyPayment();
        double yearsToCleanInterest = (mortgage.totalAmount - cost) / mortgage.yearlyPayment;
        return (yearsToCleanInterest);
    }

}
