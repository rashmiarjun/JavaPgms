package InterviewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RetriveData extends Base
{
	
	public static void main(String[]args)
	{
		Base.openApp("chrome");
		WebElement UNTB=driver.findElement(By.id("email"));
		String S=UNTB.getAttribute("value");
		System.out.println(S);
		UNTB.clear();
		UNTB.sendKeys("RashmiArjun");
		String R=UNTB.getAttribute("value");
		System.out.println(R);
		
	}

}
