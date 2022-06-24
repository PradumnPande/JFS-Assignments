package assignment2OOPS;

abstract class bank{
	   abstract public void disp();
	}
	class savingAcc extends bank{
	    double balance;
	    double fd;
	    public savingAcc (double balance,double fd){
	        this.balance=balance;
	        this.fd=fd;
	    }
	    public void disp(){
	        System.out.println("Total money in saving:"+(balance+fd));
	    }
	    public double get(){
	        return balance+fd;
	    }
	}
	class currentAcc extends bank{
	    double balance;
	    double cashCredit;
	    public currentAcc(double bal,double cashCredit){
	        this.balance=balance;
	        this.cashCredit =cashCredit;
	    }
	    public void disp(){
	        System.out.println("Total money in current: "+(balance+cashCredit));
	    }
	    public double get(){
	        return balance+cashCredit;
	    }
	}

	public class Bank2 {
	    public static void main(String[] args) {
	        savingAcc s=new savingAcc(3000,4000);
	        currentAcc c=new currentAcc(500000,20000);
	        s.disp();
	        c.disp();
	        double totalAmount=s.get()+c.get();
	        System.out.println("The total money in bank: "+totalAmount);
	    }
	}