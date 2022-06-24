package assignment2OOPS;

public class Singletone {
	  private static String name;
	  private Singletone(){

	      }
	      public static void getFullName(String firstName,String lastName ){
	          name=firstName+" " +lastName;
	          System.out.println(name);
	      }
	      public static void main(String[] args) {
	    	  Singletone sc=new Singletone();
	          sc.getFullName("I am","IronMan");
	      }
	  }
