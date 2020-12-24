package InterviewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Textoflink extends Base
{
	public static void main(String[] args)
	{//Text of the weblink
		Base.openApp("chrome");
		WebElement Wlink=driver.findElement(By.xpath("//a[@target='_blank'][1]"));
		String Textlink=Wlink.getText();
		System.out.println(Textlink);
		WebElement Wlink1=driver.findElement(By.xpath("//a[@target='_blank'][2]"));
		String Textlink1=Wlink1.getText();
		System.out.println(Textlink1);
		
	}

}
