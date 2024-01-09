import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of the loan: ");
        double loanAmount = input.nextDouble();

        System.out.println("Enter the term of the loan in years: ");
        int loanYears = input.nextInt();

        System.out.println("Enter the interest rate of the loan: ");
        double loanInterestRate = input.nextDouble();

        // Get monthly interest rate from annual interest rate
        double monthlyInterestRate = loanInterestRate / 1200;

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, loanYears * 12));
        
        double totalPayment = monthlyPayment * loanYears * 12;

        System.out.println("Your monthly payment is: " + (int)(monthlyPayment * 100) / 100.0);

        System.out.println("Your total payment is: " + (int)(totalPayment * 100) / 100.0);




    }
}
