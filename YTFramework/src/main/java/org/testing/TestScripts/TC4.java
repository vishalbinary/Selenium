// Program to Like a video on Youtube
package org.testing.TestScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testing.Assertion.Assertions;
import org.testing.base.Base;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.pages.PlayVideo;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

public class TC4 extends Base{
	String expectedURL="https://www.youtube.com/watch?v=LT1-bB9kGGA";
	String expectedUser="peeter parker";
	
	@Test
	public void clickOnLike() throws InterruptedException {
		new Login().login();
		driver.findElement(By.xpath(pro.getProperty("icon"))).click();
		String actualUser=driver.findElement(By.xpath(pro.getProperty("userName"))).getText();	
		Assertions.myAssertion(actualUser, expectedUser);
		action.sendKeys(Keys.ESCAPE).perform();
				
	PlayVideo.play();
	Thread.sleep(3000);
	
	
	//click on Like button on youtube
	WebElement likeVideo=
			driver.findElement(By.xpath(pro.getProperty("likeVideo").trim()));//side bar
	likeVideo.click();
	Thread.sleep(3000);
	Assertions.myAssertion(driver.getCurrentUrl(), expectedURL);
	//Screenshot Captured
		try {
			Screenshot.takeScreenShot("../YTFramework/Screenshots/"+this.getClass().getName()+".png");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	

	System.out.println("TC4=Clicked on a Like button on Youtube");		
	Logout.logout();
	LogsCapture.takesLog("My Log is Ready! ", this.getClass().getName());
	}
}
