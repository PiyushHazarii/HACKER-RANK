package Hacker Rank;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Java_Arraylist 
{

    public static void main(String[] args) 
    {
        List<List<Integer>> listoflist = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int d = sc.nextInt();

            List<Integer> list = new ArrayList<>();

            for(int j=0;j<d;j++)
            {
                list.add(sc.nextInt());
            }

             listoflist.add(list);

        }
       
        int q= sc.nextInt();

        for(int i=0;i<q;i++)
        {
            int x= sc.nextInt();

            int y = sc.nextInt();

            try
            {
                System.out.println(listoflist.get(x-1).get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
        
    }
    
}

    

