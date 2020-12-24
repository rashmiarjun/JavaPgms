package Loops;

import java.util.Scanner;

public class Pallindromenum {
	static int revnum;
public static void main(String[] args) {
	
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the number");
	int newnum=s1.nextInt();
	int num=newnum;
	while(num>0)
	{
	int	digit=num%10;
	revnum=revnum*10+digit;
	num/=10;
	}
	System.out.println("reverse number "+revnum);
	if(newnum==revnum)
	{
		System.out.println("number "+newnum+" is pallidrome");
	}
	else
	{
		System.out.println("number "+newnum+ " is not pallidrome");
	}
}
}
