package dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Weekdaycalculator {

    public static String getDayOfWeek(String dateString) {
       
        LocalDate date = LocalDate.parse(dateString);
        
       
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
       
        return dayOfWeek.toString();
    }

    public static void main(String[] args) {
        String date1 = "2024-06-18";
        String dayOfWeek1 = getDayOfWeek(date1);
        System.out.println("Day of the week for " + date1 + " is: " + dayOfWeek1);

        String date2 = "2023-12-25";
        String dayOfWeek2 = getDayOfWeek(date2);
        System.out.println("Day of the week for " + date2 + " is: " + dayOfWeek2);
    }
}
