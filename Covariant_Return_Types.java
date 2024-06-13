package Hacker Rank;

public class Covariant_Return_Types {

    class Flower 
    {
        String whatsYourName()
        {
            return "I have many names and types.";
        }
    }
    
    class Jasmine extends Flower 
    {
        String whatsYourName()
        {
            return "Jasmine";
        }
    }
    
    class Lily extends Flower 
    {
        String whatsYourName()
        {
             return "Lily";
        }
    }
    
    class Region
    {
        Flower yourNationalFlower()
        {
             return new Flower();
        }
    }
    
    class WestBengal  extends Region
    {
        Jasmine yourNationalFlower()
        {
            return new Jasmine();
        }
    }
    
    class AndhraPradesh extends Region 
    {
        Flower yourNationalFlower()
        {
             return new Lily();
        }
        
    } 
    
}
