import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1; 
        int guess;
        int attempts = 0;
        System.out.println("Guess a number between 1 and 100:");
        while (true) {
            guess = sc.nextInt();
            attempts++;

            if (guess > target) {
                System.out.println("Too High");
            } 
            else if (guess < target) {
                System.out.println("Too Low");
            } 
            else {
                System.out.println("You Win! Attempts: " + attempts);
                break;
            }
        }
        sc.close();
    }
}