package Array;
//WAP to print min number in Array
public class minElement {
	public static void minElementArray() {
		int arr[] = { 12, 15, 1, 8, 6 };
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("the minimum number in array is " + min);
	}
//WAP to print first two min number
	public static void TwoMinElement() {
		int arr[] = { 120, 11, 121, 8, 6 };
		int min1 = arr[0];
		int min2 = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (min1 > arr[i]) {
				min2 = min1;
				min1 = arr[i];
			} else if (min2 > arr[i]) {
				min2 = arr[i];
			}

		}
		System.out.println("first min element in the array is " + min1);
		System.out.println("Second min element in the array is " + min2);
	}

	public static void ThreeminElement() {
		int arr[] = { 1, 58, 9, 75, 2 };

	}

	// WAP to find the min element sum in the array
	public static void minEleSum() {
		int a[] = { 2, 25, 89, 23, 5 };
		int max = a[2];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < max) {
				int min = a[i];
				sum = sum + min;

			}
		}
		System.out.println("sum of min element Array is " + sum);
	}

	public static void main(String[] args) {
		minElementArray();
		TwoMinElement();
		minEleSum();
	}
}
