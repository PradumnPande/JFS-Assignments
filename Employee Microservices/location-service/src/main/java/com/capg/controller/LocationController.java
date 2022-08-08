package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.capg.model.Location;
import com.capg.repository.LocationRepository;

@RestController

public class LocationController {

	@Autowired
	LocationRepository locationrepository;
	
	@PostMapping("/add")
	public String add(@RequestBody Location location) {
		locationrepository.save(location);
				return "location added";
	}
	
	@GetMapping("/getlocation")
	public List<Location> getemployee(){
		List<Location> location=locationrepository.findAll();
		return location;
	}

	
	
	
	
}
