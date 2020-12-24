package Array;

//WAP to determine the biggest consecutive sum of array
public class BiggestConsecutivesum {
	public static void main(String[] args) {
		int arr[] = { 12, 4, 25, 3, 2 };
		int bigsum = arr[0] + arr[1];
		int index = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			if (bigsum < (arr[i] + arr[i + 1])) {
				bigsum = arr[i] + arr[i + 1];
				index=i;
			}
		}
		System.out.println("consecutive of max Elemenetn sum is" + bigsum);

	}
}
//tracing 
//bigsum=16;index=0;
//i=1==>1<4==>if(16<(4+25))==>16<29==>true==>bigsum=(4+25)=29;index=1;
//i=2==>2<4==>if(29<(25+3))==>29<28==>false==bigsum=29;index=2;