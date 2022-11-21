package conditions;

import java.util.Scanner;

public class Ifelse {
	public static int valuesa() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a=scan.nextInt();
		return a;
	}
	public static int valuesb() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the value of B");
		int b=scan.nextInt();
		return b;
	}
	public static String greaterthenlessthen(int a, int b) {
		String result;
	if (a>b) 
		result="A is greater then";
		
	else if (a<b)
      result="b is grater";
	
		else
			result = "both are equal";
			return result;
	}
	public static void display(String result,int a, int b) {
		System.out.println("a="+a+" b="+b+"\n"+result);
		}
	public static void main(String[] args) {
	int a=Ifelse.valuesa();
	int b=Ifelse.valuesb();	
	String result=Ifelse.greaterthenlessthen(a, b);
	Ifelse.display(result, a, b);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 

