package reversingthenum;
import java.util.Scanner;

public class Reversing {
	int rev=0;
	int remender;
	private Scanner scan;
	Reversing(){
	  scan = new Scanner(System.in);
	}
	 public int enterthevalue() 
	{
		
		 System.out.println("enter n value");
		  int n= scan.nextInt(); 
		 return n;
		
	}
	public int reversvalueoutput(int n)
	{
		
		while(n>0)
			{
			int rem=n%10;
			 rev=rev*10+rem;
			 n=n/10;
			}
		return rev;
	}
	public void displayrevalue(int rev, String revofnum) {
		System.out.println(rev+ " "+revofnum);
	}
	public boolean ispallidrome(int n,int rev) {
		return n==rev;
		
	}
	public void displaypollidromeornot(boolean status) {
		if(status) {
			System.out.println("pollidrome");
		}
		else {
			System.out.println("notpolidrome");
		}
		
	}
 

	
	public static void main(String[] args) {
		Reversing obj=new Reversing();
	int n=	obj.enterthevalue();
	int rev=obj.reversvalueoutput(n);
	obj.displayrevalue(rev, "number after reversed");
	boolean status=obj.ispallidrome(n, rev);
	obj.displaypollidromeornot(status);
	
	
		
	}
	

}
