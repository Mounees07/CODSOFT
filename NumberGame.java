import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        playGame();
    }
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int generatedNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 5;
        System.out.println("Guess the number between 1 and 100!");
        System.out.println("You have " + maxAttempts + " attempts.");
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! Your guess is correct.");
                System.out.println("Number of attempts: " + attempts);
                return;
            } else if (userGuess < generatedNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            int remainingAttempts = maxAttempts - attempts;
            System.out.println("Remaining attempts: " + remainingAttempts);
        }
        System.out.println("You've run out of attempts!");
        System.out.println("The number was: " + generatedNumber);
    }
}
