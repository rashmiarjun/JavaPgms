package Array;

public class TwoMaxElement {
public static void main(String[] args) {
	int a[]= {40 ,14,250,3,18};
	int	max1=a[0];
	int max2=a[1];
	for(int i=1;i<a.length;i++)
	{
		if(max1<a[i])
		{
			max2=max1;
			max1=a[i];
		}
		else if(max2<a[i])
		{
			max2=a[i];
		}
	
	}
	System.out.println("first max element in the array is " +max1);
	System.out.println("Second max element in the array is " +max2);
}
}
