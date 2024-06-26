package exception;

import java.util.ArrayList;
import java.util.List;

//Custom exceptions
class InvalidEmployeeDataException extends Exception {
public InvalidEmployeeDataException(String message) {
super(message);
}
}
class EmployeeAlreadyExistsException extends Exception {
public EmployeeAlreadyExistsException(String message) {
super(message);
}
}
class SalaryBelowMinimumException extends Exception {
public SalaryBelowMinimumException(String message) {
super(message);
}
}

		// HRManager class
		class HRManager {
		 private List<Employee> employeeList;
		 public HRManager() {
		 employeeList = new ArrayList<>();
		 }
		 public void addEmployee(String id, String name, double salary)
				 throws InvalidEmployeeDataException, EmployeeAlreadyExistsException,
				SalaryBelowMinimumException {
				 // Validate employee data
				 if (id == null || name == null || id.isEmpty() || name.isEmpty() || salary <= 0) {
				 throw new InvalidEmployeeDataException("Invalid employee data provided");
				 }
				 // Check if employee already exists
				 for (Employee employee : employeeList) {
				 if (employee.getId().equals(id)) {
				 throw new EmployeeAlreadyExistsException("Employee with ID " + id + " already exists");
				 }
				 }
				 // Check salary threshold
				 if (salary < Employee.getMinimumSalary()) {
				 throw new SalaryBelowMinimumException("Salary cannot be below the minimum threshold: " +
				Employee.getMinimumSalary());
				 }
				 // Add employee to the list
				 employeeList.add(new Employee(id, name, salary));
				 System.out.println("Employee added successfully: " + name);
				 }
		}
		