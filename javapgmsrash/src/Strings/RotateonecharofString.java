package Strings;

public class RotateonecharofString {
	public static boolean rotateString(String s1,String s2) {
	s1=s1+s2;
	char ch1[]=s1.toCharArray();
	char ch2[]=s2.toCharArray();
	for(int i=0;i<ch1.length;i++)
	{
		int j=0;
		int k=i;
		while(j<ch2.length&&ch1[k]==ch2[j])
		{
			
			k++;
			j++;
		}
		if(j==ch2.length)
		{
			return true; 
		}
	}
	
	return false;
	
}
//input==>programming
//rotate two times right 	
//rotate==>ngprogrami
	public static String rotate(String s3,int times)
	{
		char c1[]=s3.toCharArray();
		for(int j=0;j<times;j++)
		{
		char temp=c1[c1.length];
		for(int i=0;i<c1.length;i++)
		{
			c1[i]=c1[i-1];
		}
		c1[0]=temp;
	}
		return new String(c1);
	}
public static void main(String[] args) {
	String s1="this is String";
	String s2="tri";
	boolean res=rotateString(s1,s2);
	
	if(res)
	
		System.out.println("it is a rotation");
	else
		System.out.println("its not a rotation") ;
}

}

	

	/*public static void main(String[] args) {
		String str1 = "Tejas";
		char ch[] = str1.toCharArray();
		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
//Rotating only first character
			if (ch[i] ==ch[0]) {
				char temp = ch[i];
				String str2 = String.valueOf(ch, 1, ch.length-1);
				System.out.println(str2 + temp);

			}
		}

	}
}*/
//Rotating middle character at last



