package com.model1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.libraries.BaseClass;
import com.libraries.UtilClass;
import com.page.HomePage;
import com.page.LoginPage1;
import com.page.LoginPage2;

public class KiteLoginTC01 extends BaseClass {

	LoginPage1 log;
	LoginPage2 log2;
	HomePage hpage;
	int TCID;

	@Test
	public void verifyusername() throws EncryptedDocumentException, InvalidFormatException, IOException {

		TCID = 100;
		String expectedresult = UtilClass.getTD(0, 3);
		String actualresult = "abcd";// hpage.Getid();
		Assert.assertEquals(expectedresult, actualresult);

	}

	@BeforeClass
	public void inilizebrowser() {
		Browser();
		log = new LoginPage1(driver);
		log2 = new LoginPage2(driver);
		hpage = new HomePage(driver);
	}

	@BeforeMethod
	public void loginkite()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		log.SetuserNameKiteLogin(UtilClass.getTD(0, 0));
		log.SetPasswordLogin(UtilClass.getTD(0, 1));
		Thread.sleep(500);
		log.ClickLogin();
		Thread.sleep(200);
		log2.SetpinLogin(UtilClass.getTD(0, 2));
		log2.ClickLogin();
	}

	@AfterMethod
	public void logout(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			UtilClass.captureScreenshot(driver, TCID);
		}

		// hpage.lout();

	}

	@AfterClass
	public void closebrowser() {
		log = null;
		log2 = null;
		hpage = null;
	}

}
