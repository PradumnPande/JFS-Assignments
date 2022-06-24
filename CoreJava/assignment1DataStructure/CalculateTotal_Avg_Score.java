package assignment1DataStructure;

import java.util.Scanner;

public class CalculateTotal_Avg_Score {
	 public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        int[] s1=new int[3];
	        int[] s2=new int[3];
	        int[] s3=new int[3];
	        int sum1=0,sum2=0,sum3=0;
	        System.out.println("Enter student1 marks for three subjects");
	        for(int i=0;i<3;i++){
	            s1[i]= scan.nextInt();
	            sum1+=s1[i];
	        }
	        System.out.println("student1  total score :"+sum1);
	        System.out.println("student1  avg score :"+sum1/3);
	        System.out.println("Enter student2 marks for three subjects");
	        for(int i=0;i<3;i++){
	            s2[i]= scan.nextInt();
	            sum2+=s2[i];
	        }
	        System.out.println("student2  total score :"+sum2);
	        System.out.println("student2  avg score :"+sum2/3);
	        System.out.println("Enter student3 marks for three subjects");
	        for(int i=0;i<3;i++){
	            s3[i]= scan.nextInt();
	            sum3+=s3[i];
	        }
	        System.out.println("student3  total score :"+sum3);
	        System.out.println("student3  avg score :"+sum3/3);
	        System.out.println(
	                "-------------------------------------------------------------------"
	        );
	        for(int i=0;i<3;i++){
	            int ts=s1[i]+s2[i]+s3[i];
	            System.out.println("each subject student total score :"+ts);
	            System.out.println("each subject student avg score :"+ts/3);
	            System.out.println(
	                    "-------------------------------------------------------------------"
	            );
	        }
	    }
}
