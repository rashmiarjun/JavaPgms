package Strings;

public class removeNumInString {
//input1==>"computer"
//input2==>"program"
//output==>"cute"	
	public static void comapreString() {
		String str1 = "computer";
		String str2 = "program";
		String out = "";
		char ch[] = str1.toCharArray();
		char ch1[] = str2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch1.length; j++) {
				if (ch[i] == ch1[j]) {
					count++;
					break;
				}

			}
			if (count == 0) {
				out = out + ch[i];
			}
		}
		System.out.println(out);
	}

//input==>"karanatak@123" for this string we need to remove 123and convert it to int and add 100
//output==>123+100=223
	public static void ConvertNumeric() {
		String s1 = "karanataak@123";
		int out = 0;
		int sum = 87;
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				out = out * 10 + (ch[i] - 48);

			}
			sum = out + sum;
		}
		System.out.println(sum);

	}

//input==>amit works in accollit
//input==>java is  program
//output==>aavj si mrograp===>swapping first char to last n last to first char
public static void SwapChar()
{
	String s1="this is java program";
	char[] ch=s1.toCharArray();
	String out="";
	for(int i=0;i<ch.length;i++)
	{ String res="";
		while(i<ch.length&&ch[i]!=' ')
		{
			res=res+ch[i];
			i++;
		}
		char ch2[]=res.toCharArray();
		char temp=ch2[0];
		ch2[0]=ch2[ch2.length-1];
		ch2[ch2.length-1]=temp;
		res=new String(ch2);
		out=out+res+" ";
	}
	System.out.println(out);
	
	
}
//input==>this is java
//output==>ThiS IS JavA====>only first and last char should convert to uppercase
	public static void main(String[] args) {
		comapreString();
		ConvertNumeric();
		SwapChar();
	}
}
