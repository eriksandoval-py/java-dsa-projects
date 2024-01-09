import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double kilograms = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        double energy = kilograms * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy required to heat " + kilograms + " kilograms of water from " +
            initialTemperature + " degress Celsius to " + finalTemperature + " degrees Celsius is " + energy +
            " joules.");


    }
}
