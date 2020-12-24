package HandlingMultipleElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import com.sun.glass.events.KeyEvent;

public class Robotclass {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException 
	{
		Runtime.getRuntime().exec("Notepad");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_H);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_I);
		
		for (int i = 1; i<=400; i=i+5) 
		{
			rb.mouseMove(400,500);
		}
		
	}

}
