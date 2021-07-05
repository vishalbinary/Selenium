package org.testing.pages;

import java.io.IOException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testing.base.Base;
import org.testing.utilities.Screenshot;

public class Login extends Base{
	
	public  void login() {
		WebElement sinInBtn=driver.findElement(By.xpath(pro.getProperty("sinInBtn").trim()));
	      wait.until(ExpectedConditions.visibilityOf(sinInBtn));
		sinInBtn.click();
			
		//for email id
		WebElement email=driver.findElement(By.xpath(pro.getProperty("email")));
		email.clear();
		email.sendKeys("peeterparkerbinary@gmail.com");
		WebElement submitBtn=driver.findElement(By.xpath(pro.getProperty("submitBtn")));
	submitBtn.click();
		
	//for password
	WebElement pass=driver.findElement(By.xpath(pro.getProperty("pass")));
	pass.clear();
	pass.sendKeys("Spiderman@#7");
	WebElement nextBtn=driver.findElement(By.xpath(pro.getProperty("nextBtn")));
	
	
	//Screenshot Captured
	try {
		Screenshot.takeScreenShot("../YTFramework/Screenshots/"+this.getClass().getName()+".png");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	nextBtn.click();
	System.out.println("Login succesfully!");
		
		
	}

	
}
