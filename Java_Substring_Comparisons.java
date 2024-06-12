package Hacker Rank;

public class Java_Substring_Comparisons 
{
    

    public static String getSmallestAndLargest(String s, int k) 
    {
        String a = s.substring(0,k);

        String smallest = a;

        String largest = a;

        
        for(int i=1;i<=s.length()-k;i++)
        {
            a=s.substring(i,i+k);

            if(a.compareTo(largest)>0)
            {
                largest=a;
            }

            if(a.compareTo(smallest)<0)
            {
                smallest=a;
            }
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;

    }
}
