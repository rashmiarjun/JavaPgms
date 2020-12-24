package Loops;

public class IsBinary {
	public static boolean isBinary(int num)
	{
		while(num>0)
		{
			int rem=num%10;
			if(rem>1)
			{
				return false;
			}
			num=num/10;
			
		}
		
		return true;
		
	}
public static void main(String[] args) {
	isBinary(1231);
}

}
