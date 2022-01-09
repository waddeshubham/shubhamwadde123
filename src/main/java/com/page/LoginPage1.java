package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	//declaire webelement with access level private
	@FindBy(xpath="//input[@id='userid']") private WebElement username;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	

	//initializing with access level public
	
public	LoginPage1(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//utilize with access level public
	
	public void SetuserNameKiteLogin(String uname) {
		username.sendKeys(uname);
	}
	
	public void SetPasswordLogin(String pass) {
		password.sendKeys(pass);
		
	}
	
	public void ClickLogin() {
		login.click();
	}
	
}
