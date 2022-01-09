package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	//declaire with access private
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;

	
	//initializing with access level public
	
public	LoginPage2(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	// utilize with access level public
	
	public void SetpinLogin(String log) {
		pin.sendKeys(log);
	}
	
	public void ClickLogin() {
		loginbutton.click();
	}
}
