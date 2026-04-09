import java.util.Scanner;

public class QuizGame 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        System.out.println("\nQ1: What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) Delhi");
        System.out.println("c) Chennai");
        System.out.println("d) Kolkata");
        System.out.print("Your answer: ");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'b' || ans1 == 'B') 
        {
            System.out.println("Correct!");
            score++;
        } 
        else 
            System.out.println("Incorrect! Correct answer is b) Delhi");

        System.out.println("\nQ2: 2 + 2 = ?");
        System.out.println("a) 3");
        System.out.println("b) 9");
        System.out.println("c) 5");
        System.out.println("d) 4");
        System.out.print("Your answer: ");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'd' || ans2 == 'D') 
        {
            System.out.println("Correct!");
            score++;
        } 
        else 
            System.out.println("Incorrect! Correct answer is d) 4");
        
        System.out.println("\nQ3: Which language is used for Android development?");
        System.out.println("a) Java");
        System.out.println("b) Python");
        System.out.println("c) C++");
        System.out.println("d) HTML");
        System.out.print("Your answer: ");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'a' || ans3 == 'A') 
        {
            System.out.println("Correct!");
            score++;
        } 
        else 
            System.out.println("Incorrect! Correct answer is a) Java");
        
        System.out.println("Final Score: " + score + "/3");

        if (score == 3) 
            System.out.println("Excellent!");
        else if (score == 2) 
            System.out.println("Good!");
        else
            System.out.println("Try Again!");

        sc.close();
    }
}