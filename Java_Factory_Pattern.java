package Hacker Rank;

public class Java_Factory_Pattern {

    if("cake".equals(order))
    {
        return new Cake();
    }
   else if("pizza".equals(order))
    {
         
        return new Pizza();
    }
    return null;
    
}
