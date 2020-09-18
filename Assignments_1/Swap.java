import java.util.Scanner;
class Swap{
	public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Two Numbers");
	int i = sc.nextInt();
	int j = sc.nextInt();
	System.out.println("Before swap"+ i +" "  +j);
	i = i+j;
	j = i-j;
	i = i-j;
	
	System.out.println("After swap"+ i+" "+j);
	
}
}