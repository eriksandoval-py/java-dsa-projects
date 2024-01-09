import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of minutes: ");
        long minutes = input.nextLong();

        long minutesInADay = 60 * 24;
        long minutesInAYear = minutesInADay * 365;

        long years = minutes / minutesInAYear;
        long days = (minutes % minutesInAYear) / minutesInADay;

        System.out.print("That would be " + years + " years, and " + days + " days.");

    }
}
