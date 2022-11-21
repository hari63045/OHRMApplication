package evennum;

import java.util.Scanner;

public class Displayevennumberandsum {
private int add,count;
private Scanner scan;
   public Displayevennumberandsum() 
   {
	  scan=new Scanner(System.in);
   }
   public int scanlowerlimit()	
   {
	  System.out.println("enter lower limit ");
   	  int lw=scan.nextInt();
	  return lw;
	
   }
   public int scanupperlimit()	
   {
	  System.out.println("enter upper limit ");
	  int up=scan.nextInt();
	  return up;
	
   }
   public void displayevennumberandsum(int lw, int up)
   {
	   add=0;
	   count=0;
	   for(int i=lw;i<=up;i++)
	   {
		  int rem=i%2;
		  if(rem==1)
		  {
			  System.out.println(i);
		  add=add+i;
		  count++;
		  }
		  
	   }
 }
public void Displaysum()
{
	System.out.println("sum of odd num from given range "+add);
	System.out.println("count of odd num"+count);
}
public static void main(String[] args) {
	Displayevennumberandsum obj=new Displayevennumberandsum ();
	int lw=obj.scanlowerlimit();
	int up=obj.scanupperlimit();
	obj.displayevennumberandsum(lw, up);
	obj.Displaysum();
	
}
}

