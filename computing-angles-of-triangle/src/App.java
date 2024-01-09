import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three different points to calculate the angles of the triangle.");
        System.out.println("Enter the the first point (x1): ");
        double x1 = input.nextDouble();
        System.out.println("Enter the first point (y1): ");
        double y1 = input.nextDouble();
        System.out.println("Enter the second point (x2): ");
        double x2 = input.nextDouble();
        System.out.println("Enter the second point (y2): ");
        double y2 = input.nextDouble();
        System.out.println("Enter the third point (x3): ");
        double x3 = input.nextDouble();
        System.out.println("Enter the third point (y3): ");
        double y3 = input.nextDouble();

        // Calculate the length of each side of the triangle
        double a = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double b = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double c = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        // Calculate the angles of the triangle
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        System.out.println("The three angles are " + Math.round(A * 100) / 100.0 + " " + Math.round(B * 100) / 100.0
                + " " + Math.round(C * 100) / 100.0);
                    

        input.close();
        
    }
}
