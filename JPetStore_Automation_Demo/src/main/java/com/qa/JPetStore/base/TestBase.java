package com.qa.JPetStore.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.JPetStore.utility.TestUtil;
public class TestBase {
	public  Properties pro;
	public static  WebDriver driver;
	public static  TestUtil testUtil;
	
	public TestBase() {
		try {
			File file=new File("../JPetStore_Automation_Demo/src/main/java/com/qa/JPetStore/config/configuration.property");
			FileInputStream fis=new FileInputStream(file);
			pro=new Properties();			
				pro.load(fis);
		}
			catch (Exception e) {e.printStackTrace();}
	
	}
		
	
	public void initialize()  {
		System.setProperty("webdriver.gecko.driver", pro.getProperty("driverPath"));
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	public void closeDriver() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}
