package corejava5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("ONE");
		list1.add("TWO");
		list1.add("THREE");
		list1.add("FOUR");
		list1.add("FIVE");
		System.out.println("Traverse element using for loop");
		for(int i=0;i<5;i++)
		{
			System.out.println(list1.get(i));
		}
		System.out.println("Traverse element using for each loop");
		for(String num:list1) {
			System.out.println(num);
		}
		System.out.println("Traverse element using Iteration");
		Iterator<String> iterat =list1.iterator();
		
		while(iterat.hasNext())
		{
			System.out.println("The element is:"+iterat.next());
		}
		System.out.println("Traverse element using Listiterator");
		ListIterator<String> litrat =list1.listIterator();
		while(literat.hasNext()) {
			System.out.println("The Next element is :"+literat.next());
		}
		while(literat.hasPrevious())
		{
			System.out.println("The previous element is :"+literat.previous());
			
		}
		
		
		
		
		

	}

}
