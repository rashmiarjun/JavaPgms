package pattern;

public class pat1 {
	/*
	 * * 
	 * * * 
	 * * * * 
	 * * * * *
	 */
	public static void triangle() {
		int n = 4;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (row >= col)
					System.out.print("* ");

				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
	/*
	  * 
	  * * 
	  * * * 
	  * * * *
	 */
public static void triangle1()
{
	for(int i=1;i<=4;i++)
	{ for(int j=1;j<=i;j++)
	{ System.out.print("* "); 
	}
	  System.out.println();
	  } 
	}
/*    
      * * * * 
       * * * 
        * * 
         * 
 
 */
	public static void triangle2()
	{
		int n = 4;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (row <= col)
					System.out.print("* ");

				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
			
	public static void triangle3()
	{
		int n = 5;
		for (int row = 0; row < n; row++) {
			for (int col = 0; (row+col)<= n-1; col++) {
				if (row <= col)
					System.out.print("* ");

				}
			System.out.println();
		}
	}	
/*
    * * * * 
    * * * 
    * * 
    * 
*/
public static void triangle4()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>i;j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}

}
/*  
     * * * * 
     * * * * 
     * * * * 
     * * * * 
 */
public static void square1()
{
	for(int i=1;i<5;i++)
	{
		for(int j=1;j<5;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
/*
 * * * * 
 *     * 
 *     * 
    * * * * 
 
 */
public static void square2()
{
	for(int i=1;i<5;i++)
	{
		for(int j=1;j<5;j++)
		{
			if(i>=2&&j>=2&&i<=3&&j<=3)
			{
				System.out.print("  ");
			}
			else
			{
				System.out.print("* ");
			}
		}
		System.out.println();
	}
}
	
	public static void main(String[] args) {

		triangle();
		System.out.println();
		triangle1();
		System.out.println();
		triangle2();
		System.out.println();
		triangle3();
		System.out.println();
		triangle4();
		System.out.println();
		square1();
		System.out.println();
		square2();
	}
}
