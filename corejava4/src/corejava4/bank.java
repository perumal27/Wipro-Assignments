package corejava4;

public class bank {
	public static void main(String[] args) {
		
		Bank bank=new SBI();
		System.out.println("SBI Rate of Interest: "+bank.getRateofInterest());
		
		bank=new ICICIBank();
		System.out.println("ICICI Rate of interst: "+bank.RateofInterest());
		System.out.println("Country is "+bank.country);
	}
	

}
