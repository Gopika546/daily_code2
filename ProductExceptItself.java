/*
Problem: Product of Array Except Self

Description:
Write a program to find the product of all elements in an array except the element at each index.

For every index i, the output should contain the product of all elements of the array except nums[i].

The solution should be efficient and should not use division.

Input:
An array of integers nums

Output:
An array where each element at index i is the product of all elements except nums[i]

Example:
Input:
[1, 2, 3, 4]

Output:
[24, 12, 8, 6]
*/



import java.util.Scanner;
public class ProductExceptItself 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int res[] = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++)
            res[i] = res[i - 1] * arr[i - 1];
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right = right * arr[i];
        }
        for(int i = 0; i < n; i++)
            System.err.print(res[i] + " ");
    }    
}
