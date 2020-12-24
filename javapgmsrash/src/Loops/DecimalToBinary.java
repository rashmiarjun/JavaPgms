package Loops;

public class DecimalToBinary {

	public static void DecimalToBinary1(int a, int b) {
		int num = a;
		String out = " ";
		while (num > 0) {
			int rem = num % b;
			out = rem + out;
			num = num / b;
		}
		System.out.println(out);
	}

	public static void DecimalToHexa(int a, int b) {
		int num = a;
		String out = " ";
		String s1 = "0123456789ABCDEF";
		while (num > 0) {
			int rem = num % 16;
			out = s1.charAt(rem) + out;
			num = num / 16;
		}
		System.out.println(out);
	}

	public static void DeciToHexa(int a, int b) {
		int num = a;
		String out = " ";
		while (num > 0) {
			int rem = num % 16;
			if (rem >= 10) {
				rem = (char) rem;
			}
			out = rem + out;
			num /= 16;
		}

		System.out.println(out);
	}

	public static void main(String[] args) {
		DecimalToBinary1(25, 2);// decimal to binary
		DecimalToBinary1(25, 8);// decimal to octal we are using same method
		DecimalToHexa(182, 16);// decimal to hexa
		DeciToHexa(182, 16);

	}
}
