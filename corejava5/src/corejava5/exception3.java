package corejava5;

public class exception3 {
        public static void main(String ... args)throws InvalidSalaryException
        {
        	Employee employee1 = new Employee();
        	Employee employee = new Employee(101,"Alisa",1000);
        	
        	if(employee.grtSalary() < 1000) {
        	throws new InvalidSalaryException("salary is not valid ");
        	}
        	else {
        		System.out.println("Welcome to vote");
        	}
        	
        	
        }
}
