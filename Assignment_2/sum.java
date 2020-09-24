//Question:19

import java.util.Scanner;
class sum{
    public static void main(String args[])
    {   
        System.out.println("Enter number");
        int sum;
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        sum =(n*(n+1)*((2*n)+1))/6;
        System.out.println("Sum of series "+sum);



    }
}