package InterviewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HWofTB extends Base
{
public static void main(String[]args)
{//height and width of the username Textbox
	Base.openApp("chrome");
	WebElement UNTB=driver.findElement(By.id("email"));
	int HUNTB=UNTB.getSize().getHeight();//height
	System.out.println("Height of the Username Textbox is "+" "+HUNTB);
	int WUNTB=UNTB.getSize().getWidth();//width
	System.out.println("Width of the Username Textbox is "+" "+WUNTB);
	
	WebElement PSTB=driver.findElement(By.id("password"));
	int HPSTB=UNTB.getSize().getHeight();//height
	System.out.println("Height of the Password Textbox is "+" "+HPSTB);
	int WPSTB=UNTB.getSize().getWidth();//width
	System.out.println("Width of the Password Textbox is "+" "+WPSTB);
	

}
}
