import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 5;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + attempts + " attempts to guess the number.");

        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number in " + (i + 1) + " attempts.");
                return; 
            } else if (guess < numberToGuess - 10) {
                System.out.println("Way too low! Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("A little low! Try again.");
            } else if (guess > numberToGuess + 10) {
                System.out.println("Way too high! Try again.");
            } else {
                System.out.println("A little high! Try again.");
            }
        }
        
        System.out.println("Sorry, you didn't guess the number. The number was " + numberToGuess + ".");
    }
}
