import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for v0: ");
        double v0 = input.nextDouble();

        System.out.print("Enter a value for v1: ");
        double v1 = input.nextDouble();

        System.out.print("Enter a value for t (time): ");
        double t = input.nextDouble();

        double acceleration = (v1 - v0) / t;

        System.out.print("The acceleration is " + acceleration);
    }
}
