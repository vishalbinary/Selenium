//Program to click on the Explore->Trending  on side bar on Youtube
package org.testing.TestScripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
	Actions action;
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");		
		driver=new ChromeDriver(option);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");	
		System.out.println("Browser is Launched");
		
	}
	
    @Test
	public void clickOnTrending() throws InterruptedException{
    	WebElement sinInBtn=driver.findElement(By.xpath("//*[ @id='text' and @class='style-scope ytd-button-renderer style-suggestive size-small']"));
		Thread.sleep((2000));
		sinInBtn.click();
		Thread.sleep((2000));
		
		//for email id
		WebElement email=driver.findElement(By.xpath("//input[@type='email' and @aria-label='Email or phone']"));
		email.clear();
		email.sendKeys("peeterparkerbinary@gmail.com");
		WebElement submitBtn=driver.findElement(By.xpath("//button/span[contains(text(),'Next')]"));
	submitBtn.click();
	Thread.sleep((2000));
	
	//for password
	WebElement password=driver.findElement(By.xpath("//input[@type='password'and @aria-label='Enter your password']"));
	password.clear();
	password.sendKeys("peeter@#7");
	WebElement nextBtn=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	nextBtn.click();
	Thread.sleep(3000);// wait after login for 3 secs
	
	//click on Trending link(Explore->Trending)
	
	driver.findElement(By.xpath("//a/*/yt-formatted-string[contains(text(),'Explore')]")).click();;//side bar
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div/yt-formatted-string[contains(text(),'Trending')]")).click();
	Thread.sleep(3000);
	
	//process to logout
	WebElement icon=driver.findElement(By.xpath("//img[@id='img' and @class='style-scope yt-img-shadow' and @alt='Avatar image']"));
	icon.click();
	WebElement signOut=driver.findElement(By.xpath("//div/*[contains(text(),'Sign out')]"));
	signOut.click();
	System.out.println("TC1=Clicked on Trending(Explore->Trending) on Youtube");
		
	}
	
	@AfterMethod()
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();		
		System.out.println("Browser is Closed");

	}

}
