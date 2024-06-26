package dateandtime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Birthdaycalculation {

    public static void main(String[] args) {
        System.out.println("Enter the date of Birth format (yyy-mm-dd)");
        Scanner myobj=new Scanner(System.in);
        String input=myobj.nextLine();
        String birthdateStr = "2000-07-27";
        
        // Calculate and print age
        String ageStr = calculateAge(input);
        System.out.println("Age: " + ageStr);
        myobj.close();
    }

    public static String calculateAge(String birthdateStr) {
        // Parse birthdate string to LocalDate
        LocalDate birthdate = LocalDate.parse(birthdateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        // Get current date
        LocalDate currentDate = LocalDate.now();
        
        // Calculate period between birthdate and current date
        Period period = Period.between(birthdate, currentDate);
        
        // Format the age as years, months, and days
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        
        return years + " years, " + months + " months, " + days + " days";
    }
}
