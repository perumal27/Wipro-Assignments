package assignment2;

import java.util.Scanner;

public class Stringreverse {
	public static String reverseString(String str) {

		char[] charArray = str.toCharArray();

		int first = 0;
		int last = charArray.length - 1;

		while (first < last) {

			char temp = charArray[first];
			charArray[first] = charArray[last];
			charArray[last] = temp;

			first++;
			last--;
		}

		return new String(charArray);
	}

	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = myobj.nextLine();
		String reversed = reverseString(input);
		System.out.println("input string: " + input);
		System.out.println("Reversed: " + reversed);
		myobj.close();
	}
}
