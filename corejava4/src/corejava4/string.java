package corejava4;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello, world";
		int length = str.length();
		System.out.println("Length of sring: " + length);
		String concatenated = str.concat("how are you");
		System.out.println("Concateneted: " +concatenated );
		String substring = str.substring(7);
		System.out.println("Substring from index 7: "+ substring);
		char charAtIndex = str.charAt(4);
		System.out.println("Character at index 4: "+ charAtIndex);
		String lowerCase = str.toLowerCase();
		System.out.println("Lowercase string: "+ lowerCase);
		String upperCase = str.toUpperCase();
		System.out.println("Uppercase string: "+ upperCase);
		String str2 = "hello, world";
		boolean isEqual = str.equals(str2);
		System.out.println("String camparision :"+ isEqual);
		boolean isEqualIgnorecase = str.equalsIgnoreCase(str2);
		System.out.println("String camparision (case sensitive) :"+ isEqualIgnorecase);
		String replaced = str.replace("world", "universe");
		System.out.println("String replace :"+ replaced );
		String withSpaces ="Hello, World! ";
		String trimmed = withSpaces.trim();
		System.out.println("Trimmes: "+trimmed);
		

	}

}
