package sample;

public class Sample1 {
	static int currentbalance =1000;
	public static void customergreetings() {
		System.out.println("Welocome to program");
	}
	public void deposit(int amount) {
		currentbalance = currentbalance+ amount;
		System.out.println("amount is deposited sucessfully");
	}
	public static void withdrawal(int amount) {
		currentbalance = currentbalance - amount ;
		System.out.println("amount is withdrawn sucessfully");
	}
	public  int getcurrentbalance() {
		return currentbalance;
	}
public static void main(String[] args) {
	Sample1 bank=new Sample1();
	customergreetings();
	System.out.println("current balance is :"+bank.getcurrentbalance());
	bank.deposit(500);
	
	
	System.out.println("current balance is :"+bank.getcurrentbalance());
withdrawal(300);

System.out.println("current balance is :"+bank.getcurrentbalance());
withdrawal(200);
System.out.println("current balance is :"+bank.getcurrentbalance());




}
}

