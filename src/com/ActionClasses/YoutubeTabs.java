package com.ActionClasses;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class YoutubeTabs  {
	 public Actions action;
	 public WebDriver driver;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "../March2021(Selenium)/chromedriver.exe");
		 driver=new ChromeDriver();
	
		driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");	
		
	    
	}
	
	@SuppressWarnings("unused")
	@Test
	public void tabsHandle() {
		WebElement video=driver.findElement(By.id("video-title"));	
		action=new Actions(driver);	
		action.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
	  String currentWindow=  driver.getWindowHandle();
       Set<String> window=driver.getWindowHandles();
       int tab=0;
       for(String set:window) {
    	   
    	   System.out.println(set);
    	   if(tab==1) {
    		   currentWindow=driver.getWindowHandle();
    		   break;   		   
    	   }
    	   tab++;
   
       }
action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.TAB).keyUp(Keys.CONTROL).build().perform();
	}

	public void teatDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
}
