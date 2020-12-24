package Loops;

public class ConvertingStringToInteger {
	//WAP to convert integer inside String to numeric
	//ASCII code range==> A to Z ==>65 to 90
	//ASCII code range==>'0' to '9'==>48 to 57
	
	public static void StringToInteger()
	{
		String s1="56789";
		char ch=s1.charAt(0);//we will get '5'
		//value of '5' in ASCII is 53 now we have to convert this to numeric
		int num='5'-48;
		
		System.out.println(num);
	}

	public static void main(String[] args) {
		StringToInteger();

	}

}
