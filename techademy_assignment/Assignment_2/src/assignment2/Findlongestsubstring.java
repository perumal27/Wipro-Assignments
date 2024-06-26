package assignment2;

import java.util.*;

public class Findlongestsubstring{
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        
        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }
            charIndexMap.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }

    


	public static void main(String[] args) {

		System.out.println("Enter the name");
		Scanner myobj = new Scanner(System.in);
		String input = myobj.nextLine();

		System.out.println(lengthOfLongestSubstring(input));

		myobj.close();
	}
}
