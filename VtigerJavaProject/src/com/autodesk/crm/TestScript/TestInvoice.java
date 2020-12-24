package com.autodesk.crm.testScripts;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.autodesk.crm.POM.InvoicePage;
import com.autodesk.crm.POM.LoginPage;
import com.autodesk.crm.POM.ProductsPage;
import com.autodesk.crm.POM.PurchaseOrderPage;
import com.autodesk.crm.genericlib.FileLib;
import com.autodesk.crm.genericlib.WebDriverUtils;

public class TestInvoice {
	@Test
	public void searchInvoiceStatus() throws IOException, InterruptedException {

		FileLib fl = new FileLib();
		WebDriverUtils wdu = new WebDriverUtils();

		WebDriver driver = new ChromeDriver();
		wdu.implicitlywaitForElement(driver);
		wdu.maximizeWindow(driver);
		driver.get(fl.getPropertyKeyValue("URL"));
		String pw = driver.getWindowHandle();
		wdu.verification(driver, fl.getExcelData("opp", 1, 0), "Login Page");

		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(fl.getPropertyKeyValue("username"), fl.getPropertyKeyValue("password"));

		ProductsPage pp = new ProductsPage(driver);
		pp.getProductLink().click();
		pp.getCreateProductButton().click();
		pp.getProductTextField().sendKeys(fl.getExcelData("products", 1, 0));
		pp.getClicksavebutton().click();

		InvoicePage ip = new InvoicePage(driver);
		wdu.elementDisplayedValidation(ip.getMorelink(), "More module");
		ip.getMorelink().click();
		wdu.elementDisplayedValidation(ip.getInvoicelink(), "Invoice module");
		ip.getInvoicelink().click();
		ip.getLastViewedLink().click();
		driver.findElement(By.linkText("laptops")).click();
		pp.getCreatePurchaseOrderLink().click();

		PurchaseOrderPage pop = new PurchaseOrderPage(driver);
		pop.getSubjectTextField().sendKeys(fl.getExcelData("purchaseorder", 1, 0));
		pop.getVendorNameTextField().click();
		Set<String> whs = driver.getWindowHandles();
		for (String w : whs) {
			if (pw.equals(w)) {
				System.out.println(w);
			} else {
				driver.switchTo().window(w);
				driver.findElement(By.id("3")).click();
			}
		}
		driver.switchTo().window(pw);
		pop.getBillingTextField().sendKeys(fl.getExcelData("purchaseorder", 1, 1));
		pop.getCopyBillingAddressRadioBtn().click();
		WebElement element = driver.findElement(By.xpath("//b[.='Item Name']"));
		wdu.scrollupAndDown(driver, element);
		pop.getClicksavebutton().click();
		pop.getAdminsignout().click();
		pop.getSignoutlink().click();
		driver.close();
	}
	
	
}