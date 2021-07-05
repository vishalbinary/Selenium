package com.qa.PracticeCode;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SwitchWindows {
	
	
	WebDriver driver;

	@Test
	public void practice() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		option.addArguments("disable-Learn-more");
		
		//option.addArguments("--disable-notifications");		
		//driver=new FirefoxDriver(option);
		driver=new ChromeDriver(option);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");	
		Actions action=new Actions(driver);
		
			
	String url1=driver.getWindowHandle();
	Set<String> urlSet=driver.getWindowHandles();
	//System.out.println(url1);
	int count=0;
	for(String st:urlSet) {
		count++;
		System.out.println(count +": "+st);
	}
	}
}
