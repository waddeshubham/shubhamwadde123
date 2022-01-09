package com.libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilClass {
	
	public static String getTD(int RowNum,int ColNum) throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		
		FileInputStream file = new FileInputStream("D:\\testdata\\shubham.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		String value = sh.getRow(RowNum).getCell(ColNum).getStringCellValue();
		return value;
	}
	
	public static void captureScreenshot(WebDriver driver,int TcNo ) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\Admin\\eclipse-workspace\\Investment_banking\\src\\test\\resources\\screenShot"+TcNo+"image.jpg");
		FileHandler.copy(src, dst);
	}

}
