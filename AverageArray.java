/*
Problem: Average of Array

Description:
Given an array of N integers, write a program to calculate the average (mean)
of all elements in the array.

The average is defined as:
(Sum of all elements) / N

Input:
First line: An integer N representing the size of the array
Second line: N space-separated integers

Output:
Print the average value as a floating-point number

Example:

Input:
5
1 2 3 4 5

Output:
3.0
*/










import java.util.Scanner;
public class AverageArray 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        float avg = sum / n;
        System.out.println(avg);
    }    
}
