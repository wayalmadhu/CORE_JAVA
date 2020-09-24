//Question24
import java.util.Scanner;
class findEle{
    public static void main(String args[]) {
        int flag = 0;
        Scanner b = new Scanner(System.in);
        int a = b.nextInt();
        int arr[] = new int[] {10,12,13,14,15};
        System.out.println("Enter element to find :");
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]== a)
            {
                System.out.println("Element found");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Element not found");
        }
    }
}