package Strings;

public class reverseseperately {
	public static void main(String[] args) {
		String str1 = "RASHMIARJUNAGI";
		String str2 = "";
		String str3 = "";
		char ch[] = str1.toCharArray();
		for (int i = (ch.length / 2); i >= 0; i--) {
			str2 = str2 + ch[i];
		}
		System.out.println(str2);
		for (int i = ch.length - 1; i >= (ch.length / 2); i--) {
			str3 = str3 + ch[i];
		}
		System.out.println(str3);

	}
}
