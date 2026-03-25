/*
Problem: Check Anagram (Efficient)

Description:
Write a program to check whether two given strings are anagrams of each other.

Two strings are said to be anagrams if they contain the same characters 
with the same frequency, but possibly in a different order.

The program should return true if both strings are anagrams, 
otherwise return false.

Input:
Two strings s1 and s2

Output:
Print true if the strings are anagrams
Otherwise, print false

Input:
listen
silent

Output:
true
*/



import java.util.Scanner;
public class Anagram
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        s.close();
        if(str1.length() != str2.length())
        {
            System.out.println("Not Anagram");
            return;
        }
        int hash[] = new int[256];
        int n = str1.length();
        char ch[] = str1.toCharArray();
        char c[] = str2.toCharArray();
        for(int i = 0; i < n; i++)
        {
            hash[ch[i]]++;
            hash[c[i]]++;
        }
        for(int i = 0; i < n; i++)
        {
            if(hash[ch[i]] != 2)
            {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}