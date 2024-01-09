import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a total: ");
        double total = input.nextDouble();
        System.out.print("Enter a tip percentage: ");
        double percentage = input.nextDouble();
        percentage = percentage / 100.0;
        double tip = total * percentage;
        System.out.println("Your tip would be " + tip + " and the total would be " + (tip + total));
    }
}
