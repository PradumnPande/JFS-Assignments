package com.cognizant.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyErrorResponse {

	private LocalDateTime timestamp;
	private HttpStatus status;
	private String reason;
	private String message;
	public void setTimestamp(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}
	public void setStatus(HttpStatus notFound) {
		// TODO Auto-generated method stub
		
	}
	public void setMessage(String message2) {
		// TODO Auto-generated method stub
		
	}
	public void setReason(String string) {
		// TODO Auto-generated method stub
		
	}
}
