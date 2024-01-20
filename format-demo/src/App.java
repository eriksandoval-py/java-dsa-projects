public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");

        int degrees = 90;

        double radians = Math.toRadians(degrees);

        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

        degrees = 180;

        radians = Math.toRadians(degrees);

        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
        
    }
}
