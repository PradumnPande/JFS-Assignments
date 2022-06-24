package assignment6Collection;

import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Client {

	public static void main(String[] args) {
		SortedSet<Employee> ts=new TreeSet<Employee>();
		ts.add(new Employee(5,"Aniket","tech",36767.9));
		ts.add(new Employee(7,"Ganesh","FullStack",106767.9));
		ts.add(new Employee(3,"Saurabh","GTS",66767.9));
		ts.add(new Employee(2,"Aparna","FullStack",96767.9));
		ts.add(new Employee(4,"Anuska","AWS",86767.9));
		ts.add(new Employee(1,"Chetan","FullStack",46767.9));
		ts.add(new Employee(9,"Swapnil","FrontEnd",56787.9));
		ts.add(new Employee(8,"Rushi","BackEnd",56767.9));
		ts.add(new Employee(10,"Sachin","FullStack",54572.5));
		ts.add(new Employee(6,"darshan","SCALA",57572.8));
		//TreeSet<Employee> ts1=(TreeSet<Employee>) ts;
		//System.out.println(ts);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b,c,d for sorting by (id,name,department,salary) ");
		String string=sc.next();
		if(string.equalsIgnoreCase("a"))
		{
			for(Employee employee:ts)
			{
				System.out.println(employee);
			}
		}//Comparing Employee based on names
		else if(string.equalsIgnoreCase("b"))
		{
			ts=new TreeSet<Employee>(Comparator.comparing(Employee::getName));
			ts.add(new Employee(5,"Aniket","tech",36767.9));
			ts.add(new Employee(7,"Ganesh","FullStack",106767.9));
			ts.add(new Employee(3,"Saurabh","GTS",66767.9));
			ts.add(new Employee(2,"Aparna","FullStack",96767.9));
			ts.add(new Employee(4,"Anuska","AWS",86767.9));
			ts.add(new Employee(1,"Chetan","FullStack",46767.9));
			ts.add(new Employee(9,"Swapnil","FrontEnd",56787.9));
			ts.add(new Employee(8,"Rushi","BackEnd",56767.9));
			ts.add(new Employee(10,"Sachin","FullStack",54572.5));
			ts.add(new Employee(6,"darshan","SCALA",57572.8));
			for(Employee employee:ts)
			{
				System.out.println(employee);
			}	
		}
		//Comparing based on department
		else if(string.equalsIgnoreCase("c"))
		{
			ts=new TreeSet<>(Comparator.comparing(Employee::getDepartment));
			ts.add(new Employee(5,"Aniket","tech",36767.9));
			ts.add(new Employee(7,"Ganesh","FullStack",106767.9));
			ts.add(new Employee(3,"Saurabh","GTS",66767.9));
			ts.add(new Employee(2,"Aparna","FullStack",96767.9));
			ts.add(new Employee(4,"Anuska","AWS",86767.9));
			ts.add(new Employee(1,"Chetan","FullStack",46767.9));
			ts.add(new Employee(9,"Swapnil","FrontEnd",56787.9));
			ts.add(new Employee(8,"Rushi","BackEnd",56767.9));
			ts.add(new Employee(10,"Sachin","FullStack",54572.5));
			ts.add(new Employee(6,"darshan","SCALA",57572.8));
			for(Employee employee:ts)
			{
				System.out.println(employee);
			}
		}
		//Comparing by salary
		else if(string.equalsIgnoreCase("d"))
		{
			ts=new TreeSet<>(Comparator.comparing(Employee::getSalary));
			ts.add(new Employee(5,"Aniket","tech",36767.9));
			ts.add(new Employee(7,"Ganesh","FullStack",106767.9));
			ts.add(new Employee(3,"Saurabh","GTS",66767.9));
			ts.add(new Employee(2,"Aparna","FullStack",96767.9));
			ts.add(new Employee(4,"Anuska","AWS",86767.9));
			ts.add(new Employee(1,"Chetan","FullStack",46767.9));
			ts.add(new Employee(9,"Swapnil","FrontEnd",56787.9));
			ts.add(new Employee(8,"Rushi","BackEnd",56767.9));
			ts.add(new Employee(10,"Sachin","FullStack",54572.5));
			ts.add(new Employee(6,"darshan","SCALA",57572.8));
			for(Employee employee:ts)
			{
				System.out.println(employee);
			}
		}
		sc.close();	
	}

}