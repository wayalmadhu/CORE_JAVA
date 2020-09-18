import java.util.Scanner;

class Temperature{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Give temperature in farenheit");
	double f = sc.nextDouble();
	double c =( 5*(f-32)/9);
	System.out.println("Temperature from Fahrenheit to Celsius is :" + c);
}
}