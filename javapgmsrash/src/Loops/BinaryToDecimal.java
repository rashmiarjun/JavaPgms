package Loops;

public class BinaryToDecimal {
	//finding the power of a num
	public static int power(int num, int pwr) {
		int out = 1;
		for (int i = 1; i <= pwr; i++) {
			out = out * num;
		}
		return out;
		
	}

	public static void BinaryToDecimal(int num) {
		int count = 0;
		int out = 0;
		while (num > 0) {
			int digit = num % 10;
			out = out + (digit * (power(2, count++)));// 1st iteration==>0+1*(2,0)==>out=1
			num = num / 10;
		}
		System.out.println(out);
	}

	public static void octalToDecimal(int num) {
		int count = 0;
		int out = 0;
		while (num > 0) {
			int digit = num % 10;
			out = out + (digit * (power(8, count++)));// 1st iteration==>0+1*(8,0)==>out=1
			num = num / 10;
		}
		System.out.println(out);
	}

	public static void HexaToDecimal(int num) {
		int count = 0;
		int out = 0;
		while (num > 0) {
			int digit = num % 10;
			out = out + (digit * (power(16, count++)));// 1st iteration==>0+1*(16,0)==>out=1
			num = num / 10;
		}
		System.out.println(out);

	}

	public static void main(String[] args) {
		BinaryToDecimal(110101);
		octalToDecimal(65);
		HexaToDecimal(166);
		power(4, 2);
	}
}
