import java.util.Random;
import java.util.Scanner;
public class index{
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        int attempts = 0;

        System.out.println("🎮 Welcome to GUESS MY NUMBER Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed the number.");
                System.out.println("Total attempts: " + attempts);
            }
        }

        scanner.close();
    }
}
