/*
Problem: Valid Parentheses

Description:
Given a string s containing only bracket characters:
'(', ')', '{', '}', '[', ']',
write a program to determine whether the string is valid.

A string is considered valid if:
- Every opening bracket has a corresponding closing bracket of the same type.
- Brackets are closed in the correct order.
- Every closing bracket matches the most recent unmatched opening bracket.

Input:
A string s consisting only of characters: ()[]{}

Output:
Return true if the string is valid, otherwise return false.

Example:

Input:
"()[]{}"

Output:
true

Invalid Example:

Input:
"(]"

Output:
false

Constraints:
1 ≤ length of string ≤ 10^4
*/


import java.util.Scanner;
import java.util.Stack;
public class ValidParanthesis 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    System.out.println("False");
                    return;
                }
                char top = st.pop();
                if((ch == ')' && top != '(') ||
                   (ch == ']' && top != '[') ||
                   (ch == '}' && top != '{'))
                {
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }    
}
