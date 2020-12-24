package Loops;

public class Fibbonicci {
	public static void main(String[] args) {
		int a=0;
		System.out.println(a);
		int b=1;
		System.out.println(b);
		int num=5;
		for(int i=0;i<=num;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		
	}

}}
//using recursion