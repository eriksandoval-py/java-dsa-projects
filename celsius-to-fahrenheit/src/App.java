import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Celsius value to convert to Fahrenheit: ");
        double value = input.nextDouble();

        double fahrenheit = (9.0 / 5) * value + 32;

        System.out.print(value + "C is " + fahrenheit + "F");


    }
}
