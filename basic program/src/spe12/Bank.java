package spe12;

import java.util.Scanner;

public class Bank {
	private int sum,count;
	private Scanner scan;
	
	
	public  int lowercase() {
		scan =new Scanner(System.in);
		System.out.println("Enetr the lowercase :");
		int lower=scan.nextInt();
		return lower;
		
	}
	public int uppercase() {
		System.out.println("Enetr the uppercase :");
		int upper=scan.nextInt();
		return upper;
	}
	public void evenNumbers(int lower,int upper)
	{
		sum=0;
		count=0;
				for(int i=lower;i<=upper;i++) {
					int rem=i%2;
					if(rem==0) {
						System.out.println(i);
						sum=sum+i;
						count++;	
					}
					
				}
	}
	
	public void displayevennumber() {
		System.out.println("How many even numbers is there: "+sum);
		System.out.println("numbers of count:"+count);
	}
	
		public static void main(String[] args) {
			        Bank obj=new Bank();
			        int lower =	obj.lowercase();
                 int upper=   obj.uppercase();
                    obj.evenNumbers(lower, upper);
                     obj.displayevennumber();
		}
		
		
	}

	
	

