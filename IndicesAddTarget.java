/*
Problem: Two Sum (Optimized)

Description:
Write a program to find the indices of two numbers in an array such that they add up to a given target value.

Each input will have exactly one solution, and the same element cannot be used twice.

The solution should be optimized for efficiency.

Input:
An array of integers nums and an integer target

Output:
Print the indices of the two numbers such that they add up to the target

Example:
Input:
nums = [2, 7, 11, 15], target = 9

Output:
[0, 1]
*/




import java.util.Scanner;
public class IndicesAddTarget 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        s.close();
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] + arr[j] == k)
                    System.out.println(i + " " + j);
            }
        }
    }    
}