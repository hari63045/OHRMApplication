package sample;
import sample.type2;
public class Type3 {
	public void display	(int result) {
		System.out.println("result ="+result);
	}
	public static void main(String[] args) {
       type2 obj=new type2();
       int result=obj.add();
       
       Type3 hi=new Type3();
       System.out.println(result);
    
	}

}
