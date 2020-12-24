package InterviewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FontsizeofText  extends Base
{
public static void main(String[] args)
{
	Base.openApp("chrome");
	WebElement Un=driver.findElement(By.id("email"));
	String size=Un.getCssValue("font-size");//should take from CSS window
	System.out.println(size);
	System.out.println(Un.getCssValue("colour"));
	System.out.println(Un.getCssValue("font-family"));
}
}
