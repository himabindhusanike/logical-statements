package methods;

public class LoanManagement {

				String customerName;
				double loanAmount;
				double interestRate;
				double loanTenure;
				double simpleInterest;
				double totalAmount;
				double monthlyEmi;
				
				double calculateInterest(double loanAmount, double interestRate) {
					simpleInterest = (loanAmount * interestRate * loanTenure) / 100;
					return simpleInterest;
				}
				double calculateTotalAmount(double simpleInterest) {
					totalAmount = loanAmount + simpleInterest; 
					return totalAmount;
				}
				double calculateMonthlyEMI(double totalAmount) {
					monthlyEmi = totalAmount / (loanTenure * 12);
					return monthlyEmi;
				}
				void displayLoanSummary() {
					System.out.println("customerName: " + customerName);
					System.out.println("loanAmount: " + loanAmount);
					System.out.println("interestRate: " + interestRate);
					System.out.println("loantenure: " + loanTenure);
					System.out.println("simpleInterest: " + simpleInterest);
					System.out.println("totalAmount: " + totalAmount);
					System.out.println("monthlyEmi: " + monthlyEmi);
				}
			public static void main(String[] args) {
				LoanManagement l = new LoanManagement();
				l.customerName = "Rekha";
				l.loanAmount = 25000;
				l.interestRate = 5;
				l.loanTenure = 2;
				l.calculateInterest(l.loanAmount, l.interestRate);
				l.calculateTotalAmount(l.simpleInterest);
				l.calculateMonthlyEMI(l.totalAmount);
				l.displayLoanSummary(); 
	}

}
