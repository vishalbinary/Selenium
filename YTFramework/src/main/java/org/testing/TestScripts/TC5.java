//Program to Subscribe the channel on Youtube
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

public class TC5 extends Base{
	String expectedURL="https://www.youtube.com/watch?v=LT1-bB9kGGA";
	String expectedUser="peeter parker";

	
	@Test
	public void clickOnChannelSubs() throws InterruptedException {
		new Login().login();
		driver.findElement(By.xpath(pro.getProperty("icon"))).click();
		String actualUser=driver.findElement(By.xpath(pro.getProperty("userName"))).getText();	
		Assertions.myAssertion(actualUser, expectedUser);
		action.sendKeys(Keys.ESCAPE).perform();
	
	//click on a video
	PlayVideo.play();

	
	//click on a Channel subscribe button
	WebElement subscribeChannel=driver.findElement(By.xpath(pro.getProperty("subscribeChannel")));//side bar
	subscribeChannel.click();
	Assertions.myAssertion(driver.getCurrentUrl(), expectedURL);
	//Screenshot Captured
		try {
			Screenshot.takeScreenShot("../YTFramework/Screenshots/"+this.getClass().getName()+".png");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	

	
	//process to logout

	System.out.println("TC5=Subscribed the channel on Youtube");
	Logout.logout();
	LogsCapture.takesLog("My Log is Ready! ", this.getClass().getName());

			
	}

}
