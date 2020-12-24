package Array;

public class SumOfArray {

	public static void main(String[] args) {
		int sum = 0;
		int a[] = { 10, 20, 30, 40, 20 };
		System.out.println(a);
		/*
		 * for(int num:a) { sum=sum+num; } System.out.println("sum of Array is "+sum); }
		 * }
		 * 
		 * 
		 * /* using for loop
		 */
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum of Array is " + sum);
	}

}
