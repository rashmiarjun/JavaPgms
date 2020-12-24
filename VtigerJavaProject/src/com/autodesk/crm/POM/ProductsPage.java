package com.autodesk.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	@FindBy(linkText="Products")
	private WebElement productLink;
	
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement createProductButton;
	
	@FindBy(name="productname")
	private WebElement productTextField;
	
	@FindBy(linkText="Create Purchase Order")
	private WebElement createPurchaseOrderLink;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement clicksavebutton;
	
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductLink() {
		return productLink;
	}

	public WebElement getCreateProductButton() {
		return createProductButton;
	}

	public WebElement getProductTextField() {
		return productTextField;
	}

	public WebElement getClicksavebutton() {
		return clicksavebutton;
	}

	public WebElement getCreatePurchaseOrderLink() {
		return createPurchaseOrderLink;
	}
	
}
