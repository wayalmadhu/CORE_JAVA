import java.util.Scanner;

class Percentage{
	public static void main(String args[])

{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 5 subjects marks");
	int a = sc. nextInt();
	int b = sc. nextInt();
	int c = sc. nextInt();
	int d = sc. nextInt();
	int e = sc. nextInt();
	int per = (((a+b+c+d+e)/5)*100)/100;
	System.out.println("percentage marks = " +" "+ per+"%");
}

}