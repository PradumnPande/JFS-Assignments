package assignment2OOPS;

abstract class Employee{
	
abstract public void salary();
}
class manager extends Employee{
    int sal;
    int incentive;
    public manager(int sal,int incentive){
        this.sal=sal;
        this.incentive=incentive;
    }
    public void salary(){
        System.out.println("Manager Salary:"+(sal+incentive));
    }
    public int get(){
        return sal+incentive;
    }
}
class labour extends Employee{
    int overtime;
    int labourSal;

    public labour(int labourSal,int overtime){
        this.labourSal=labourSal;
        this.overtime=overtime;
    }
    public void salary(){
        System.out.println("Labour Salary:"+(labourSal+overtime));
    }
    public int get(){
        return labourSal+overtime;
    }
}