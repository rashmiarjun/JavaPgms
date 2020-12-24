package java1;

import java.util.Scanner;
//String s="Rashmi123" when you Enter only Char output should be False

public class interviewq {
	public static void main(String[] args) {
		String s1="Rashmi123";
		String s2=s1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s3=s.nextLine();
	    char a[]=s1.toCharArray();
		System.out.println(a);
		char b[]=s3.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;i++)
			{
				if(a[i]==b[j])
					
			{
						System.out.println("true");
			}
					else
			{
						System.out.println("False");
			}
				
		
		
	}}}}

