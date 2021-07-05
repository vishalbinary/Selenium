//Program to click on Watch Later on youtube
package org.testing.TestScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testing.Assertion.Assertions;
import org.testing.base.Base;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.pages.PlayVideo;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

//div[3]/div/ytd-menu-renderer/div[2]/*/*/yt-formatted-string[contains(text(),'Save')]
public class TC7 extends Base {
	String expectedURL="https://www.youtube.com/watch?v=LT1-bB9kGGA";
	String expectedUser="peeter parker";
	
	@Test
	public void watchLater() throws InterruptedException {
		
		new Login().login();
		driver.findElement(By.xpath(pro.getProperty("icon"))).click();
		String actualUser=driver.findElement(By.xpath(pro.getProperty("userName"))).getText();	
		Assertions.myAssertion(actualUser, expectedUser);
		action.sendKeys(Keys.ESCAPE).perform();
	
	//click on a video
	PlayVideo.play();
	Thread.sleep(3000);
	
	//Watch Later a video(Save video on watch later)
	driver.findElement(By.xpath(pro.getProperty("Save+"))).click();
	driver.findElement(By.xpath(pro.getProperty("watchLater"))).click();
	action.sendKeys(Keys.ESCAPE).perform();
	Thread.sleep(3000);
	Assertions.myAssertion(driver.getCurrentUrl(), expectedURL);
	//Screenshot Captured
	try {
		Screenshot.takeScreenShot("../YTFramework/Screenshots/"+this.getClass().getName()+".png");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	//process to logout

	System.out.println("TC7=Click on Watch Later the video on Youtube");
	Logout.logout();
	LogsCapture.takesLog("My Log is Ready! ", this.getClass().getName());

		
	}
	

}
