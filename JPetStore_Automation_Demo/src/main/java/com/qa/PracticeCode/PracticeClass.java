package com.qa.PracticeCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PracticeClass {
	WebDriver driver;

	@Test
	public void practice() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
		//FirefoxOptions option=new FirefoxOptions();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		option.addArguments("disable-Learn-more");
		
		//option.addArguments("--disable-notifications");		
		//driver=new FirefoxDriver(option);
		driver=new ChromeDriver(option);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");	
		Actions action=new Actions(driver);
		
			
	
			
			  WebElement sinInBtn=driver.findElement(By.
			  xpath("//*[ @id='text' and @class='style-scope ytd-button-renderer style-suggestive size-small']" )); 
			 // Thread.sleep((2000));
			  sinInBtn.click(); 
			  Thread.sleep((2000));
			  
			  //for email id 
			  WebElement email=driver.findElement(By.xpath("//input[@type='email' and @aria-label='Email or phone']"));email.clear(); email.sendKeys("peeterparkerbinary@gmail.com"); WebElement
			  submitBtn=driver.findElement(By.xpath("//button/span[contains(text(),'Next')]"));
			  submitBtn.click();
			  Thread.sleep((3000));
			  
			  //for password 
			  WebElement password=driver.findElement(By.xpath("//input[@type='password'and @aria-label='Enter your password']"));
			  password.clear(); 
				password.sendKeys("Spiderman@#7");

			  WebElement
			  nextBtn=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			  nextBtn.click(); 
			  //Thread.sleep(3000);// wait after login for 3 secs 
			  //click ona video 
			  WebElement
			 
			  clickVideo=driver.findElement(By.xpath("//*[@id='video-title']"));
			  System.out.println("clickVideo element is displayed:: "+clickVideo.isDisplayed());
			  clickVideo.click(); 
				Thread.sleep(3000);

			 
		
		
		//comment on a video		
			 action.sendKeys(Keys.PAGE_DOWN).perform();
			 
			 
			
				Thread.sleep(3000);
				//WebDriverWait wait=new WebDriverWait(driver, 5);
			
				/*
				 * JavascriptExecutor js1=(JavascriptExecutor)driver;
				 * js1.executeScript("window.scrollBy(0,400)");
				 */
				/*
				 * WebElement commenetVideo=driver.findElement(By.xpath(
				 * "//div[@id='div#contenteditable-root']")); commenetVideo.click();
				 */
				WebElement commentVideo=driver.findElement(By.xpath("//div/yt-formatted-string[contains(text(),'Add a public comment...')]"));
				 	commentVideo.click();
				 	WebElement comment=driver.findElement(By.cssSelector("div#contenteditable-root"));
				 	//comment.click();
					/*
					 * WebDriverWait t = new WebDriverWait(driver, 10);
					 * t.until(ExpectedConditions.visibilityOf(comment));
					 * t.until(ExpectedConditions.elementToBeClickable(comment));
					 */
					 
				     
				 	
				 	//JavascriptExecutor js=(JavascriptExecutor)driver;
				 	
				 	
			  
			 	// commentVideo.click();
				
					action.sendKeys(Keys.PAGE_DOWN).perform();

					//WebElement comment1 = driver
							//.findElement(By.xpath("//div/yt-formatted-string[contains(text(),'Add a public comment...')]"));
					//comment1.click();
					
					//comment is performed using Action class
					action.keyUp(comment, Keys.SHIFT);
					action.sendKeys(comment, "Fantastic Movie");
					action.keyUp(comment, Keys.SHIFT);
					action.perform();

					//WebElement commentVideo1 = driver.findElement(By.cssSelector("div#contenteditable-root"));
					//commentVideo1.sendKeys("South movie is good");

					//WebElement submitComment = driver.findElement(
						//	By.xpath("//tp-yt-paper-button[@id='button']/yt-formatted-string[contains(text(),'Comment')]"));
					//submitComment.click();
					Thread.sleep(2000);
		}

}
