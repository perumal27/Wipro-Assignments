package corejava4;

public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Alex";//Constant Pool
		s.concat("Martin");//concat() method appends the string at the end
		System.out.println(s.concat("Martin"));
		System.out.println(s);
		//----string comparision---equals---
		String s1="Apples";
		String s2="Apples";
		String s3=new String("Apples");
		String s4="Saurav";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		 
		//compareTo
		String s10="Max";
		String s20="Max";
		String s30=new String("Alex");
		System.out.println(s10.compareTo(s20));//0
		System.out.println(s10.compareTo(s30));
		System.out.println(s10.compareTo(s10));
		
		//String builder and buffer ---Mutable
		StringBuilder builder=new StringBuilder("Hello ");  //non synchronized
		builder.append("java with string builder");
		System.out.println(builder);
		
		StringBuffer buffer=new StringBuffer("Hello");  //Synchronized
		buffer.append("java with String buffer");
		System.out.println(buffer);
		
		
		
	}

}
