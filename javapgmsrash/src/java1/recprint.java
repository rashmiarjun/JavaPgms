package java1;

public class recprint {
	

	public static void printn(int num)
	{
		
	System.out.println(num);
	
	if(num<10)
	{
		num++;
	   printn(num);
	}
	}
	public static void main(String[]args)
	{
		
	printn(1);

	}
}
