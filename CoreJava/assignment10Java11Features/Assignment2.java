package assignment10Java11Features;


interface cal{
	int sum(int x,int y);
}
public class Assignment2 {
public static void main(String args[])
{
	cal c=(var x,var y)->x+y;
	System.out.println("The addition of two number is: "+c.sum(2, 4));
	
}
}