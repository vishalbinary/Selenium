import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.JPetStore.base.TestBase;
import com.qa.JPetStore.config.ConfigurationExcel;
import com.qa.JPetStore.pages.JPetSignUpPage;

@Listeners(com.qa.JPetStore.Listener.Listener.class)
public class JPetSignUpPageTest extends TestBase {
	JPetSignUpPage signUpPage;
	JPetSignUpPageTest signUpPageTest;

	public JPetSignUpPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		signUpPageTest = new JPetSignUpPageTest();

		initialize();
		signUpPage = new JPetSignUpPage();

	}

	
	@Test(priority = 1, enabled=false)
	public void signUpPageTitleTest() {

		Assert.assertEquals(signUpPage.signUpPageTitle(), "JPetStore Demo");
		System.out.println("Expected Title::" + signUpPage.signUpPageTitle());
		System.out.println("Actual Title ::JPetStore Demo");

	}

	@Ignore
	@Test(priority = 2)
	public void sinupPageLogoTest() {
		signUpPage.signUpPageLogo();
		Assert.assertTrue(signUpPage.signUpPageLogo(), "Logo is not displayed");
	}

	@DataProvider
	public String[][] getData() {
		String data[][] = null;
		try {
			data = ConfigurationExcel.excelData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(data.length + " ::" + data[0].length);
		return data;

	}

	@Test(dataProvider = "getData")
	public void signUpFormTest(String id, String pass, String rePass, String fName, String lName, String email,
			String phone, String address1, String address2, String city, String state, String zip, String country,
			String language, String category, String myList, String banner) {
		signUpPage.signUpForm(id, pass, rePass, fName, lName, email, phone, address1, address2, city, state, zip,
				country, language, category, myList, banner);
	}

	@AfterMethod
	public void tearDown() {
		closeDriver();
	}
}
