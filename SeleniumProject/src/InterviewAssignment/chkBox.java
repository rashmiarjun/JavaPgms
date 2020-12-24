package InterviewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chkBox
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[]args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.opensourcebilling.org/");
	WebElement KS=driver.findElement(By.xpath("//lable[text()='Keep me signed in']"));
	KS.click();
	WebElement CkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	if(CkBox.isSelected())
	{
		System.out.println("check box is selected");
	}
	else
	{
		System.out.println("checkbox is not selected");
	}
		
}
	
}
