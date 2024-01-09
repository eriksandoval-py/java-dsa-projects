

public class App {
    public static void main(String[] args) throws Exception {

        // Grab the current ms elapsed since Unix epoch.
        long currentTimeMillis = System.currentTimeMillis();

        // Total seconds can be derived by dividing ms by 1000.
        // There are 1000 ms in each second. 
        long seconds = currentTimeMillis / 1000;

        // Compute the current second by taking the remainder
        // of total seconds % 60.
        long currentSecond = seconds % 60;

        // Total minutes can be derived by dividing seconds by 60.
        // There are 60 seconds in each minute. 
        long minutes = seconds / 60;

        // Compute the current minute by taking the remainder
        // of total minutes % 60.
        long currentMinute = minutes % 60;

        // Hours can be derived by dividing minutes by 60. 
        // There are 60 minutes in each hour.
        long hours = minutes / 60;

        // Compute the current hour by taking the remainder
        // of total hours % 24.
        long currentHour = hours % 24;

        // Create string for current time by concatenating all the variables. 
        String currentTime = currentHour + ":" + currentMinute + ":" + currentSecond + " GMT";

        System.out.println(currentTime);


    

    }
}
