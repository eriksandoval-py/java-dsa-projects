import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int value = input.nextInt();
        int first = value % 10;j
        value = value / 10;
        int second = value % 10;
        value = value / 10;
        int third = value;
        System.out.println("The sum of all the digits in the integer is: " + (first + second + third));
    }
}
