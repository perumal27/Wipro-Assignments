package assignment;

import java.util.Scanner;

public class Employeepromotion {

   public static void main(String[] args) {
       
       final int MIN_YEARS_OF_SERVICE = 5;
       final String REQUIRED_PERFORMANCE_RATING = "excellent";
       final String TRAINING_COMPLETED = "yes";

       
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter your years of service: ");
       int yearsOfService = scanner.nextInt();
       scanner.nextLine(); 

   System.out.print("Enter your performance rating (Excellent/Good/Fair/Poor): ");
       String performanceRating = scanner.nextLine().toLowerCase();

       System.out.print("Have you completed at least one advanced training program? (yes/no): ");
       String trainingStatus = scanner.nextLine().toLowerCase();

       boolean isEligibleForPromotion = (
           yearsOfService >= MIN_YEARS_OF_SERVICE &&
           performanceRating.equals(REQUIRED_PERFORMANCE_RATING) &&
           trainingStatus.equals(TRAINING_COMPLETED)
       );

   
       if (isEligibleForPromotion) {
           System.out.println("Congratulations! You are eligible for promotion.");
       } else {
           System.out.println("Sorry, you are not eligible for promotion.");
       }

       
       scanner.close();
   }
}
