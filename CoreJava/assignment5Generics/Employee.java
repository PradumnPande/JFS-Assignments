package assignment5Generics;

import java.util.HashSet;
import java.util.Set;

class Employee{
	
	//Declaring States
	int id;
	String name;
	int salary;
	String department;
	
	//Default Constructor to address the class
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized Constructor to initialize the value
	public Employee(int id, String name, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	//Getter and Setter method to get and set data
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//to string method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
	
}