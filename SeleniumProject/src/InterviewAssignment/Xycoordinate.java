package InterviewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xycoordinate extends Base
 {
	public static void main(String[]args)
{
		//X-axis and Y-axis of Username TextBox
		Base.openApp("chrome");
		WebElement UNTB=driver.findElement(By.id("email"));
		int XaxUNTB=UNTB.getLocation().getX();
		System.out.println("username Textbox x-axis is "+XaxUNTB);
		int yaxUNTB=UNTB.getLocation().getY();
		System.out.println("username Textbox y-axis is "+yaxUNTB);
		
		//X-axis and Y-axis of Password TextBox
		WebElement PSTB=driver.findElement(By.id("password"));
		int XaxPSTB=UNTB.getLocation().getX();
		System.out.println("password Textbox x-axis is "+XaxPSTB);
		int YaxPSTB=UNTB.getLocation().getY();
		System.out.println("password Textbox y-axis is "+YaxPSTB);
		System.out.println("==============================================");
		if(XaxUNTB==XaxPSTB)
		{
			System.out.println("Allignment is proper");
		
		}
		else
		{
			System.out.println("Allignment not proper");
		}
		
		
}
 }