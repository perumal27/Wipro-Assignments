package corejava4;

public class customer1 {

	public static void main(String[] args) {
		//create two customers
		String[][] customers = {
	            {"kumar", "1994-05-15", "30"},
	            {"Raja", "1999-10-20", "25"}
	        };

	        // Display customer names
	        for (String[] customer : customers) {
	            System.out.println(customer[0]);
	            
	         customers[0][0]="Kumaravelan";
	         for (String[] customer1 : customers) {
		            System.out.println(customer1[0]);
	         }
	         
	         
	//display customer
     /*for (int i=0;) {
         System.out.println(customer);
     }
     //update customer
     customers[0][0]="kumaravel";
     //After update
     System.out.println("After Update");
     for (String[] customer : customers) {
         System.out.println(customer);
     }
     //delete a customer
      customers[1][0]=null;
      //Find a customer
      for (String[] customer : customers) {
          if (customer != null) {
              System.out.println(customer);*/
      }
      
 }
	}


