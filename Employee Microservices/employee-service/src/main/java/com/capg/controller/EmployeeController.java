package com.capg.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.client.AuthClient;
import com.capg.model.Employee;
import com.capg.repository.EmployeeRepository;



@RestController

public class EmployeeController {

	@Autowired
	EmployeeRepository employeerepository;
	
	@Autowired
	AuthClient authClient;
	
	@PostMapping("/add")
	public String add(@RequestBody Employee employee) {
		employeerepository.save(employee);
				return "Employee added";
	}
	//@RequestHeader("Authorization") String token
	
	@GetMapping("/getemployee")
	public ResponseEntity<List<Employee>> getemployee(@RequestHeader("Authorization") String token){
		if (!authClient.getValidity(token).isValid()) {

			return new ResponseEntity("Token is either expired or invalid...", HttpStatus.FORBIDDEN);
		}
		ResponseEntity<List<Employee>>	emp=  new ResponseEntity<>(employeerepository.findAll(), HttpStatus.OK);
		return emp;
	}
}
