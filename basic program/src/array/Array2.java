package array;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the array size :");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter values :");
		for (int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();

			System.out.println(a[i]);

		}
		System.out.println("Array Values: ");
		   
		
		
	}
	

}
