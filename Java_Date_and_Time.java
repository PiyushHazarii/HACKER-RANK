package Hacker Rank;




public class Java_Date_and_Time 
{
        public static String findDay(int month, int day, int year) 
        {
       
            Calendar obj = Calendar.getInstance();

            obj.set(year, month - 1, day); // month is 0-based in Calendar
    
            // Get the day of the week in string format

            String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

            int dayOfWeek = obj.get(Calendar.DAY_OF_WEEK) - 1;   // Calendar.DAY_OF_WEEK starts from 1

            return days[dayOfWeek];
    }  
}
