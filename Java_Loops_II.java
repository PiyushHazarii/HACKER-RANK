package Hacker Rank;


import java.util.*;
import java.io.*;


public class Java_Loops_II 
{
    public static void main(String []argh)
    {

        Scanner in = new Scanner(System.in);

        int t=in.nextInt();

        double temp;

        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();

            int b = in.nextInt();

            int n = in.nextInt();

            for(int j=0;j<n;j++)
            {
                a+=(Math.pow(2,j)*b);
                System.out.print(a+" ");
            }

            System.out.println();
        }
        in.close();
    }
}

    
