/*
Problem: Swap Two Numbers (Without Temporary Variable)

Description:
Given two integers A and B, write a program to swap their values
without using any third (temporary) variable.

The swapping must be done using arithmetic or bitwise operations only.

Input:
Two integers A and B

Example:
A = 5
B = 10

Output:
Print the values of A and B after swapping

Example:
A = 10
B = 5
*/



import java.util.Scanner;
public class SwapWithoutTemp 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();
        int c = a + b;
        a = c - a;
        b = c - b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
