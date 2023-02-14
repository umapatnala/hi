package EmployeeManagement.example.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EmployeeManagement.example.EmployeeManagement.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
