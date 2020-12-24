package Loops;

public class Factorial {
	public static void main(String[] args) {
		int num=5;
		int Fact=1;
		while(num>0)
		{
			Fact=num*Fact;
			num--;
		}
		System.out.println("Factorial of 5 is :" +Fact);
	}

}
