package java8;

public class Secong_largest {
	    public static void main(String[] args) {
	        int[] numbers = {10, 5, 8, 20, 3, 15};
	        
	        if (numbers.length < 2) {
	            System.out.println("Array should have at least two elements");
	            return;
	        }
	        
	        int firstMax = Integer.MIN_VALUE;
	        int secondMax = Integer.MIN_VALUE;
	        
	        for (int num : numbers) {
	            if (num > firstMax) {
	                secondMax = firstMax;
	                firstMax = num;
	            } else if (num > secondMax && num != firstMax) {
	                secondMax = num;
	            }
	        }
	        
	        if (secondMax == Integer.MIN_VALUE) {
	            System.out.println("There is no second largest element");
	        } else {
	            System.out.println("Second largest number: " + secondMax);
	        }
	    }
	}


