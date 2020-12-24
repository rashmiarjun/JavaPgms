package Strings;

public class DuplicateOccurance {
	public static void main(String[] args) {
		String str1 = "rashraa";
		char ch[] = str1.toCharArray();
		int count = 1;
		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) 
			{
				if (ch[i] == ch[j]) {
					count++;
					//System.out.println(ch[i]);
				}
				
			}
		}
	 System.out.println(count);

	}
}
