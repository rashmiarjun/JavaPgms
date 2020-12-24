package Strings;

public class reverseoneword {
	public static void main(String[] args) {
		String str1 = "RASHMI ARJUNAGI";
		String str2 = "";
		String str3 = "";
		char ch[]=str1.toCharArray();
		/*
		 * reversing only one word
		 */
		System.out.println(ch.length);
		
		for(int j=0;j<=ch.length-9;j++)
			{
				str2=str2+ch[j];
				
			}
		for(int i=ch.length-1;i>=0;i--)
		{
			if(ch[i]==' ')
			{
				break;
			}
			str3=str3+ch[i];
		}
		System.out.println(str2);
		System.out.println(str3);
	}
}
