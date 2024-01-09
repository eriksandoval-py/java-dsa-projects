import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal digit: ");
        String hexString = input.nextLine();

        if (hexString.length() != 1) {
            System.out.print("You must enter exactly one character as a valid input.");
            System.exit(1);
        }

        char ch = Character.toUpperCase(hexString.charAt(0));
        if (ch >= 'A' && ch <= 'F') {
            int value = ch - 'A' + 10;
            System.out.print("The decimal value for hex digit " + ch + " is " + value);
        }
        else if (Character.isDigit(ch)) {
            System.out.print("The decimal value for hex digit " + ch + " is " + ch);
        }

        input.close();
        
        

    }
}
