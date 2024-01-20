import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);

        System.out.print("Lottery number has been generated...");

        System.out.print("Enter a lottery number guess (two digits): ");
        String guess = input.nextLine();

        // Grab the generated digits from the lottery string
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        // Grab the input digits from lottery guess
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.print("The lottery number is " + lottery);

        // Check the guess
        if (guess.equals(lottery)) {
            System.out.print("Exact match. You win $10,000.");
        }
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            System.out.print("Matched all digits. You win $3,000.");
        }
        else if (guessDigit1 == lotteryDigit1 ||
                guessDigit1 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit1 ||
                guessDigit2 == lotteryDigit2) {
            System.out.print("Matched one digit. You win $1,000.");    
        }
        else {
            System.out.print("Sorry. No match.");
        }
        input.close();        
    }
}
