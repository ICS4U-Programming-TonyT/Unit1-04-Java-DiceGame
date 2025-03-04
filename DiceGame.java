import java.util.Scanner;
import java.util.Random;
/**

* This will calculate the amount of time to reheat a food.

*

* @author  Tony Tran

* @version 1.0

* @since   2025-02-24

*/

final class DiceGame {
    /**
     * @exception IllegalStateException
     * @see IllegalStateException
     */
    private DiceGame() {
        throw new IllegalStateException("Utility class");
    }
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        try {
            // This will generate a random number between 1 to 6
            int wrongGuess = 0;
            int randomNumber = random.nextInt(7);
            int userGuess = 0;
            // This will keep asking the user to guess until they get it right
            while (userGuess != randomNumber) {
                System.out.print("Guess a number between 1 to 6: ");
                userGuess = Integer.parseInt(scanner.nextLine());
                // This will check if the user input is between 1 to 6
                if (userGuess <= 6 && userGuess >= 1) {
                    // This will check if the user guess is correct
                    if (userGuess == randomNumber) {
                        // This print out number of tries it took the user guess
                        System.out.print("You are correct! \n It took you "
                         + wrongGuess + " tries.");
                    } else {
                        // This will print out if the user guess is wrong
                        wrongGuess += 1;
                        System.err.println("Guess again.");
                    }
                } else {
                    System.out.println("This isn't between 1 to 6."
                     + " This won't count.");
                }
            }
            scanner.close();
        } catch (NumberFormatException error) {
            System.out.println("This is not an integer. " + error.getMessage());
        }
    }
}
