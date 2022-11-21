package basic_program;
import java.util.Scanner;
public class scannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Name:");
		String name =scan.nextLine();
		System.out.println("Age: ");
		int age=scan.nextInt();
		System.out.println("Email Id :");
		String emailid =scan.next();
		System.out.println("Marks =");
		int Marks=scan.nextInt();
		System.out.print("Percentage =");
		float Per=scan.nextFloat();
		System.out.println("Name : "+name+"\nAge :"+age+"\nEmail Id : "+emailid+"\nMarks : "+Marks+"\npercentage: "+Per);

 
	}

}
	
