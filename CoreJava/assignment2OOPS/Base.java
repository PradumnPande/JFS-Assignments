package assignment2OOPS;

abstract class shape {
    abstract void draw();
}
class circle extends shape {
    public void draw(){
        System.out.println("circle....");
    }
}
class rectangle extends shape {
    public void draw(){
        System.out.println("rectangle .....");
    }
}
class cube extends shape{
    public void draw(){
        System.out.println("cube....");
    }
}
class square extends shape{
    public void draw(){
        System.out.println("square....");
    }
}
public class Base{
	public static void draw_All(shape obj){
        obj.draw();
    }
    public static void main(String[] args) {
        shape cr=new circle();
        shape r=new rectangle();
        shape c=new cube();
        shape s=new square();
        draw_All(cr);
        draw_All(r);
        draw_All(c);
        draw_All(s);
    }
   
    
}