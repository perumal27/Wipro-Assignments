package myproject;

public class arrayproject {
	public static void main(String[] args)
	{
		Employee[] employees = new Employee[3];
		employees[0] = new Employee(1,"laksh",3000);
		employees[0] = new Employee(2,"kumar",4000);
		employees[0] = new Employee(3,"john",5000);
		System.out.println("Employee Details :");
		for(Employee emp :employees) {
			System.out.println("ID: "+emp.getId);
		}
	}

}
