package java1;

/*public class occurance {
	public static void main(String[] args) {
		String s1="hihello";
		int count=1;
		char ch[]=s1.toCharArray();
		System.out.println(ch);
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=' ';
				}
				
			}
			
		}
		System.out.println(count);
	}

}*/

//print the duplicate characters
public class occurance {
	public static void main(String[] args) {
		String s1="RashmiTejas";
		int count=1;
		char ch[]=s1.toCharArray();
		System.out.println(ch);
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				
			if(ch[i]==ch[j])
				{  //count++;
					
					System.out.println(ch[i]);
					//System.out.println(count);
				}
				
			}
			
		}
		
	}

}

