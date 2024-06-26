package myproject;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Hari","james","kumar","marc"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		for(String name:names)
			System.out.println(name);

	}

}
