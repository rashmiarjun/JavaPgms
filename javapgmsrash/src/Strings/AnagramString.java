package Strings;

public class AnagramString {
//S1="Listen"==>Every char present in first string should present in the second String may be
	//same in same position or diffrent and its case in sensitive
//S2="Silent"
	public static void Anagram(String s1,String s2)
	{
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		String out=" ";
		if(ch1.length==ch2.length)
 		{ int i=ch1[0];
			if(ch1[i]>=65&&ch1[i]<=90)
			{  
				out=out+(char)(ch1[i]-32);
				i++;
			}
		}
		
	}
//WAP to remove the space in between String 
public static void removeSpace(String s)
{   String out="";
	char ch1[]=s.toCharArray();
	for(int i=0;i<ch1.length;i++)
	{
		if(ch1[i]!=' ')
		{
			out=out+ch1[i];
		}
	}
	System.out.println(out);
}
//sorting of string 
public static void Sort(String s1)
{
	char ch[]=s1.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		for(int j=0;j<ch.length;j++)
		{
		if(ch[i]>ch[j])
		{ char temp=ch[j];
		  ch[i]=ch[j];
		  ch[j]=temp;   
			
		}
		}}
}
public static void main(String[] args) {
	String s1="Mother In Law";
	String s2="Hitler Woman";
	removeSpace(s1);
	removeSpace(s2);
	Anagram("Listen", "Silent");
	
}
}
