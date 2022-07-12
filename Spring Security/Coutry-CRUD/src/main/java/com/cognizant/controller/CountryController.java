package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.exception.CountryNotFoundException;
import com.cognizant.model.Country;
import com.cognizant.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

	@Autowired
	CountryService service;

	// http://localhost:8080/countries/
	// @RequestMapping(value = "/",method = RequestMethod.GET,produces
	// ="{MediaType.APPLICATION_JSON}")
	@GetMapping("/")
	public List<Country> showCountries() {
		return service.getCountries();
	}

	// http://localhost:8080/countries/us
	// @RequestMapping(value = "/{code}",method = RequestMethod.GET,produces
	// ="{MediaType.APPLICATION_JSON}")
	@GetMapping("/{code}")
	public Country showCountry(@PathVariable("code") String code) throws CountryNotFoundException {
		return service.getCountryByCode(code);
	}

	//http://localhost:8080/countries/find?code=jp
	// @RequestMapping(value = "/find",method = RequestMethod.GET,produces
	// ="{MediaType.APPLICATION_JSON}")
	@GetMapping("/find")
	public Country findCountry(@RequestParam("code") String code) throws CountryNotFoundException {
		return service.getCountryByCode(code);
	}
	/*
	public ResponseEntity<Country> findCountry(@RequestParam("code") String code) throws CountryNotFoundException {
		return new ResponseEntity<Country>(service.getCountryByCode(code),HttpStatus.OK);
	}*/

	// method=>POST
	// http://localhost:8080/countries/addcountry
	// Body=>raw radiobutton =>JSON
	/*
	  { "code": "RU", "name": "Russiaaaaaaaaaaaaaaa" }
	 */

	// @RequestMapping(value = "/addcountry",method = RequestMethod.POST,produces
	// ="{MediaType.APPLICATION_JSON}",consumes="{MediaType.APPLICATION_JSON}")
	@PostMapping("/addcountry")
	public Country addCountry(@RequestBody Country country) throws CountryNotFoundException {
		return service.addCountry(country);
	}

	// method=>PUT
	// http://localhost:8080/countries/update
	// Body=>raw radiobutton =>JSON
	/*
	 * { "code": "RU", "name": "Russia" }
	 */
	// @RequestMapping(value = "/update",method = RequestMethod.PUT,produces
	// ="{MediaType.APPLICATION_JSON}",consumes="{MediaType.APPLICATION_JSON}")
	@PutMapping("/update")
	public Country updateCountry(@RequestBody Country country) throws CountryNotFoundException {
		return service.updateCountry(country);
	}

	// method=>DELETE
	// http://localhost:8080/countries/RU

	// @RequestMapping(value = "/{code}",method = RequestMethod.DELETE)
	@DeleteMapping("/{code}")
	public Country deleteCountry(@PathVariable String code) throws CountryNotFoundException {
		return service.deleteCountryByCode(code);
	}
}
