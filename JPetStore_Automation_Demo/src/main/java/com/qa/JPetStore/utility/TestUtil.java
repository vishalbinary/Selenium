package com.qa.JPetStore.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.JPetStore.base.TestBase;


public class TestUtil extends TestBase{
	public static long PAGE_LOAD_TIME=20;
	public static long IMPLICIT_WAIT=20;
	
	//Dropdown for select by visible text
	public static void dropdownByVisibleText(WebElement element, String value) {
		Select select=new Select(element);
		select.deselectByVisibleText(value);

	}
	//Dropdown for select by value
	public static void dropdownByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByValue(value);
		
	}
	//this method is used to captured screen shots
	public static void screenShot() {
		TakesScreenshot shot=(TakesScreenshot)driver;
		File srcFile=shot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("D:\\2021\\screenshots\\" +driver.getTitle()+ ".jpg"));
			System.out.println("[-,-][-,-][-,-][-,-]Screenshot is captured[-,-][-,-][-,-][-,-]");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}