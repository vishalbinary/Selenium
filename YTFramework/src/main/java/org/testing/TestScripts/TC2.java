//Program to click on the History on side bar on Youtube
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
public class TC2 extends Base{
	String expectedURL="https://www.youtube.com/feed/history";
	String expectedUser="peeter parker";
	
	@Test
	public void clickHistory() throws InterruptedException {
		new Login().login();
		
		WebElement icon=driver.findElement(By.xpath(pro.getProperty("icon")));
		icon.click();
		String actualUser=driver.findElement(By.xpath(pro.getProperty("userName"))).getText();	
	
Assertions.myAssertion(actualUser, expectedUser);
action.sendKeys(Keys.ESCAPE).perform();

	//click on a history on side bar
	WebElement history=driver.findElement(By.xpath(pro.getProperty("history")));//side bar
	history.click();
	
	Thread.sleep(3000);	
	Assertions.myAssertion(driver.getCurrentUrl(), expectedURL);
	//Screenshot Captured
		try {
			Screenshot.takeScreenShot("../YTFramework/Screenshots/"+this.getClass().getName()+".png");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		System.out.println("TC2=Clicked on History on side bar on Youtube");
		Logout.logout();
		LogsCapture.takesLog("My Log is Ready! ", this.getClass().getName());

		
	}

}
