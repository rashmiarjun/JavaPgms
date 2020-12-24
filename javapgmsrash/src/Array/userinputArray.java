package Array;

import java.util.Scanner;

public class userinputArray {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter the Array");
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum=sum+s1.nextInt();
		}
		System.out.println("sum of Array is " + sum);

}}
