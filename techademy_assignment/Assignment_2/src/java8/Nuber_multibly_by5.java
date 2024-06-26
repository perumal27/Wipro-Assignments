package java8;
import java.util.Arrays;
import java.util.List;

public class Nuber_multibly_by5 {
	
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1,2,9,10, 7, 25, 14, 30, 18, 5);


	        System.out.println("Numbers which are multiples of 5:");
	        numbers.stream()
	               .filter(num -> num % 5 == 0)
	               .forEach(System.out::println);
	    }
	}



