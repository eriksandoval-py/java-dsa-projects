import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for pounds to convert to kilograms: ");

        double lbs = input.nextDouble();
        System.out.println(lbs + " pounds is " + (0.454 * lbs) + " kilos.");
    
    }
}