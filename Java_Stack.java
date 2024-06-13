package Hacker Rank;

import java.util.*;


public class Java_Stack 
{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) 
        {
			String input=sc.next();

            Stack<Character> st = new Stack<Character>();

            for(char c : input.toCharArray())
            {
                if(!st.isEmpty())
                {
                    switch(c) 
                {
                   case '}':
                   if(st.peek()=='{')
                   {
                       st.pop();
                   }
                   break;

                   case ']':
                   if(st.peek()=='[')
                   {
                       st.pop();
                   }
                   break;

                   case ')':
                   if(st.peek()=='(')
                   {
                       st.pop();
                   }
                   break;

                   default :
                   st.push(c);
                   break;

               } 
             }

             else
             {
                 st.push(c);
             }
         }

		System.out.println(st.isEmpty());
        }
	}
}

    

