package Hacker Rank;



import java.io.*;
import java.util.*;


public class Java_List {

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner (System.in);

       int n = sc.nextInt();

       List<Integer> ls = new ArrayList<>();

       for(int i=0;i<n;i++)
       {
           ls.add(sc.nextInt());
       }

       int q=sc.nextInt();

       for(int i=0;i<q;i++)
       {
           String s = sc.next();

           int index = sc.nextInt();

           if(s.equals("Insert"))
           {
               int data = sc.nextInt();

               ls.add(index,data);
           }

           else
           {
               ls.remove(index);
           }
       }

       for(int it:ls)
       {
           System.out.print(it+" ");
       }
    }
    
}

    

