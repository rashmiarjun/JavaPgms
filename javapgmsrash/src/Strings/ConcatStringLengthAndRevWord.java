package Strings;

public class ConcatStringLengthAndRevWord {
//input==>this is string
//output==>this4is2string6
	public static void main(String[] args) {
		String s1 = "this is String";
		String s2 = " ";
		int count = 0;
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count++;
			s2 = s2 + ch[i];

			if (ch[i] == ' ') {

				s2 = s2 + count;
			}
		}
		System.out.println(s2);
	}

}
