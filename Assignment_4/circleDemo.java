//Question34
import java.util.Scanner;
class circle{
    private float radius;
    private double area;
    Scanner r = new Scanner(System.in);
    void init(){
        System.out.println("Enter radius of circle");
        radius = r.nextFloat();
    }
    void calculateArea()
    {
        area = 3.14*radius*radius;
    }
    void display()
    {
        System.out.println("Area and radius of circle are "+area+" "+radius);
    }
}

class circleDemo{
    public static void main(String args[]) {
        circle e = new circle();
        e.init();
        e.calculateArea();
        e.display();
    }
}