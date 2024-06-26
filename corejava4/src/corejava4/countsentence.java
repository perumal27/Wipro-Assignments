package corejava4;

public class countsentence {
		public static boolean checkVow(char i) {
		return i=='A' || i=='E' || i=='I' ||i=='O' ||i=='U' ||
		i=='a' || i=='e' || i=='o' ||i=='i' ||i=='u';
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "james";
		int v=0,c=0;
		for(int i=0; i<test.length(); i++) {
		char ch = test.charAt(i);
		if(checkVow(ch)) v++;
		else c++;
		}
		System.out.println("Count of Vowel "+v);
		System.out.println("Count of Consonant "+c);
		 
		}
		 
		}


