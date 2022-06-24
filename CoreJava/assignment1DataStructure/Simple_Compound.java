package assignment1DataStructure;

import java.util.Scanner;

public class Simple_Compound {

	  public static void simpleInterest(int p,float r,int y){
	        float re=(p * r * y)/100;
	        System.out.println("simple interest :"+re);
	    }
	    public static void compoundInterest(int p,float r,int y){
	        float res= (float) (p*(Math.pow((1+r/100),y)));
	        float re=res-p;
	        System.out.println("compound interest :"+re);
	    }
	    public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter principle amount");
	        int p= scan.nextInt();
	        System.out.println(
	                "Enter rate of interest"
	        );
	        float r= scan.nextFloat();
	        System.out.println("Enter tenure");
	        int y= scan.nextInt();
	        simpleInterest(p,r,y);
	        compoundInterest(p,r,y);
	    }

}
