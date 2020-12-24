package Strings;

public class Reverse {
//reversing with less number of iteration
	public static String reverseStringBySwap() {
		String s1 = "JAIANJANEYA";
		
		char[] ch = s1.toCharArray();
		for (int i = 0, j = ch.length-1; i < ch.length / 2; i++, j--) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		return new String(ch);
	}

	public static void reverse() {
		String str1 = "RASHMI";
		String str2 = "";

		char ch[] = str1.toCharArray();
		System.out.println(ch);
		for (int i = ch.length - 1; i >= 0; i--) {
			str2 = str2 + ch[i];
		}
		System.out.println(str2);
	}

	public static void main(String[] args) {
		reverseStringBySwap();
		reverse();
	}
}