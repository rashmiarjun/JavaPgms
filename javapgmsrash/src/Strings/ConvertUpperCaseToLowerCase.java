package Strings;

public class ConvertUpperCaseToLowerCase {
//A-Z=65 to 90
//a-z=97 to 122
//a===A	
//converting ABCD to abcd	
	public static void UpperToLower() {
		String s1 = "ABCD";
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char ch1 = (char) (ch[i] + 32);
			System.out.print(ch1);
		}

	}

//Converting abcd to ABCD
	public static void LowerToUpper() {
		String s1 = "rashmi";
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char ch1 = (char) (ch[i] - 32);
			System.out.print(ch1);
		}

	}

//converting mixed upper to lower lower to upper
	public static void convertcases() {
		String s1 = "RaShmIARJnagi";
		String out = "";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i] >= 65 && ch[i] <= 90)
			{
				char ch1 = (char) (ch[i] + 32);
				out = out + ch[i];
				System.out.print(ch1);
			} 
			else {

				out = out + ch[i];
				
			}
			
		}

	}

	public static void main(String[] args) {
		UpperToLower();
		System.out.println();
		LowerToUpper();
		System.out.println();
		convertcases();
	}
}
