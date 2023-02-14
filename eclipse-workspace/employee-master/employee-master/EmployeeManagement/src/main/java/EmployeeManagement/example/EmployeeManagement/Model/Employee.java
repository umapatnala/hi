package EmployeeManagement.example.EmployeeManagement.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
@Id
@GeneratedValue
private Long id;
private String name;
private String designation;
private int salary;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employee(Long id, String name, String designation, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.designation = designation;
	this.salary = salary;

}
}
