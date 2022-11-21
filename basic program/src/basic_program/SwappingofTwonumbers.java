package basic_program;
import java.util.Scanner;
public class SwappingofTwonumbers {
	public static void main(String[] args ) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a,b Enter");
int a=scan.nextInt();
int b=scan.nextInt();
System.out.println("Before Swapping A = "+a+"\nB = "+b);
 int c= a;
a=b+a;
b=c;
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping A = "+a+" B = "+b);


	}

}
