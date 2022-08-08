package com.capg.controller;


import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
/* @RequestMapping("/check") */
public class HRController {

	@Autowired
	RestTemplate resttemplate;
	
	@GetMapping("/checkemployee")
	public List<Object> getemp(){
		Object[] employee=resttemplate.getForObject("http://employee-service/getemployee",Object[].class);
		return Arrays.asList(employee);
	}
	
	@GetMapping("/checkdepartment")
	public List<Object> getdepart(){
		Object[] department=resttemplate.getForObject("http://department-service/getdepartment",Object[].class);
		return Arrays.asList(department);
	}
	
	@GetMapping("/checklocation")
	public List<Object> getloc(){
		Object[] location=resttemplate.getForObject("http://location-service/getlocation",Object[].class);
		return Arrays.asList(location);
	}
	
	
	
	
}
