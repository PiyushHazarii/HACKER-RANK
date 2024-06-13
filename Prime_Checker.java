package Hacker Rank;

import static java.lang.System.in;

public class Prime_Checker 
{
    
    boolean isPrime(int n)
    {
        BigInteger bi = BigInteger.valueOf(n);

        return bi.isProbablePrime(20);
    }
    
    void checkPrime(int...nums)
    {

        for(int i : nums)
        {
            if(isPrime(i))System.out.print(i+" ");
        }

        System.out.println();
    }
}

    

