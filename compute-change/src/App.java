import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a total  (in the format of xx.xx): ");
        double total = input.nextDouble();

        int remainingAmount = (int)(total *100); // Gives us the total cents

        int dollars = remainingAmount / 100; // Dividing by 100 yields total dollars
        remainingAmount = remainingAmount % 100; // Grabs the remaining cents after taking whole dollars out

        int quarters = remainingAmount / 25; // Dividing by 25 yields the total quarters
        remainingAmount = remainingAmount % 25; // Grabs the remaining cents after taking quarters out

        int dimes = remainingAmount / 10; // Dividing by 10 yields the total dimes
        remainingAmount = remainingAmount % 10;

        int nickels = remainingAmount / 5; // Dividing by 10 yields the total nickels
        
        int pennies = remainingAmount % 5; // What is left over after nickels is the pennies

        System.out.println("Your amount of " + total + " can be broken into: ");

        System.out.println(dollars + " dollars, " + quarters + " quarters, " +
            dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies");


        
    }
}
