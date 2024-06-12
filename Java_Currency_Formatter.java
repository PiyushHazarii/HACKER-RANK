package Hacker Rank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Java_Currency_Formatter 
{
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();

        scanner.close();

         String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);

         String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

         String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

         String india=NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);

        // Write your code here.
        
        // String us = a.format(payment);
        // String china = b.format(payment);
        // String france = c.format(payment);
        // String india = d.format(payment);
        
        
        System.out.println("US: " + us);

        System.out.println("India: " + india);

        System.out.println("China: " + china);

        System.out.println("France: " + france);

    }
}

    

