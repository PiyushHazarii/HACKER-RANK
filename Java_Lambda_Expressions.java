package Hacker Rank;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Java_Lambda_Expressions 
{

    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) 
        {
            String[] input = br.readLine().split(" ");

            int condition = Integer.parseInt(input[0]);

            int num = Integer.parseInt(input[1]);

            switch (condition) 
            {
                case 1:
                    System.out.println(isEven(num) ? "EVEN" : "ODD");
                    break;

                case 2:
                    System.out.println(isPrime(num) ? "PRIME" : "COMPOSITE");
                    break;

                case 3:
                    System.out.println(isPalindrome(num) ? "PALINDROME" : "NOT PALINDROME");
                    break;

                default:
                    System.out.println("Invalid condition");
            }
        }
    }

    static boolean isEven(int num) 
    {
        return num % 2 == 0;
    }

    static boolean isPrime(int num) 
    {
        if (num <= 1)
        {
            return false;
        }

        for (int i = 2; i * i <= num; i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(int num) 
    {
        int reversed = 0;

        int original = num;

        while (num > 0) 
        {
            int digit = num % 10;

            reversed = reversed * 10 + digit;

            num /= 10;
        }

        return original == reversed;
    }
}

    

