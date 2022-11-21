package sample;

import java.util.Scanner;

public class Areaofcircle {

	public static int scanradious()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the radious");
		int r=scan.nextInt();
		return r;
	}
	public static float cal(int r)
	{
		float area=3.14f*r*r;
		
		return area;
	}
	public static void display(float area) {
		System.out.println("areaof circle c ="+area);
	}
	public static void main(String[] args) {
		int r=Areaofcircle.scanradious();
		float area=Areaofcircle.cal(r);
		Areaofcircle.display(area);
		
		
	}
	}

