package basic_program;

public class preincrement {
public static void main(String[] args) {
int a=10;
int b=++a;
int o=a+b;
System.out.println("preincrement :"+a+" "+b);
System.out.println("addation : "+o);
int c=10;
int d=c++;
System.out.println("postincrement :"+c+" "+d);
int e=10;
int f=8- --e;
System.out.println("predecrement :"+e+" "+f);
int g=10;
int h=10+ ++g;
System.out.println("preincrement :"+g+" "+h);
int i=25;
int j=10+ i++;
System.out.println("postincrement :"+i+" "+j);
int k=10;
int l=10 + k--;
System.out.println("postdecrement :"+k+" "+l); // its constant it may( +, -) in postincrement
int xx=10;
int yy=2*3+ ++xx;
System.out.println(+xx+ " "+yy);
}
}




