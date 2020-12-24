package Strings;

/*
 * counting how many words are available in Strings
 */
public class wordscountsinString {
//count the words when have a multiple words with multiple spaces
public static void countWords()
{
	 
}
	public static void main(String[] args)
	{
//count the words when there is only one space
		
		String str1 = "Enjoy your day all the time";
		System.out.println(str1.length());
		int count = 1;
		char ch[] = str1.toCharArray();
		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				count++;
				continue;
			}

		}
		System.out.println(count);
	}
}
