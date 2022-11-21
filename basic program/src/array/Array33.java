package array;

import java.util.Scanner;

public class Array33 {
	
	private Scanner scan;

	Array33(){
		 scan = new Scanner (System.in);
	}
	public int scanArraysize() {
		System.out.println("Enter no of elements");
		return scan.nextInt();
	}
	public int[] scanIntArrayValues(int size) {
		int a[]=new int[size];
		System.out.println("Enter array values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		return a;	
	}
	public  void displayIntArrayValues(int a[]) {
		System.out.println("Array values : ");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
	}
	public static void main(String[] args) {
		Array33 obj=new Array33();
	int size =	obj.scanArraysize();
	int  a[] =	obj.scanIntArrayValues(size);
	obj.displayIntArrayValues(a);
	}

}
