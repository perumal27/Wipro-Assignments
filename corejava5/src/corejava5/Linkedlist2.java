package corejava5;
import java.util.LinkedList;

public class Linkedlist2 {
	public static void main(String args[])
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add(2,"E");
    System.out.println(ll);
    ll.remove("B");
    ll.remove("3");
    ll.removeFirst();
    ll.removeLast();
	}

}
