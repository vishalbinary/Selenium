//Program to click on the Lobrary  on side bar on Youtube
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

public class TC8 extends Base {
	String expectedURL="https://www.youtube.com/feed/library";
	String expectedUser="peeter parker";


	@Test
	public void clickOnLibrary() throws InterruptedException {
		new Login().login();
		driver.findElement(By.xpath(pro.getProperty("icon"))).click();
		String actualUser=driver.findElement(By.xpath(pro.getProperty("userName"))).getText();	
		Assertions.myAssertion(actualUser, expectedUser);
		action.sendKeys(Keys.ESCAPE).perform();
		
		Thread.sleep(3000);// wait after login for 3 secs

		// click on a Library on side bar
		WebElement library = driver.findElement(By.xpath(pro.getProperty("library")));// side bar
																													
		library.click();
		Thread.sleep(3000);
		Assertions.myAssertion(driver.getCurrentUrl(), expectedURL);
		//Screenshot Captured
		try {
			Screenshot.takeScreenShot("../YTFramework/Screenshots/"+this.getClass().getName()+".png");
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		// process to logout
		
		System.out.println("TC8=Clicked on Library on side bar on Youtube");
		Logout.logout();
		LogsCapture.takesLog("My Log is Ready! ", this.getClass().getName());


	}

}
