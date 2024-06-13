package Hacker Rank;



    import java.io.*;
import java.util.*;


public class Java_Exception_Handling_(Try-catch) 
{

    public static void main(String[] args)
     {
        Scanner sc = new Scanner (System.in);

        try
        {
            int x = sc.nextInt();

            int y = sc.nextInt();

            int z = x/y;

            System.out.println(z);
    }
    catch(ArithmeticException e)
    {
        System.out.print("java.lang.ArithmeticException: / by zero");
    }
    catch(Exception e)
    {
        System.out.println("java.util.InputMismatchException");
    }
    }
}

    

