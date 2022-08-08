package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.Department;
import com.capg.repository.DepartmentRepository;



@RestController

public class DepartmentController {

	@Autowired
	DepartmentRepository departmentrepository;
	
	
	@PostMapping("/add")
	public String add(@RequestBody Department department) {
		departmentrepository.save(department);
		return "Deparrtment added";
	}
	
	@GetMapping("/getdepartment")
	public List<Department> getdepart(){
		List<Department> dept=departmentrepository.findAll();
		return dept;
	}
}
