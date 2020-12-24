package InterviewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

public class Cleardata1 extends Base
{
	public static void main(String[]args)
{
//using clear()
Base.openApp("chrome");
WebElement UNTB=driver.findElement(By.id("email"));
 UNTB.clear();
WebElement PSTB=driver.findElement(By.name("user[password]"));
 PSTB.clear();
 
		
 //without using clear()
Base.openApp("chrome");
WebElement UNTB1=driver.findElement(By.id("email"));
UNTB1.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
UNTB1.sendKeys("Rashmiarjunagi");
WebElement PSTB1=driver.findElement(By.name("user[password]"));
PSTB1.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
PSTB1.sendKeys("SoulinTravel");

//copy the value from one text box to another text box
Base.openApp("chrome");
WebElement UNTB2=driver.findElement(By.id("email"));
UNTB2.sendKeys(Keys.CONTROL+"a",Keys.ENTER);
UNTB2.sendKeys("Rakshit");
UNTB2.sendKeys(Keys.CONTROL+"ac");
WebElement PSTB2=driver.findElement(By.name("user[password]"));
PSTB2.clear();
PSTB2.sendKeys(Keys.CONTROL+"v");

//copy the value from one text box to another text box without using Shortcut
Base.openApp("chrome");
WebElement UNTB3=driver.findElement(By.id("email"));
UNTB3.clear();
UNTB3.sendKeys("SHAR");
String s=UNTB3.getAttribute("value");
WebElement PSTB3=driver.findElement(By.id("password"));
PSTB3.clear();
PSTB3.sendKeys(s);


}
}