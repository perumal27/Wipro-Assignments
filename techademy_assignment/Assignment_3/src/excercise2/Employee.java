package excercise2;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    

	
    public void raiseSalary(double amount) {
        this.salary += amount;
    }

    
    public double calculateYearlyBonus() {
        return salary * 0.1;
    }
}
