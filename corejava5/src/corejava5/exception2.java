package corejava5;

public class exception2 {

	public static void checkAge(int age) throws ArithmeticException , RuntimeException{
		if (age <18) {
			throws new ArithmeticException("Underage person cannot be processed:");
		}else {
			System.out.println("Age is valid.");
		}
		f (age >50) {
			throws new RuntimeException("Overage!");
		}else {
			System.out.println("Age is valid.");
		}
	}
	
	p

}
