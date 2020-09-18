import java.util.Scanner;
class Marriage{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter gender : ");
    char y = sc.next().charAt(0);
    System.out.println("Enter age : ");
    int a = sc.nextInt();
    if(y=='M' && a>18)
    {
         System.out.println("It is eligible");
    }
         else if(y=='F' && a>21)
         {
            System.out.println("It is eligible"); 
         }
        
    
    else
    {
         System.out.println("It is not eligible ");
    }
}
}
