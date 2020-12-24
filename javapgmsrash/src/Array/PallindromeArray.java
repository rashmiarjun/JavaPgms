package Array;

public class PallindromeArray {
	public static void main(String[] args) {
		int arr1[] = { 12, 25, 3, 25, 12 };
		int arr2[] = new int[5];
		int j = 0;
		for (int i = arr1.length - 1; i >= 0; i--) {
			arr2[j] = arr1[i];
			System.out.println(arr2[j]);
		}
		if (arr1== arr2) {
			System.out.println("Array is Palindrome");
		}
		else
		{
			System.out.println("Array is not pallindrome");
		}
		

	}
}
