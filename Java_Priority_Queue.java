package Hacker Rank;



import java.util.TreeSet;
import java.math.*;


/*
 * Create the Student and Priorities classes here.
 */

 public class Java_Priority_Queue 
 {
     String name;

     double gpa;

     int id;

     
     public Student(String name, double gpa, int id)
     {
        this.name = name;

        this.gpa = gpa;

        this.id = id;    
     }
     
     public String getName(){ return name;}

     public double getCGPA(){ return gpa;}

     public int getID(){ return id;}
          
     @Override

     public int compareTo(Student student)
     {
        int comp = (int) Math.signum(student.getCGPA() - gpa);

        if (comp != 0) return comp;

        comp = name.compareTo(student.getName());

        if (comp != 0)
        {
            return comp;
        }
        return student.getID() - id;

     }
 }
 
 class Priorities
 {     
     TreeSet<Student> students = new TreeSet<Student>();
         
     public List<Student> getStudents(List<String> events)
     {         
         for (String event:events)
         {
             processEvent(event);
         }
         return new ArrayList<Student>(students);
    }
    
    protected void processEvent(String event)
    {
        String tokens[] = event.split(" ");

        if (tokens[0].compareTo("ENTER") == 0)
        {
            students.add(fromEvent(tokens));        
        } 
        else
        { // SERVED
            students.pollFirst();                        
        }
        
    }
    
    protected Student fromEvent(String[] tokens)
    {         
         return new Student(tokens[1], Double.valueOf(tokens[2]), Integer.valueOf(tokens[3]));
    }

 }

    

