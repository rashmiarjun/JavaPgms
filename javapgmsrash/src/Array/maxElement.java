package Array;

import java.util.Scanner;

//WAP to find max Element in array
public class maxElement {
	public static void maxArray(int arr[]) {
		// int arr[] = { 14, 2, 4, 36, 12 };
		int index = 0;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("maximum element in array is" + max);
	}
//WAP to find the max Element sum
	public static void maxEleSum() {
		int a[] = { 2, 25, 89, 23, 5 };
		int min = a[0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >min) {
				int max = a[i];
				sum = sum + max;

			}
		}
		System.out.println("sum of max element Array is " + sum);
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = s1.nextInt();
		int arr[] = new int[size];// giving size
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the array");
			arr[i] = s1.nextInt();// giving array inputs
		}
		maxArray(arr);// calling method5
		maxEleSum();

	}
}
