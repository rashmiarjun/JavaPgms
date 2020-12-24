package Loops;

import java.util.Scanner;
//range of prime num
public class PrimeNum {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=s1.nextInt();
		for(int i=1;i<n;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
				if(isPrime)
				{
					System.out.print(i + " ");
				}
			}
			
		}
	}


