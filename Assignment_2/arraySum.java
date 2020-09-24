//Question:21
import java.util.Scanner;
class arraySum{
    public static void main(String args[]){
        int sum=0;
        float avg;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter no of element you want to insers");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter numbers");
        for(int i=0; i<n; i++)
        {
            arr[i]= s.nextInt();
            sum= sum+arr[i];
        }
        System.out.println("Sum of array elements = "+sum);
        avg=(sum/n);
        System.out.println("Avg of arry element = "+avg);
    }
}