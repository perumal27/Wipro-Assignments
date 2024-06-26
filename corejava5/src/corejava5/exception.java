package corejava5;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] array = {1,2,3};
			System.out.println(array[1]);
			int result = 10/1;
			System.out.println("Result is :"+result);
			String str = "ss";
			System.out.println(str.length());
			System.exit(1);
		} catch (ArrayIndexOutofBoundException ae) {
			System.out.println("Array Index out of Bounds Exception occured: "+ac.getMessage());
		}catch (ArithmeticException e) {
			System.out.println( "Arithmetic Exception occured: "+e.getMessage());
		}catch (NullPointerException e) {
			System.out.println("Null pointer Exception occured: "+e.getMessage());
		}
		catch{
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("I am a finally block");
		}

	}

}
