import java.util.Scanner;

public class Q10 {
    static void main() {
        Scanner input = new Scanner(System.in);

        final int MonthsinYear = 12;

        // 1. Input Loan Details
        System.out.print("Enter loan amount : ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percent : ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter loan period in years : ");
        int loanPeriod = input.nextInt();

        // Calculate Interest Rate/Month
        // Formula: annualIntRate / 100.0 / 12
        double monthlyInterestRate = annualInterestRate / 100.0 / MonthsinYear;

        // Calculate No. of Payments
        int noOfPayment = loanPeriod * MonthsinYear;

        // Calculate Monthly Payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 / (1 + monthlyInterestRate), noOfPayment));

        // Calculate Total Payment
        double totalPayment = monthlyPayment * noOfPayment;

        // Output Results
        System.out.println("\n--- Loan Summary ---");
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Annual Interest: " + annualInterestRate);
        System.out.println("Loan Period: " + loanPeriod);
        System.out.println("-------------------------------");
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);
        System.out.println("Total Interest: " + (totalPayment - loanAmount));

        input.close();
    }
}
