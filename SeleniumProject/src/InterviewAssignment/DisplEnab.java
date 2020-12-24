package InterviewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DisplEnab  extends Base
{
public static void main(String[]args)throws InterruptedException
{  //TextBoxes is Displayed or not
	Base.openApp("chrome");
	WebElement UNTB=driver.findElement(By.id("email"));
	System.out.println(UNTB.isDisplayed());
	WebElement PSTB=driver.findElement(By.id("password"));
	System.out.println(PSTB.isDisplayed());
	
	//TextBoxes are Enabled or not
	System.out.println(UNTB.isEnabled());
	System.out.println(PSTB.isEnabled());
	
	Thread.sleep(2000);
	driver.navigate().to("file:///C:/Users/Lenovo/Desktop/HTML/XpathExp.html");
	WebElement UNTB1=driver.findElement(By.id("mss1234"));
	UNTB1.sendKeys("Arav");
	System.out.println(UNTB1.isEnabled());
}
}
