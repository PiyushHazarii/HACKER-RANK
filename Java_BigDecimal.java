package Hacker Rank;

public class Java_BigDecimal 
{

    Comparator<String> mycomp = new Comparator<String>()

    {
    public int compare(String s1,String s2)

    {
        BigDecimal a = new BigDecimal(s1);

        BigDecimal b = new BigDecimal(s2);

        return b.compareTo(a);
    }
    };

    Arrays.sort(s,0,n,mycomp);
}
