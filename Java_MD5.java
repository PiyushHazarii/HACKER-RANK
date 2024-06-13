package Hacker Rank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java .security.*;
import javax.xml.bind.DatatypeConverter;



public class Java_MD5 {

    public static void main(String[] args) throws NoSuchAlgorithmException
    {
       Scanner sc = new Scanner (System.in);

       String st= sc.nextLine();

       byte[]b= st.getBytes();

       MessageDigest md = MessageDigest.getInstance("MD5");

       md.update(b);

       System.out.println(DatatypeConverter.printHexBinary(md.digest()).toLowerCase());
    }
}

    

