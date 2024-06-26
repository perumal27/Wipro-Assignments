package corejava4;
import java.util.Calendar;
public class testCalender{
	    public static void main(String[] args) {
	        Calendar cal = Calendar.getInstance ();
	        System.out.println("The current Date is: " +cal.getTime());
	        System.out.println("First Day is : "+cal.getFirstDayOfWeek());
	        int day = cal.getFirstDayOfWeek();

	        switch (day) {
	            case 1:
	               System.out.println("Sunday");
	                break;
	            case 2:
	            	System.out.println("Monday");
	                break;
	            case 3:
	            	System.out.println("Tuesday");
	                
	                break;
	            case 4:
	            	System.out.println("Wednesday");
	                
	                break;
	            case 5:
	            	System.out.println("Wednesday");
	                break;
	            case 6:
	            	System.out.println("Friday");
	             
	                break;
	            case 7:
	            	System.out.println("Saturday");
	               
	                break;
	            
	        }
	    }
	}



