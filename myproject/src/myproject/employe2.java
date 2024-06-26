package myproject;
 
public class employe2 {
	static {
		System.out.println("I'm a static Block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I'm an main Methode");
		Employee e1 = new Employee("Bob1",45665);
		System.out.println(e1);
		Employee e2 = new Employee("Bob2",45665);
		System.out.println(e2);
		Employee e3 = new Employee("Bob3",45665);
		System.out.println(e3);
		Employee e4 = new Employee("Bob4",45665);
		System.out.println(e4);
		Employee e5 = new Employee("Bob5",45665);
		System.out.println(e5);
		//Employee e1 = new Employee("Bob",45665);
		System.out.println(Employee.no);
		System.out.println(Employee.Company);
	}
 
}