package Hacker Rank;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;




public class Java_2D_Array 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<6;i++)
        {
           for(int j=0;j<6;j++)
           {
               if(i>1 && j>1)
               {
                   int sum = arr.get(i).get(j)+ arr.get(i).get(j-1)+ arr.get(i).get(j-2)+ arr.get(i-1).get(j-1)+ arr.get(i-2).get(j)+ arr.get(i-2).get(j-1)+ arr.get(i-2).get(j-2);
               if(sum > maxSum)
               {
                   maxSum=sum;
               }
               }
           } 
        }
        System.out.println(maxSum);

        bufferedReader.close();
    }
}

    

