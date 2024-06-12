package Hacker Rank;



import java.io.*;
import java.util.*;

public class Java_Strings_Introduction 
{

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);

        String A=sc.next();

        String B=sc.next();

        /* Enter your code here. Print output to STDOUT. */

        System.out.println((A.length())+(B.length()));

        int r = A.compareTo(B);

        if(r<=0)
        {
            System.out.println("No");
        }

        else
        {
            System.out.println("Yes");
        }
        
        String a =A.substring(0,1).toUpperCase()+A.substring(1);

        String b =B.substring(0,1).toUpperCase()+B.substring(1);

        System.out.print(a+" "+b);
        
    }
}




    

