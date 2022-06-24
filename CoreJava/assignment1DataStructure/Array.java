package assignment1DataStructure;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int[]a= {5,12,14,6,78,19,1,23,26,35,37,52,7,86,47};
		System.out.println("Enter the no for search");
		int n = sc.nextInt();
		int j=1;
		for (int i=0;i<15;i++) {
			
			if (a[i]==n){
				System.out.println("Value to be search is : "+n);
				j=0;
			}
			
		}
		if(j==1)
		{
		 System.out.println("There is no such number in array list");
	}}

}
