package sample;

public class Constructor {
	 int a;
	 float f;
	 String s;
	 int m;
	Constructor(){
		System.out.println("without parameters");
		
		a=20;
		f=20.5f;
		s="hari";
		
		System.out.println("a ="+a+ "F :"+f+ " S :" +s);
	}
	Constructor(int i, float j,String k, int n){
	
		System.out.println("with  parameters");
		this.a=i;
		this.f=j;
		this.s=k;
		this.m=n;
		System.out.println("a ="+i+ "F :"+j+ " S :" +k+ " M "+n);
	}
/*public  void display() {
	System.out.println("a ="+a+ "F :"+f+ " S :" +s);
}*/
public static void main(String[] args) {
	Constructor obj = new Constructor();
	Constructor obj1=new Constructor();
	
}
}
