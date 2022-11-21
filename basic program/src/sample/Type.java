package sample;

import java.util.Scanner;

public class Type {

	public  void Cal()
	{
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a,b values");
			int a=scan.nextInt(),b=scan.nextInt();
			System.out.println("Type static sum = "+(a+b));
		}
	}
	
	public static void main(String[] args) {
		Type obj=new Type();
		System.out.println("Im main method");

	obj.Cal();
		System.out.println("Im back to main method");
	}
	
}
// one method defination should not define or write inside another method
// one method can be call inside another method


