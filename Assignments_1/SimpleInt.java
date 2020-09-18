import java.util.Scanner;

class SimpleInt{
	public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Principle");
	double p = sc.nextDouble();
	System.out.println("Enter Rate of interest");
	double r = sc.nextDouble();
	System.out.println("Enter time");
	double t = sc.nextDouble();
	
	double simpleint = ((p*r*t)/100);
	System.out.println("Simple interest is :" + simpleint);

}

}