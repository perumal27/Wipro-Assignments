package java8;

public class find_sum_and_average {
	    public static void main(String[] args) {
	        int[] numbers = {10, 5, 8, 20, 3};
	        
	        int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }
	        
	        double average = (double) sum / numbers.length;
	        
	        System.out.println("All the elements " + java.util.Arrays.toString(numbers));
	        System.out.println("Sum of the elements: " + sum);
	        System.out.println("Average of the elements: " + average);
	    }
	}



