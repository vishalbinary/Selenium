package com.Automation.SignUpPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
public class FolloUpElement {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../March2021(Selenium)/chromedriver.exe");
		ChromeDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
		
		WebElement element=driver.findElement(By.xpath("//div/a[contains(text(),'Register Now!')]"));
		
	element.click();
	}

}
