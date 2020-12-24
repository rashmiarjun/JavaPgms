package pattern;

public class practice {
	public static void triangle4()
	{
		for(int i=4;i>=0;i--)
		{
			for(int j=4;j>=i;j--)
			{
				if(j<=i)
				{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
}
public static void main(String[] args) {
	triangle4();
}}