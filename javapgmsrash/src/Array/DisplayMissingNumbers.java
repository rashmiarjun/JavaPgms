package Array;

public class DisplayMissingNumbers {
	static int num;

	public static void main(String[] args) {

		int b[] = { 14, 18, 23, 25, 30 };

		for (int i = 0; i < b.length - 1; i++) {
			for (int j = b[i] + 1; j < b[i + 1]; j++) {
				System.out.println("missing numbers are " + j);

			}
		}

	}

}
//Tracing 
//i==0==>0<4==>true==>
//j=b[0]+1=14+1=15;==>15<18==print 15