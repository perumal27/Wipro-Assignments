package java8;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Find_maximum_minimum {
	
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(3,10, 7, 25, 14,55, 30, 18, 5);

	       
	        Optional<Integer> max = numbers.stream()
	                                       .max(Integer::compareTo);

	       
	        Optional<Integer> min = numbers.stream()
	                                       .min(Integer::compareTo);

	        
	        if (max.isPresent()) {
	            System.out.println("Maximum number: " + max.get());
	        } else {
	            System.out.println("No maximum found (empty list)");
	        }

	        if (min.isPresent()) {
	            System.out.println("Minimum number: " + min.get());
	        } else {
	            System.out.println("No minimum found (empty list)");
	        }
	    }
	}



