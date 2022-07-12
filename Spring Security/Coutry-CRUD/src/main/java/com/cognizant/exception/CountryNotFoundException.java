package com.cognizant.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value =HttpStatus.NOT_FOUND,reason = "Contry Not Found",code =HttpStatus.NOT_FOUND)
public class CountryNotFoundException extends Exception {

	public CountryNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CountryNotFoundException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
