package corejava5;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class linkeslist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 5, 5);
		System.out.println(listNumbers);
		
		Set<Integer> uniqueNumbers=new HashSet<>(listNumbers);
		System.out.println(uniqueNumbers);
		Set<String> names =new HashSet<>();
		names.add("Tom");
		names.add("Mary");
		
		if (names.add("Peter"))
		
		
		
		

	}

}
