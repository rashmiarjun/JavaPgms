package Strings;

public class SubStringOrNot {
//input===>this is String
//input===>tri
//output==>its a substring of a given String
	public static boolean isPresent(String s1,String s2)
	{
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
	public static void main(String[] args) {
		String s1="this is String";
		String s2="tri";
		boolean res=isPresent(s1,s2);
		
		if(res)
		
			System.out.println("it is a substring");
		else
			System.out.println("its not a substring") ;
	}

}
