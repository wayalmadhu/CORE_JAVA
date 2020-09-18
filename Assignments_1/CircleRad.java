import java.util.Scanner;

class CircleRad{
	public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of circle");
	double i = sc.nextDouble();
	double area = (2*3.14*i);
	double circum = (3.14*i*i);
	 System.out.println("Area of circle is:" + area);
	 System.out.println("Circumference of circle is:" + circum);
}
}