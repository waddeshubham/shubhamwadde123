package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaire
	@FindBy(xpath="//span[@class='user-id']")private WebElement id;
	@FindBy(xpath="//span[@class='icon icon-exit']") private WebElement LogOut;
	
	//initializ
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String Getid() {
		String value = id.getText();
		return value;
	}
	
	public void lout() {
		id.click();
		LogOut.click();
	}
}
