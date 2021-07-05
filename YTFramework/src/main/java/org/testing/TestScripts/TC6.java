//Program to comment on a video on Youtube
package org.testing.TestScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testing.Assertion.Assertions;
import org.testing.base.Base;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.pages.PlayVideo;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

public class TC6 extends Base{
	String expectedURL="https://www.youtube.com/watch?v=LT1-bB9kGGA";
	String expectedUser="peeter parker";

	@Test
	public void commentVideo() throws InterruptedException {
		new Login().login();
		driver.findElement(By.xpath(pro.getProperty("icon"))).click();
		String actualUser=driver.findElement(By.xpath(pro.getProperty("userName"))).getText();	
		Assertions.myAssertion(actualUser, expectedUser);
		action.sendKeys(Keys.ESCAPE).perform();
	
		// click on a video
	PlayVideo.play();

		// Comment on a video
	Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement comment = driver
				.findElement(By.xpath(pro.getProperty("comment")));
		wait.until(ExpectedConditions.visibilityOf(comment));
		comment.click();

		WebElement commentVideo = driver.findElement(By.cssSelector(pro.getProperty("commentVideo")));
		wait.until(ExpectedConditions.visibilityOf(commentVideo));
		commentVideo.sendKeys("This movie is good");

		WebElement submitComment = driver.findElement(
				By.xpath(pro.getProperty("submitComment")));
		submitComment.click();
		Thread.sleep(2000);
		Assertions.myAssertion(driver.getCurrentUrl(), expectedURL);
		//Screenshot Captured
			try {
				Screenshot.takeScreenShot("../YTFramework/Screenshots/"+this.getClass().getName()+".png");
			} catch (IOException e) {
				
				e.printStackTrace();
			}


		System.out.println("TC6=Commented the video on Youtube");
		Logout.logout();
		LogsCapture.takesLog("My Log is Ready! ", this.getClass().getName());


	}
}
