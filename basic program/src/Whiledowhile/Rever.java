package Whiledowhile;

import java.util.Scanner;

public class Rever {
	private Scanner scan;
	 int reverse=0;
	 int remender;
	public  Rever() {
	scan=new Scanner(System.in);
	}
	public int entervalue() {
		System.out.println("enter the value");
		return scan.nextInt();
	   
		}
	public int displayreverse(int n) {
		reverse=0;
		while(n>0) {
			remender=n%10;
			reverse=reverse*10+remender;
			n=n/10;
		}
		return reverse;
	}
		public void dislaythevalue(int reverse){
			System.out.println("Display the values in reverse :"+reverse);
		}
	
	
	public static void main(String[] args) {
	
	Rever obj=new Rever();	
	 int n=obj.entervalue();
     int reverse= obj.displayreverse(n);
     obj.dislaythevalue(reverse);
      
		
	}
}
