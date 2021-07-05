package com.Automation.SignUpPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpAutomation {
	public static ChromeDriver driver;
	//Generic dropdown method for SelectByVisibleText
	public void dropdownByVisible (WebElement webElement, String value) {
		Select select=new Select(webElement);
		select.selectByVisibleText(value);
	
	}
	//Generic dropdown method for SelectByValue
	public void dropdownByValue(WebElement webElement, String value) {
		Select select=new Select(webElement);
		select.selectByValue(value);	
	}

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");// driver path
		driver = new ChromeDriver();// instantiate Chrome driver
		driver.manage().window().maximize();// maximize the windows
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com/");
	}
	
	@Test
	public void signUpTest() throws InterruptedException {
		//clicking on the sign Up link
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		//firstName element
		WebElement firstName=driver.findElement(By.xpath("//input[@*='firstname']"));
	    firstName.sendKeys("Jacky");
		//surName element
		WebElement surName=driver.findElement(By.xpath("//*[@*='lastname']"));
		surName.sendKeys("Chan");
		//email element
		WebElement email=driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]"));
		email.sendKeys("jackychan@hotmail.com");
		
		//email again element
				WebElement emailAgain=driver.findElement(By.xpath("//input[@data-type='text' and @name='reg_email_confirmation__']"));
				emailAgain.sendKeys("jackychan@hotmail.com");
		
		//createPassword element
		WebElement createPassword=driver.findElement(By.xpath("//div/input[@*='new-password']"));
		createPassword.sendKeys("Myfb@1234");
		
		//Day dropdown element
		WebElement day=driver.findElement(By.xpath("//select[@id='day' or @title='Day']"));
		this.dropdownByVisible(day, "25");
		
		//Month dropdown element
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		dropdownByValue(month, "12");
		
		//Year dropdown element
		WebElement year=driver.findElement(By.xpath("//select[contains(@id,'year')]"));
		dropdownByVisible(year, "1995");
		
		//Gender radio button element	
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		 
		 //Sign Up button 
		 //driver.findElement(By.xpath("//button[@name='websubmit' and contains(text(),'Sign Up')]")).click();
	
	}
	
    @After
    public void tearDown() throws Exception {
    	Thread.sleep(2000);
	//driver.quit();
	
}
}
