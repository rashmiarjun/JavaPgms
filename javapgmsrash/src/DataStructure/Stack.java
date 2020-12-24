package DataStructure;

public class Stack {
	private int []ar;
	private int top;
	private int capacity=0;
	private int count=0;
	
	public boolean isFull()
	{
		return count==capacity;
	}
	public void push(int ele)
	{
		if(isFull())
		{
			System.out.println("Stack over full error");
		}
		else {
			ar[count]=ele;
			count++;
			top++;
		}
		
	}
	public int pop() {
		if(isEmpty)
		{
			System.out.println("Stack s empty");
		}
		else
		{
			count--;
			return ar[top--];
		}
		
		
		
	}

}
public class Stack1{
	public static void main(String[] args) {
		
	}
}