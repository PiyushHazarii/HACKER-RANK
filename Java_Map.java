package Hacker Rank;



import java.util.*;
import java.io.*;


public class Java_Map 
{
	public static void main(String []argh)
	{
        HashMap<String, Integer> hm = new HashMap<>();

		Scanner in = new Scanner(System.in);

		int n=in.nextInt();

		in.nextLine();

		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();

			int phone=in.nextInt();

            hm.put(name,phone);

			in.nextLine();
		}

		while(in.hasNext())
		{
			String s=in.nextLine();

            if(hm.containsKey(s))
            {
                System.out.println(s+"="+hm.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
		}
	}
}




    

