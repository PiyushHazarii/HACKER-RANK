package Hacker Rank;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


public class Java_Singleton_Pattern 
{
    String str;
    private Singleton()
    {
        
    }
    public static Singleton getSingleInstance()
    {
        return new Singleton();
}
}
    

