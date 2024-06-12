package Hacker Rank;



import java.io.*;
import java.util.*;


public class Java_Subarray 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int [n];

        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        
        int negative = 0;

        for(int i =0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int currentsum=0;
                for(int k =i;k<=j;k++)
                {
                    currentsum += a[k];
                }
                    if(currentsum<0)
                    {
                    negative++;
                    }
                
            }
        }

        System.out.println(negative);
    }
}

    

