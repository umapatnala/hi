package EmployeeManagement.example.EmployeeManagement.Exception;

public class EmployeeNotFoundException extends Exception {
	private long id;
	public EmployeeNotFoundException(long id) {
		super(String.format("Employee is not found with id:'%s'",id));
	}
}
