package com.libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected WebDriver driver;
	
	public void Browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		
		
	}

}
