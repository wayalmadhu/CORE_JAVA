import java.util.Scanner;

class Days{
	public static void main(String args[])
{
	int year, month , days;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of days:");
	int n = sc.nextInt();
	year = n / 365;
	n = n -(365*year);
	month = n / 30;
	days = n - (month*30);
	System.out.println("Year:"+year + "    Months:"+ month + "     Days:"+days);


}
}