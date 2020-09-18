import java.util.Scanner;
class Byte1{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value a : ");
    byte a = sc.nextByte();
    System.out.println("Enter value b : ");
	byte b = sc.nextByte();
	int c = a + b;
    byte res = (byte)c;
	System.out.println("Sum = "+res);
}

}