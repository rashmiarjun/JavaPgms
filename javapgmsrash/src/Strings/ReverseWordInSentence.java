package Strings;

public class ReverseWordInSentence {
	// using while loop we are reversing the string removing spaces too
	public static void revsentence() {
		String s1 = "watching the movie";
		String s2 = " ";
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			while (ch[i] == ' ') {
				s2 =ch[i]+s2;
				i++;
			}
			s2 =ch[i]+s2;   
		}
		System.out.println(s2);
	}

	public static void ReverseSentence() {
		String s1 = "this is String";
		String s2 = "";
		char ch[] = s1.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {

			s2 = s2 + ch[i];
			if (ch[i] == ' ') {
				continue;
			}

		}
		System.out.println(s2);
	}
//converting one string to reverse in sentence
	public static void 
	{
		
	}
	public static void main(String[] args) {
		ReverseSentence();
		revsentence();
	}
}
