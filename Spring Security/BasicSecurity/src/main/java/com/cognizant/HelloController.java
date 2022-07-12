package com.cognizant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hi() {
		return "Welcome to spring security...";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from spring security...";
	}
}
