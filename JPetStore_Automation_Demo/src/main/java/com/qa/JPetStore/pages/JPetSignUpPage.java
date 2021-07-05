//this class holds all the elements on SignUp page.
package com.qa.JPetStore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.JPetStore.base.TestBase;

public class JPetSignUpPage extends TestBase {
	/*
	 * @FindBy(xpath="//a[contains(text(),'Register Now!')]") WebElement
	 * registerLink;
	 */

	@FindBy(xpath = "//td/input[@id='stripes--449741568' or @name='username']")
	WebElement id;
	// WebElement
	// id=driver.findElement(By.xpath("//td/input[@id='stripes--449741568' or
	// @name='username']"));

	// @FindBy(xpath="//td/input[@name='password' and @type='text']")
	WebElement password = driver.findElement(By.xpath("//td/input[@name='password' and @type='text']"));

	@FindBy(xpath = "//td/input[@name='repeatedPassword' and @type='text']")
	WebElement rePassword;
	// WebElement
	// rePassword=driver.findElement(By.xpath("//td/input[@name='repeatedPassword'
	// and @type='text']"));

	@FindBy(xpath = "//td/input[@*='account.firstName' and @type='text']")
	WebElement firstName;
	// WebElement
	// firstName=driver.findElement(By.xpath("//td/input[@*='account.firstName' and
	// @type='text']"));

	@FindBy(xpath = "//td/input[@*='account.lastName' and @type='text']")
	WebElement lastName;
	// WebElement
	// lastName=driver.findElement(By.xpath("//td/input[@*='account.lastName' and
	// @type='text']"));

	@FindBy(xpath = "//td/input[@*='account.email' and @type='text']")
	WebElement email;
	// WebElement email=driver.findElement(By.xpath("//td/input[@*='account.email'
	// and @type='text']"));

	@FindBy(xpath = "//td/input[@*='account.phone' and @type='text']")
	WebElement phone;
	// WebElement phone=driver.findElement(By.xpath("//td/input[@*='account.phone'
	// and @type='text']"));

	@FindBy(xpath = "//td/input[@*='account.address1' and @type='text']")
	WebElement address1;
	// WebElement
	// address1=driver.findElement(By.xpath("//td/input[@*='account.address1' and
	// @type='text']"));

	@FindBy(xpath = "//td/input[@*='account.address2' and @type='text']")
	WebElement address2;
	// WebElement
	// address2=driver.findElement(By.xpath("//td/input[@*='account.address2' and
	// @type='text']"));

	@FindBy(xpath = "//td/input[@*='account.city' and @type='text']")
	WebElement city;
	// WebElement city=driver.findElement(By.xpath("//td/input[@*='account.city' and
	// @type='text']"));

	@FindBy(xpath = "//td/input[@*='account.state' and @type='text']")
	WebElement state;
	// WebElement state=driver.findElement(By.xpath("//td/input[@*='account.state'
	// and @type='text']"));

	@FindBy(xpath = "//td/input[@*='account.zip' and @type='text']")
	WebElement zip;
	// WebElement zip=driver.findElement(By.xpath("//td/input[@*='account.zip' and
	// @type='text']"));

	@FindBy(xpath = "//td/input[@*='account.country' and @type='text']")
	WebElement country;
	// WebElement
	// country=driver.findElement(By.xpath("//td/input[@name='account.country' and
	// @type='text']"));

	@FindBy(xpath = "//select[@name='account.languagePreference']")
	WebElement selectLanguage;
	// WebElement
	// selectLanguage=driver.findElement(By.xpath("//select[@name='account.languagePreference']"));

	@FindBy(xpath = "//select[@name='account.favouriteCategoryId']")
	WebElement selectCategory;
	// WebElement
	// selectCategory=driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));

	@FindBy(xpath = "//input[@name='account.listOption' and @type='checkbox']")
	WebElement myListRadio;
	// WebElement
	// myListRadio=driver.findElement(By.xpath("//td/input[@name='account.listOption'
	// and @type='checkbox']"));

	@FindBy(xpath = "//input[@name='account.bannerOption' and @type='checkbox']")
	WebElement myBannerRadio;
	// WebElement
	// myBannerRadio=driver.findElement(By.xpath("//input[@name='account.bannerOption'
	// and @type='checkbox']"));

	@FindBy(xpath = "//input[@name='newAccount' and @type='submit']")
	WebElement submitButton;
	// WebElement
	// submitButton=driver.findElement(By.xpath("//input[@name='newAccount' and
	// @type='submit']"));

	@FindBy(css = "#LogoContent > a:nth-child(1) > img:nth-child(1)")
	WebElement signUpPageLogo;
	// WebElement signUpPageLogo=driver.findElement(By.cssSelector("#LogoContent >
	// a:nth-child(1) > img:nth-child(1)"));

	public JPetSignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public String signUpPageTitle() {
		return driver.getTitle();
	}

	public boolean signUpPageLogo() {
		return signUpPageLogo.isDisplayed();
	}

	// this method gives values to the fields and fill the signUp form
	public void signUpForm(String id, String pass, String rePass, String fName, String lName, String email,
			String phone, String address1, String address2, String city, String state, String zip, String country,
			String language, String category, String myList, String banner) {
		System.out.println("Web Elements are passing:: " + id);
		this.id.sendKeys(id);
		password.sendKeys(pass);
		rePassword.sendKeys(rePass);
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		this.email.sendKeys(email);
		this.phone.sendKeys(phone);
		this.address1.sendKeys(address1);
		this.address2.sendKeys(address2);
		this.city.sendKeys(city);
		this.state.sendKeys(state);
		this.zip.sendKeys(zip);
		this.country.sendKeys(country);
		selectLanguage.sendKeys(language);
		selectCategory.sendKeys(category);
		if (myList.equalsIgnoreCase("true"))
			myListRadio.click();
		if (banner.equalsIgnoreCase("true"))
			myBannerRadio.click();
		// submitButton.click();

	}
}