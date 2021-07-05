package org.testing.base;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.utilities.PropertyFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static WebDriver driver;
	public  static Properties pro;
    public Actions action;
    public static WebDriverWait wait;
    
	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");		
		driver=new ChromeDriver(option);		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://www.youtube.com/");		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		action=new Actions(driver);
		wait=new WebDriverWait(driver, 10);
	pro=	new PropertyFile().getProperties();
		
		
		System.out.println("Browser is Launched");	
	}
	
	@AfterMethod
	public void closeDriver()  {		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.close();
	//	System.out.println("Driver is Closed");
	}

}
