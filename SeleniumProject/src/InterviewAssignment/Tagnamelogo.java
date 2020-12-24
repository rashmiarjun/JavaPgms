package InterviewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tagnamelogo extends Base
{
	public static void main(String[] args) 
	{
		Base.openApp("chrome");
		WebElement logo=driver.findElement(By.className("logo"));
		System.out.println(logo.getTagName());
		
	}

}
