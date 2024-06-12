package Hacker Rank;

public class Java_Anagrams 
{

    static boolean isAnagram(String a, String b) 
    {
        int c = a.length();
        int d = b.length();
        
        a = a.toLowerCase();
         b = b.toLowerCase();
        
        if(c!=d)
        {
            return false;
        }
        
        int fullcharacter[] = new int[26];
        
        for(int i=0;i<c;i++)
        {
            char character = a.charAt(i);

            int index = character-'a';

            fullcharacter[index]++;
        }
        
        for(int i=0;i<d;i++)
        {
            char character = b.charAt(i);

            int index = character-'a';

            fullcharacter[index]--;
        }
        
        
        for(int i=0;i<26;i++)
        {
            if(fullcharacter[i]!=0)
            {
                return false;
            }
            
        }
        
        return true;

      }
}
