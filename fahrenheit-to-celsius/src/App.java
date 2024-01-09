import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println(fahrenheit + " degrees in F converts to " + celsius + " degrees in C.");

    }
}
