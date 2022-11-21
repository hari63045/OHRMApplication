package array;

public class FindMinMax extends Array3 {
	public int findMinValue(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}

	
	/*public int findMaxValue(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		return max;
  }*/
	public static void main(String[] args) {
		FindMinMax find =new FindMinMax();
		int size=find.scanArraySize();
	int a[]=find.scanIntArrayValues( size);
	int min=find.findMinValue(a);
	//int max= find.findMaxValue(a);
	find.displayValue("minimum value", min);
	//find.displayValue("Maximum Value ", max);
		
	}
}
