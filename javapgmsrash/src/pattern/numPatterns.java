package pattern;

public class numPatterns {
	public static void pat1() {
		int n = 4;
		int i = 1;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {

				System.out.print(i++ + " ");

			}
			System.out.println();
		}

	}

	public static void pat2() {
		int n = 4;
		int count = 'A';
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {

				System.out.print((char) count++ + " ");

			}
			System.out.println();
		}

	}

	public static void pat3() {
		int n = 4;
		int count1 = 'A';
		int count2 = 'a';
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {

				System.out.print((char) count1++ + (char) count2++ + " ");

			}
			System.out.println();
		}

	}

	public static void pat4() {
		int n = 4;
		int count = 1;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(count-- + "  ");
			}
			count = count + (2 * row) + 3;
			System.out.println();
		}
	}

	public static void pat5() {
		int n = 4;
		int count = 1;
		for (int row = 0; row < n; row++) {
			count = row + 1;
			for (int col = 0; col <= row; col++) {
				System.out.print(count + " ");
				count = count + (n - 1) - col;
			}
			System.out.println();
		}
	}

	public static void pat6() {
		int n = 4;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				if ((row + col) % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

	public static void pat7() {
		String s1[] = { "one", "two", "three", "four", "five", "six", "seven", "eigth", "nine", "ten" };
		int n = 4;
		int a = 0;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(s1[a++] + " ");
			}
			System.out.println();
		}

	}

	public static void pat8() {
		int n = 4;
		int count = 1;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(count * 3 + " ");
				count++;
			}
			System.out.println();
		}
	}

	public static void pat9() {
		int n = 4;
		int a = 0;
		int count = 3;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				if (a % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print(count + " ");
					count = count + 6;
				}
				a++;

			}
			System.out.println();
		}
	}

	public static void pat10() {
		int n = 5;
		int count1 = 1;
		int count2 = 1;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				if (row % 2 == 0) {
					System.out.print(count1++ + " ");
					count2--;
				} 
				else 
				{
					System.out.print(count2-- + " ");
					count1++;
				}
				
			}
			count2 = count2 = (2 * row) + 3;
			System.out.println();
		}
	}
public static void pat11()
{
int n = 4;
int charcount= 'A';
int numcount = 1;
for (int row = 0; row < n; row++)
{
	for (int col = 0; col <= row; col++)
	{
		System.out.print((char)charcount++ +""+ numcount++ +" ");
	
    }
	System.out.println();
}
}

	public static void main(String[] args) {
		pat1();
		System.out.println();
		pat2();
		System.out.println();
		pat3();
		System.out.println();
		pat4();
		System.out.println();
		pat5();
		System.out.println();
		pat6();
		System.out.println();
		pat7();
		System.out.println();
		pat8();
		System.out.println();
		pat9();
		System.out.println();
		pat10();
		System.out.println();
		pat11();
	}
}
