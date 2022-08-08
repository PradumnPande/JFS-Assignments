package com.capg.model;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document(value="employee")
public class Employee {


	private int eid;
	private String name;

	private int departmentId;

	public Employee(int eid, String name, int departmentId) {
		super();
		this.eid = eid;
		this.name = name;
		this.departmentId = departmentId;
	}

	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	
}
