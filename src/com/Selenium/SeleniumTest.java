package com.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	public static void main(String[] args) {
		WebElement emailId, password;
		System.setProperty("webdriver.gecko.driver","D:\\2021\\SELENIUM2021\\GekoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");// url of the Website
		// email input field is filled
		emailId = driver.findElement(By.id("email"));// find mailId element
		emailId.sendKeys("swengg.vishal@gmail.com");
		// password input field is filled
		password = driver.findElement(By.cssSelector("input#pass"));
		password.sendKeys("Vishalsingh@#7");
		// click on signIn button
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

		System.out.println("Facebook is succesfully logged in ");

	}
}