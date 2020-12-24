package DemoExample;


import org.openqa.selenium.firefox.FirefoxDriver;
public class Sfirefoxdemo {

	public static void main(String[]args)
	{
		String key="webdriver.gecko.driver";
		String value="./driver/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}

