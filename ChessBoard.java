/*
Problem: Chess Board Pattern

Description:
Write a program to generate an N × N chessboard pattern using characters.

Each cell should alternate between 'B' (Black) and 'W' (White).
The top-left cell of the board must always be 'B'.

The pattern should follow a proper chessboard arrangement:
- Adjacent cells (horizontally and vertically) must have opposite colors.
- The pattern continues consistently for all rows.

Input:
An integer N representing the size of the chessboard (N x N)

Output:
Print the chessboard pattern using 'B' and 'W' with spaces between them

Example:

Input:
4

Output:
B W B W
W B W B
B W B W
W B W B
*/

import java.util.Scanner;
public class ChessBoard 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if((i + j) % 2 == 0)
                {
                    System.out.print("B ");
                }
                else
                {
                    System.out.print("W ");
                }
            }
            System.out.println();
        }
    }    
}
