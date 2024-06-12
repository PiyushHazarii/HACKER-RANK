package Hacker Rank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Tag_Content_Extractor 
{
	public static void main(String[] args)
    {
		
		Scanner in = new Scanner(System.in);

		int testCases = Integer.parseInt(in.nextLine());

		while(testCases>0)
        {
			String line = in.nextLine();

            boolean a= false;

			Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");

            Matcher matcher =pattern.matcher(line);

            while(matcher.find())
            {
                System.out.println(matcher.group(2));
                a=true;
            }
            if(!a)
            {
                System.out.println("None");
            }

            testCases--;
		}
	}
}




    

