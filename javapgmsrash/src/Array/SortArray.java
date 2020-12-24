package Array;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args)
	{
		int a[]= {0,1,0,1,0,1,1,0,1};
		int num=a.length;
		int b[]=new int[num];
		 int zcount = 0;
		  int ocount =num-1;
		  for(int i=0;i<num;i++)
		  {
			  if (a[i] == 0) 
			  {
				    b[zcount]= 0;
				    zcount++;
			   }
			  else
			  {
				
			  b[ocount] = 1;
			  ocount--;
			   }
			  
		  }
   System.out.println(Arrays.toString(b));
}

}
