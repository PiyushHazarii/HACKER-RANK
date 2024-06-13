package Hacker Rank;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;
import java.nio.charset.*;



public class Java_SHA_256 
{

     public static void main(String[] args) throws Exception 
     {
        Scanner in = new Scanner(System.in);

        byte[] hash = MessageDigest.getInstance("SHA-256").digest(in.nextLine().getBytes());

        for (byte b : hash) 
        {
            System.out.printf("%02x", b);
        }
    }
}

    

