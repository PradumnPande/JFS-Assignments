package assignment3String;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String str = "JAVA String pool refers to collection of Strings which are stored in heap memory";
		        String result = str.toLowerCase();
		        String result2=str.toUpperCase();
		        String str1 = str.replace("a", "$");
		        String test = "collection";
		        Boolean bool = str.contains(test);
		        String s1="java string pool refers to collection of strings which are stored in heap memory";
		        
		        
		        System.out.println("Original String  : " + str);
		        System.out.println("Lowercase String : " + result);
		        System.out.println("Uppercase String : "  + result2);
		        System.out.println("after replace :" + str1);
		        System.out.println(bool);
		        System.out.println(str.equals(s1));
		        

	}
}