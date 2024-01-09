import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        final double PI = 3.14;

        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();
        
        double area = PI * (radius * radius);
        double volume = area * length;
        System.out.print("Given a cylinder with a radius of " + radius +
            " and a length of " + length + " the area is " + area + ", and the volume is " +
            volume);
    }
}
