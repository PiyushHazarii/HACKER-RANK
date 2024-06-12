package Hacker Rank;



import java.io.*;
import java.util.*;


public class Java_String_Reverse 
{

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);

        String A=sc.next();
    
        int a= 0;

        int b = A.length()-1;

        while(a<=b)
        {
            if(A.charAt(a)!=A.charAt(b))
            {
                System.out.println("No");
            }
            else
            {
                System.out.println("Yes");
            }
            return;
        }      
    }
}


   
