import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a pre-tax sale amount: ");

        double pretaxAmount = input.nextDouble();

        double posttaxAmount = pretaxAmount + ((int)((pretaxAmount * 0.075) * 100) / 100.0);
        System.out.println(pretaxAmount + " after tax is " + posttaxAmount + ".");


    }
}