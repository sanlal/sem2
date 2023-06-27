package b_tech_assignment1;

import java.util.Scanner;
import java.util.Random;

public class ques21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // generate a random number between 1 and 100
        int numGuesses = 0;
        int guess;
        boolean gameOver = false;
        
        System.out.println("Welcome to the number guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        
        while (!gameOver) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numGuesses++;
            
            if (guess == secretNumber) {
                System.out.println("Congratulations, you guessed it in " + numGuesses + " tries!");
                gameOver = true;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
            
            if (numGuesses >= 10) {
                System.out.println("Sorry, you've reached the maximum number of guesses. The secret number was " + secretNumber + ".");
                gameOver = true;
            }
        }
    }
}

