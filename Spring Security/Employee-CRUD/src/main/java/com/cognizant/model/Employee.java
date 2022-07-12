package com.cognizant.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	private int id;
	@NotBlank(message = "Name can't be empty")
	@Pattern(regexp = "[A-Z]{1}[A-Za-z\\s]{2,}",message ="Name should start with capital letter" )
	private String name;
	@Pattern(regexp = "male|female",message = "Invalid Gender")
	private String gender;
	@Min(value = 18,message = "Age shouls >18")
	@Max(100)
	private int age;
	@Past
	private LocalDate doj;
	private double salary;
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
