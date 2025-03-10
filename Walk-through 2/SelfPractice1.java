//Kim Terrence Quines
//Self Practice 1


import java.util.Scanner;
import java.util.Random;

public class SelfPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        int guess;
        int retry = 0;

        System.out.println("Welcome to Guessing Game!");
        System.out.println("I have chosen a number between 1 and 10. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            retry++;

            if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + retry + " attempts.");
            }
        } while (guess != randomNumber);
        sc.close();
    }
}
