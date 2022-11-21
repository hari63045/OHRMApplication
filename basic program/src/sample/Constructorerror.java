package sample;

import java.util.Scanner;

public class Constructorerror {
private Scanner scan;
private  char ch;
private String result;
public  void scanCharValue() {
	System.out.println("Enter character value");
	 scan=new Scanner(System.in);
	 ch=scan.next().charAt(2);
}
public String getchartype() {
if(ch>= 'A' && ch<='Z')
	result= "uppercase";
	else if (ch>='a' && ch<='z')
		result = "lowercase";
	else if (ch>=0 && ch<=9)
		result = "digit";
	else
		result= "special character";
return result;
}
public void display(int result)
{
	System.out.println(ch+" is "+result);
}
public static void main(String[] args) {
	Constructorerror obj= new Constructorerror();
obj.scanCharValue();
	obj.getchartype();
obj.display(0);
	}
}
