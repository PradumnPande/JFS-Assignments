package assignment2OOPS;

public class Client {
    public static void main(String[] args) {
        manager man=new manager(500,100);
        labour lab=new labour(150,40);
        man.salary();
        lab.salary();
        int totalSalary=man.get()+lab.get();
        System.out.println("Total Salary of all employees: "+totalSalary);
        //this class is for employee class
    }
}