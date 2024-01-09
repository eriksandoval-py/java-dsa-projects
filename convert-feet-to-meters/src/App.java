import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        final double CONVERSION_VALUE = 0.305;

        System.out.print("Enter a value for feet that you would like to convert to meters: ");
        double meters = input.nextDouble() * CONVERSION_VALUE;

        System.out.print("Converts to " + meters + " meters.");
    }
}
