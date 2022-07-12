package com.cognizant.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.exception.EmployeeNotFoundException;
import com.cognizant.model.Employee;
import com.cognizant.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping("/")
	public List<Employee> showEmployees(){
		return service.getEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee showEmployeeById(@PathVariable("id") int id) throws EmployeeNotFoundException{
		return service.getEmployeeById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployeeById(@PathVariable("id") int id) throws EmployeeNotFoundException{
		return service.deleteEmployeeById(id);
	}
	
	
	@PostMapping("/")
	public String addEmployee(@RequestBody @Valid Employee e) throws EmployeeNotFoundException{
		return service.addEmployee(e);
	}
	
	@PutMapping("/")
	public String updateEmployee(@RequestBody @Valid Employee e) throws EmployeeNotFoundException{
		return service.updateEmployee(e);
	}
	
	@GetMapping("/{low}/{high}")
	public List<Employee> showEmployeebetweensalaryrange(
			@PathVariable("low") double lower,
			@PathVariable("high") double higher) throws EmployeeNotFoundException{
		return service.getEmployeeBasedSalaryRange(lower, higher);
	}
	
	
	
}
