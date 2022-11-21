package array;

import java.util.Scanner;

public class Array3 {
	public Scanner scan;
	
	public Array3()
	{
		 scan = new Scanner(System.in);
	}
	public int scanArraySize()
	{
		System.out.println("Enter no.of elements");
		return scan.nextInt();
	}
	public int[] scanIntArrayValues(int size)
	{
	int a[]=new int[size];
	System.out.println("Enter values");
	for(int i=0;i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	return a;
	}
	public void displayIntArrayValues(int a[])
	{
		System.out.println("Array values:");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");	
	}
	public void displayIntArrayValues(int a[],String typeOfArray) {
		System.out.println("type of array");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
	}
public void displayValue(String typeofvalue,int value) {
	System.out.println(typeofvalue+ " "+value);
}
	public static void main(String[] args) {
		Array3 obj = new Array3();
		int size=obj.scanArraySize();
	    int a[]=obj.scanIntArrayValues(size);
		obj.displayIntArrayValues(a);
		}
	
	}


