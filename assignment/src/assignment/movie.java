package assignment;

import java.util.Scanner;

public class movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter movie type (Regular/3D): ");
        String movieType = scanner.next();

        int Price = calculatePrice(age, movieType);
        System.out.println("The ticket price is: $" + Price);

        scanner.close();
    }

    public static int calculatePrice(int age, String movieType) {
        int ticketPrice = 0;

        if (movieType.equalsIgnoreCase("regular")) {
            if (age < 18) {
                ticketPrice = 8;
            } else {
                ticketPrice = 12;
            }
        } else if (movieType.equalsIgnoreCase("3D")) {
            if (age < 18) {
                ticketPrice = 10;
            } else {
                ticketPrice = 15;
            }
        } else {
            System.out.println("Invalid movie type entered.");
        }

        return ticketPrice;
    }
}