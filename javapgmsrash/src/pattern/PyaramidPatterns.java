package pattern;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PyaramidPatterns {
	public static void pp1()
	{
		int n=4;
		for(int row=0;row<n;row++)
		{ 
			for(int space=0;space<n-1-row;space++)
			
			{
				System.out.print  (" ");
			}
			for(int star=0;(2*row)>=star;star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
public static void pp2()
{
	int n=4;
	for(int row=n-1;row>n;row--)
	{ 
		for(int space=0;space<n-1-row;space++)
			    {
			System.out.print  (" ");
		}
		for(int star=0;(2*row)>=star;star++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}}
public static void pp3()
{
	int n=5;
	for(int row=0;row<n;row++)
	{
		int count=1;
		for(int space=0;space<n-1;space++)
		{
			
		}
	}
}
public static void pp4()
{
	int n=4;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
public static void pp5()
{
	int n=3;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i+j>=n-1)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
public static void main(String []args) {
	pp1(); 
	System.out.println();
	pp2();
	System.out.println();
	pp3();
	System.out.println();
	pp4();
	System.out.println();
	pp5();
	
}}