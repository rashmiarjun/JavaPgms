package Poisss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTimeExample {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static String readXlData(String path,String sheet,int row,int cell) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/input.xlsx"));
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		
		return data;
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://192.168.56.1:82/login.do");
		String un = readXlData("./testData/input.xlsx","ValidLogin",1,0);
		String pw = readXlData("./testData/input.xlsx","ValidLogin",1,1);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		
		
	}

}
