import java.util.*;
class main
{
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        System.out.println("value x is = "+x);

         System.out.println("Equation : y = x2 + 3x -7");
        int y = (x*x) + (3*x) - 7;
        System.out.println("value of  y = "+y);

         System.out.println("Equation : y = x++ + ++x");
        y = x++ + ++x;
         System.out.println("value of y = "+x+" | value of y = "+y);

         System.out.println("Equation : z = x++ - --y - --x  +  x++ ");
         int z = x++ - --y - --x  +  x++ ;
         System.out.println("value of y = "+x+" | value of y = "+y+" | value of z = "+z);

         boolean x1,y1;
         System.out.println("Enter the value of x and y as true and false : ");
         Scanner sc = new Scanner(System.in);
         x1 = sc.nextBoolean();
         y1 = sc.nextBoolean();
         boolean z1 = x1 && y1 || !(x1 || y1);
         System.out.println("Final boolean value of z = "+z1);
        
           }
}