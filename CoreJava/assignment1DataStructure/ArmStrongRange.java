package assignment1DataStructure;

public class ArmStrongRange {
    
    public static void main(String[] args)
    {
        int n1,n2,n3,res,temp;
        for(int number = 100; number <= 999; number++)
        {
            temp = number;
            n3=temp%10;
            temp=temp/10;
 
            n2=temp%10;
            temp=temp/10;
 
            n1=temp%10;
            res=(n1 * n1 * n1)+( n2 * n2 * n2)+(n3 * n3 * n3);
 
            if(number==res){
                System.out.println(" 100 to 699 armstrong Number is:"+ number);
            }
        }
    }
}
 
