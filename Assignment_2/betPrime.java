//Question:20
import java.util.Scanner;
class betPrime{
    public static void main(String args[]) {
       System.out.println("Enter Two numbers");
        Scanner a = new Scanner(System.in);
        int low = a.nextInt();
        int high = a.nextInt();
        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

               ++low;
        }
    }
}