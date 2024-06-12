package Hacker Rank;


import java.io.*;
import java.util.*;

public class Java_Static_Initializer_Block 
{

    static Scanner sc = new Scanner (System.in);

    static int B=sc.nextInt();

    static int H=sc.nextInt();
    

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    
       
    try
    {
        if(B<=0 || H<=0)
        {
            throw new Exception("java.lang.Exception: Breadth and height must be positive");
        }
        
    else
    {
        System.out.println(B*H);
    }
    }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

    

