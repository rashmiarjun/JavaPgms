package Array;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void RemoveDupFromSortedArray() {
		int arr[] = { 21, 21, 34, 55, 96, };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						arr[i] = ' ';
						System.out.println(arr[i]);
					}
				}
			}
			
		}
		//System.out.println(arr[i]);
	}

//WAP to remove the duplicate form unsorted Array
	
	
	public static void main(String[] args) {
		RemoveDupFromSortedArray();
		

	}

}
