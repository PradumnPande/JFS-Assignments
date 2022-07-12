package com.cognizant.service;

import java.util.List;

import com.cognizant.exception.EmployeeNotFoundException;
import com.cognizant.model.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();
	Employee getEmployeeById(int id) throws EmployeeNotFoundException;
	String deleteEmployeeById(int id) throws EmployeeNotFoundException;
	String addEmployee(Employee e) throws EmployeeNotFoundException;
	String updateEmployee(Employee e) throws EmployeeNotFoundException;
	List<Employee> getEmployeeBasedSalaryRange(double low,double high);
}
