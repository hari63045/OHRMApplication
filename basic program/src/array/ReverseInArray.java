package array;

public class ReverseInArray extends Array3 {
public int[] reverseIntArray(int a[])
{
	for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
	{
		int temp=a[i];
		    a[i]=a[j];
		    a[j]=temp;
	}
	return a;
}
public static void main(String[] args) {
	ReverseInArray find=new ReverseInArray();
	int size=find.scanArraySize();
	int a[]=find.scanIntArrayValues(size);
	find.displayIntArrayValues(a, "Before Reverse of array : ");
	int rev[]=find.reverseIntArray(a);
	find.displayIntArrayValues(rev, "After Reverse of array : ");
}
}
