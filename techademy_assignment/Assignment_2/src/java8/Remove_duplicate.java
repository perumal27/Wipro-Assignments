package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Remove_duplicate {
	

	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6);

	        List<Object> uniqueNumbers = numbers.stream()
	                                            .distinct()
	                                            .collect(Collectors.toList());

	        System.out.println("Original list: " + numbers);
	        System.out.println("List with duplicates removed: " + uniqueNumbers);
	    }
	}



