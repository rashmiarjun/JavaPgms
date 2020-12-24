package Loops;

public class largestof2num {

	public static void Largestof2() 
	{
		int a = 85;
		int b = 195;
		int max = a;
		if (b > a) {
			max = b;
			System.out.println("maximum number is:" + max);
		}
	}

	public static void Largestof3()
	{
		int a = 80;
		int b = 550;
		int c = 555;
		if (a > b && a > c) {
			System.out.println("the largest num is " + a);
		} else if (b > a && b > c) {
			System.out.println("the largest num is " + b);
		} else {
			System.out.println("the largest num is " + c);
		}

	}

	public static void Largestof3num() {
		int a = 40;
		int b = 60;
		int c = 5;
		System.out.println((a > b) ? (a > c ? a : c) : (b > c ? b : c));
	}

	public static void main(String[] args) {
		Largestof2();//simple if
		Largestof3();//using else if ladder
		Largestof3num();//using ternary operator

	}

}
