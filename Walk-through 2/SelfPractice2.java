//Kim Terrence Quines
//Self Practice 1


import java.util.Scanner;
import java.util.Random;

public class SelfPractice2 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true; 

        while (playAgain) {
            int randomNum = random.nextInt(10) + 1; 
            int attempts = 0;
            int guess = -1;
            String input;

            System.out.println("\nWelcome to the Guessing Game!");
            System.out.println("I have chosen a number between 1 and 10. Try to guess it!");
            System.out.println("Type 'exit' to quit the game at any time.");

            do {
                System.out.print("Enter your guess (or type 'exit' to quit): ");
                input = scanner.next(); 

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("You exited the game. The correct number was: " + randomNum);
                    playAgain = false;
                    break; 
                }

                try {
                    guess = Integer.parseInt(input); 
                    attempts++;

                    if (guess > randomNum) {
                        System.out.println("Too high! Try again.");
                    } else if (guess < randomNum) {
                        System.out.println("Too low! Try again.");
                    } else {
                        System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
                        break; 
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number between 1 and 10 or type 'exit' to quit.");
                }
            } while (guess != randomNum);

            if (playAgain) {
                System.out.print("Do you want to play again? (y/n): ");
                char response = scanner.next().toLowerCase().charAt(0);
                if (response != 'y') {
                    playAgain = false;
                    System.out.println("Thanks for playing! Goodbye!");
                }
            }
        }
        scanner.close();
    }
}
