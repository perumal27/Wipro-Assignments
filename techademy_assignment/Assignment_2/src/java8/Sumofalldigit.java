package java8;

public class Sumofalldigit {
	
	    public static void main(String[] args) {
	        int number = 12345;
	        
	       
	        int sumOfDigits = String.valueOf(number)
	                            .chars()
	                            .map(Character::getNumericValue)
	                            .sum();
	        
	        System.out.println("Number: " + number);
	        System.out.println("Sum of digits: " + sumOfDigits);
	    }
	}



