package Array;

public class reversegivenArray {
	public static void reverseArray() {
		int a[] = { 12, 21, 13, 42, 15 };
		int b[] = new int[5];
		System.out.print("{");
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = 0; j < b.length; j++) {

				b[i] = a[i];
			}

			System.out.print(b[i] + ",");
		}
		System.out.println("}");
	}

//reverse without taking extra Array
	public static void revArray() {

		int a[] = { 12, 21, 13, 42, 15 };
		int j = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
			System.out.println(temp);
		}
	}
//Tracing 
//j=4;i=0;0<5;
// int temp=a[0]=12==>a;
//
	public static void main(String[] args) {
		reverseArray();
		revArray();

	}
}
