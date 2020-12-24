package Array;

public class EachDuplicatecount {
	public static void main(String[] args) {
		
	
	 int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
      
     int [] fr = new int [arr.length]; 
     
     int count;
     for(int i=0;i<arr.length;i++)
     { 
    	 count=1;
     for(int j=i+1;j<arr.length;j++)
     {
    	 
    	 if(arr[i]==arr[j])
    	 {
    		 if(arr[j]!=0)
    		 {
    			 count++;
    	    		// System.out.println("duplicate num "+ arr[i]);
    	    		 arr[j]=0;
    	    		
    		 }
    		 
    	 }
     }
     System.out.println(arr[i] +" is duplicated "+ count +" times");
	 
    }
   
     

}
}