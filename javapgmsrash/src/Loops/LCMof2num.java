package Loops;

public class LCMof2num {
	
	public static void main(String[] args) {
		int a = 15;
		int b = 45;
		int max =15;
		if(b>a)
		{
			max=b;
		}
		int temp=max;
		while (true) {
			if (max % a == 0 && max % b == 0) {
				System.out.println(max);
				break;
			}
			max=max+temp;
		}
	}

}
//Tracing
/**max=15 temp=15
 * while(true)==>if(15%15==0&&15%45==0)==>False
 * max=max+temp=15+15=30
 * while(true)==>if(30%15==0&&30%45==0)==>False
 * max=max+temp=30+15=45
 * while(true)==>if(45%15==0&&45%45==0)==>true
 * break;
 * 
 */