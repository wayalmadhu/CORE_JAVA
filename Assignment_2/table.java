//Question:16
import java.util.Scanner;
class table
{   System.out.println("Enter no");
    public static void main(String args[]) {
        Scanner a  = new Scanner(System.in);
        int no = a.nextInt();
        for(int i=1; i<=10; i++)
        {
            int value = i * no;
            System.out.println(value);
        }
    }
}