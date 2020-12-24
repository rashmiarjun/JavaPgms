package ActionClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooksWagon {
	static
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver81.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.bookswagon.com");//hitting the bookswagon web address
		WebElement srcbox = driver.findElement(By.id("ctl00_TopSearch1_txtSearch"));//finding searchbox
		srcbox.sendKeys("Ravindranath Tagore");//entering the data into searchbox
		driver.findElement(By.id("ctl00_TopSearch1_Button1")).click();//hitting search
		driver.findElement(By.linkText("Ravindranath Tagore Ki Lokpriya Kahaniyan")).click();//selecting one book for listby clicking on it
		String pw= driver.getWindowHandle();//finding pw id
		System.out.println(pw);
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();//clicking on buy element
		Set<String> windows = driver.getWindowHandles();//finding all the windows that are present
		int count=windows.size();//stroring the window in variable
		System.out.println(count);
		for( String cw:windows)//printing num of windows present
		{
			driver.switchTo().window(cw);//switching the cw 
			driver.findElement(By.id("BookCart_lvCart_imgPayment")).click();//clicking on place order after this it will ask for login details
		}
		driver.get("https://www.bookswagon.com/login");
		driver.findElement(By.id("ctl00_phBody_SignIn_txtEmail")).sendKeys("savitrinucchi@gmail.com");
		driver.findElement(By.id("ctl00_phBody_SignIn_txtPassword")).sendKeys("12345");
		driver.findElement(By.id("ctl00_phBody_SignIn_btnLogin")).click();
		
		
		
		
		
	}

}
