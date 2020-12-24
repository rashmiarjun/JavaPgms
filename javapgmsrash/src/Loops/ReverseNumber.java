package Loops;

import java.util.Scanner;

public class ReverseNumber {
	static int rev;
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s1.nextInt();
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
			
		}
	
		System.out.println("Reverse number is :" +rev);
	}

}
