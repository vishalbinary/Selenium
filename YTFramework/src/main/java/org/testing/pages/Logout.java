package org.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testing.base.Base;

public class Logout extends Base{
	public static void logout() throws InterruptedException {
		WebElement icon=driver.findElement(By.xpath(pro.getProperty("icon")));			
		//icon.click();
		
		//WebElement signOut=driver.findElement(By.xpath(pro.getProperty("signOut")));
		
		if(driver.findElement(By.xpath(pro.getProperty("signOut"))).isDisplayed()) {
			driver.findElement(By.xpath(pro.getProperty("signOut"))).click();	
		}
		else {			
			icon.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(pro.getProperty("signOut"))).click();
			Thread.sleep(2000);
		
		}
		System.out.println("Log out succesfully!");
	}
	
	

}
