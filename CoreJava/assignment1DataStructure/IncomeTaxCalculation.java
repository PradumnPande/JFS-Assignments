package assignment1DataStructure;

import java.util.Scanner;

public class IncomeTaxCalculation {

	public static void main(String[] args) {
		
		System.out.println("Enter your CTC");
		Scanner sc = new Scanner (System.in);
		double n = sc.nextDouble();
		int a=180000;
		double tax;
		if(n<=a){
			System.out.println("No need to pay tax");
		}
		else if(n>181001 && n<=300000) {
			tax= (n-a)*10/100;
			System.out.println("Tax = "+tax);
			
		}
		else if(n>300001 && n<=500000) {
			tax= (n-a)*20/100;
			System.out.println("Tax = "+tax);
			
		}
		else if(n>500001 && n<=1000000) {
			tax= (n-a)*30/100;
			System.out.println("Tax = "+tax);
			
		}

	}

}
