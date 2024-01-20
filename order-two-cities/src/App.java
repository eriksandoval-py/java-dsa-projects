import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first city: ");
        String city1 = input.nextLine();
        System.out.println("Enter second city: ");
        String city2 = input.nextLine();


        // Compare the two cities
        // The compare to method returns 0 if equal, 1 if greater than, -1 if less than
        // In this case, less than would be the first city in alpahbetical order
        if (city1.compareTo(city2) < 0) {
            System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
        } else {
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
        }
    }
}
