package assignment1DataStructure;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String user;
		String pass;
		int i=0;
		 for( i=0;i<3;) {
			 System.out.println("Enter user name");
			 user = sc.next();
			System.out.println("Enter Password");
			 pass = sc.next();
			 
			 if(user.length()<4 || pass.length()>6) {
				 
				 System.out.println("Invalid Credential");
				 i++;
			 }
			 else {
			 System.out.println("Welcome");
			 break;
			 }
		 }
		 if(i==3) {
		 System.out.println("Contact Admin");
		 }

	}

}
