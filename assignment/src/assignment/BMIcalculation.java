package assignment;
import java.util.Scanner;
public class BMIcalculation {
	public static double calculateBmi(double wt, float ht) {
		return wt/(ht*ht);
	}
	public static String bmiStatus(double bmi) {
		if(bmi<18.5) return "Under Weight";
		else if(bmi>=bmi && bmi<25) return "Normal Weight";
		else if(bmi>=25 && bmi<30) return "Over Weight";
		else return "Obese";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Weight(Kg): "); double wt = scanner.nextDouble();
		System.out.print("Enter Your Height(mt): "); float ht = scanner.nextFloat();
		double bmi = calculateBmi(wt,ht);
		System.out.println(bmiStatus(bmi));
		scanner.close();
	}

}

	 


