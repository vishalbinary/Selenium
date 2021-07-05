//Program to click on the Subscription on side bar on Youtube
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

public class TC3 extends Base {
	String expectedURL="https://www.youtube.com/feed/subscriptions";
	String expectedUser="peeter parker";

	@Test
	public void clickOnSubscribe() throws InterruptedException {
new Login().login();
driver.findElement(By.xpath(pro.getProperty("icon"))).click();
String actualUser=driver.findElement(By.xpath(pro.getProperty("userName"))).getText();	
Assertions.myAssertion(actualUser, expectedUser);
action.sendKeys(Keys.ESCAPE).perform();

		// click on a Subscription on side bar
		WebElement subscribe = driver
				.findElement(By.xpath(pro.getProperty("subscribe")));// side bar
		subscribe.click();
		Thread.sleep(3000);
		Assertions.myAssertion(driver.getCurrentUrl(), expectedURL);
		//Screenshot Captured
			try {
				Screenshot.takeScreenShot("../YTFramework/Screenshots/"+this.getClass().getName()+".png");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		

		
		System.out.println("TC3=Clicked on Subscription on side bar on Youtube");
		Logout.logout();
		LogsCapture.takesLog("My Log is Ready! ", this.getClass().getName());


	}


}
