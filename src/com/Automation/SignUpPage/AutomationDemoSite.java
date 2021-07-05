package com.Automation.SignUpPage;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoSite {
	ChromeDriver driver;

	// This generic dropdown method can be used
	public void dropdownHandle(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);

	}

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");// driver path
		driver = new ChromeDriver();// instantiate Chrome driver
		driver.manage().window().maximize();// maximize the windows
		driver.get("http://demo.automationtesting.in/Register.html");// path of the website
		System.out.println("===============Chrome Driver is launched succesfully=================");
	}

	@Test
	public void verifyPageTest() throws InterruptedException {

		WebElement firstName = driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
		firstName.sendKeys("Deepak");

		WebElement lastName = driver.findElement(By.cssSelector("input[ng-model='LastName']"));
		lastName.sendKeys("Bhardwaj");

		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("142, Govindpuri, New Delhi, Delhi, 110055");

		WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.sendKeys("deepakbhardwajbsr@gmail.com");

		WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phone.sendKeys("9865254780");

		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();

		// checkboxes are clicked here
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();

		// language is/are selected
		driver.findElement(By.id("msdd")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/ul/li/a[@class='ui-corner-all'])[8]")).click();

		// here dropdown method is invoked for skills
		WebElement skills = driver.findElement(By.id("Skills"));
		dropdownHandle(skills, "Java");

		// here dropdown method is invoked for countries
		WebElement countries = driver.findElement(By.id("countries"));
		dropdownHandle(countries, "India");
		
		// select item from a list of country
		// first select the dropdown field
		driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
		// here all list items are selected and stored in a List reference variable
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='select2-country-results']/li"));
		// List<WebElement> list =
		// driver.findElements(By.xpath("//span/ul/li[@role='treeitem']"));
		// here list items are iterated
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			if (webElement.getText().trim().equalsIgnoreCase("Australia")) {
				webElement.click();
				break;
			}
		}
		// dropdown for date-of-birth(yy-mm-dd)
		WebElement year = driver.findElement(By.id("yearbox"));
		dropdownHandle(year, "1995");
		WebElement month = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		dropdownHandle(month, "June");
		WebElement day = driver.findElement(By.id("daybox"));
		dropdownHandle(day, "25");

		// Elements for password
		WebElement password = driver.findElement(By.xpath("//input[@ng-model='Password']"));
		password.sendKeys("Deepak@1234");

		// Elements for Confirm password
		WebElement Cpassword = driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
		Cpassword.sendKeys("Deepak@1234");

		// Elements for submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		System.out.println("============driver is closed and browser is quit==============");
		System.out.println("============Process is Succesful==============");
	}
}
