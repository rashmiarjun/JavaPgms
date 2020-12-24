package Loops;

public class Strongnum {
	 int sum=0;
//153=sum of(fact of each digit)	
	public  void isStrong(int num)
	{ int num1=num;
		int Fact=1;
		while (num>0)
		{
		int	digit=num%10;
		Fact=Fact*digit;
		digit--;
		int sum=sum+Fact;
		System.out.println(sum);
		}
		num/=10;
		
	
	
	if(num==sum)
	{
		System.out.println("it is a strong num");
	}}
	public static void main(String[] args) {
		Strongnum sn=new Strongnum();
				sn.isStrong(153);
	}

}
