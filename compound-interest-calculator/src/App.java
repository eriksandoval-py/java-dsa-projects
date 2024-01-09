import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double lastMonthBalance = 0;
        double newBalance = 0;
        
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble() / 100;
        double monthlyInterestRate = annualInterestRate / 12;

        System.out.print("Enter a monthly savings deposit amount: ");
        int monthlyDeposit = input.nextInt();

        System.out.print("Enter month to check balance (int value): ");
        int monthToCheck = input.nextInt();

        for (int i = 0; i < monthToCheck; i++) {
            newBalance = (monthlyDeposit + lastMonthBalance) * (1 + monthlyInterestRate);
            lastMonthBalance = newBalance;
        }

        input.close();

        System.out.print("Your balance after " + monthToCheck + " months would at " + annualInterestRate + " interest annually " +
            "with a $" + monthlyDeposit + " monthly deposit would be $" + String.format("%.2f", newBalance) + ".");
    }
} 
