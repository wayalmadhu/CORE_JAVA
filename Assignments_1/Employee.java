import java.util.Scanner;

class Employee{
	public static void main(String args[])

{
	double Hra,Da,g;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter salary");
	double s = sc.nextDouble();
	if (s<10000)
{
	 Hra= (s*0.1);
	Da = (s*0.9);
	
	
}

	else
{
	 Hra=2000;
	Da = (s*0.98);
	
}
	g = s + Hra + Da;
	System.out.println("Gross sal is:"+g);
	
}
}