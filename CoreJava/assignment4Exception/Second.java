package assignment4Exception;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn =new Scanner(System.in);
    int [] arr= new int [5];
    System.out.println("enter 2 numbers");
    int a= scn.nextInt();
    int b=scn.nextInt();
    int c=0;
    try {
    	System.out.println("Try starts");
    	c=a/b;
    	arr[c]=75;
    	Thread.sleep(arr[c]);
    	System.out.println("try ends");
    }
    catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
    	System.out.println("arry size is not sufficient");
	}
    catch (ArithmeticException g) {
		// TODO: handle exception
    	System.out.println("operation faild");
	}
    catch (Exception q) {
		// TODO: handle exception
    	System.out.println("Exception handled");
	}
	
    
    
	}

}
