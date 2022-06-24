package assignment6Collection;


import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private String department;
	private double salary;
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	//Parameritized Constructor
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	//Default constructor
	public Employee()
	{
		
	}
	//Getters and setters
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		return this.getId() - o.getId();
	}
}
