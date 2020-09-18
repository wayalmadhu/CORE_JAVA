import java.util.Scanner;
class Greaterno{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value a : ");
    int a = sc.nextInt();
    System.out.println("Enter value b : ");
    int b = sc.nextInt();
    System.out.println("Enter value c : ");
    int c = sc.nextInt();
    if(a>b && b>c)
    {
        System.out.println("a is greater");

    }
    else if(b>c)
    {
         System.out.println("b is greater"); 
    }
    else
    {
         System.out.println("c is greater");
    }

}
}
