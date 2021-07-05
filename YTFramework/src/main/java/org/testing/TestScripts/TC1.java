//Program to click on the Explore->Trending  on side bar on Youtube
package org.testing.TestScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testing.Assertion.Assertions;
import org.testing.base.Base;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

public class TC1 extends Base {
	String expectedURL="https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl";
	String expectedUser="peeter parker";
    @Test
	public void clickOnTrending() throws InterruptedException{
    	
    Login login=new Login();
    login.login();
	
	WebElement icon=driver.findElement(By.xpath(pro.getProperty("icon")));
	icon.click();
	String actualUser=driver.findElement(By.xpath(pro.getProperty("userName"))).getText();	
	action.sendKeys(Keys.ESCAPE).perform();	
	Assertions.myAssertion(actualUser, expectedUser);
		
	//click on Trending link(Explore->Trending)	
		driver.findElement(By.xpath(pro.getProperty("explore"))).click();//side bar		
		driver.findElement(By.xpath(pro.getProperty("trending"))).click();		
		Assertions.myAssertion(driver.getCurrentUrl(), expectedURL);
		System.out.println("TC1=Clicked on Trending(Explore->Trending) on Youtube");
		//Screenshot Captured
		try {
			Screenshot.takeScreenShot("../YTFramework/Screenshots/"+this.getClass().getName()+".png");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
Logout.logout();	
LogsCapture.takesLog("My Log is Ready! ", this.getClass().getName());


	}	
}
