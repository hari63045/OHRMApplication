package sample;

import java.util.Scanner;

public class type2 {
	//+-
	public int add() {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		type2 obj=new type2();
		int c =obj.add();
		System.out.println("value "+ c);
				
	}
	
}
