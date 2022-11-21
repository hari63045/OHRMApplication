package Whiledowhile;

import java.util.Scanner;

public class DisplayEvenNumbersAndSum {
private int sum,count;
private Scanner scan;
public DisplayEvenNumbersAndSum(){
	scan=new Scanner(System.in);
}
public int scanlower() {
	System.out.println("Enter the lowervalue");
	int lw=scan.nextInt();
return lw;
}
public int scanUpper() {
	System.out.println("Enter the scanUpper");
	int up=scan.nextInt();
return up;
}
public void displayevennumbers() {
	sum=0;
	count=0;
	for(int i=1;i<=100;i++) {
		int remender=i%2;
		if(remender==0){
			System.out.println(i++);
			sum=sum=i;
			count++;
		}
		
		
	}
			
}
public void displaySum()
{
	System.out.println("\nSum of Above Even Numbers : "+sum);
}

public void displayCount()
{
	System.out.println("\nNo.of  Even Numbers In a Given Range : "+count);
}
public static void main(String[] args) {
	DisplayEvenNumbersAndSum obj=new DisplayEvenNumbersAndSum();
	obj.scanlower();
	obj.scanUpper();
	obj.displayevennumbers();
	obj.displaySum();
	obj.displayCount();
	
}
}
