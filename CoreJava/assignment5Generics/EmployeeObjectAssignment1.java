package assignment5Generics;

import java.util.HashSet;
import java.util.Set;

public class EmployeeObjectAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		//Creation of set object
		//passing Employee has arguments
		Set<Employee> emplist=new HashSet<>();
		
		//Adding the element in the employee
		emplist.add(new Employee(1, "Aniket", 23456,"civil"));
		emplist.add(new Employee(2, "Sonali", 7656,"CSC"));
		emplist.add(new Employee(3, "priya", 2396,"CSC"));
		
		//We shoud allow to add another value then we added got CTE
		//emplist.add(new Employee(4, 54678, "Aparna"," civil"));
		emplist.add(new Employee(4, "Aparna", 87956,"Mech"));
		
		System.out.println(emplist);
		
		for (Employee employee : emplist) {
			System.out.println(employee);
		}
		
		
	}
	

}

