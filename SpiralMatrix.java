/*
Problem: Spiral Matrix Traversal

Description:
Given a 2D matrix of size m × n, write a program to return all elements
of the matrix in spiral order.

Spiral order means traversing the matrix layer by layer in the following pattern:
- Move from left to right across the top row
- Then move from top to bottom along the right column
- Then move from right to left across the bottom row
- Then move from bottom to top along the left column
- Repeat the process for the inner layers until all elements are visited

Input:
A 2D integer matrix

Example:
[
 [1, 2, 3],
 [4, 5, 6],
 [7, 8, 9]
]

Output:
A list of integers representing the spiral order traversal

Example:
[1, 2, 3, 6, 9, 8, 7, 4, 5]

Constraints:
1 ≤ m, n ≤ 100
-100 ≤ matrix[i][j] ≤ 100
*/



import java.util.Scanner;
public class SpiralMatrix 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = s.nextInt();
            }
        }
        s.close();
        int top = 0, bottom = r - 1, right = c - 1, left = 0;
        while(top <= bottom && left <= right)
        {
            for(int i = left; i <= right; i++)
            {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for(int i = top; i <= bottom; i++)
            {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if(top <= bottom)
            {
                for(int i = right; i >= left; i--)
                {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            if(left <= right)
            {
                for(int i = bottom; i >= top; i--)
                {
                    System.out.print(arr[i][left] + " ");
                }
                 left++;
            }
        }
    }    
}
