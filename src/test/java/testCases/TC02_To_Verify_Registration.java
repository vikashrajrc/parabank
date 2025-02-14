package testCases;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseTest.BaseTestClass;
import pageObjects.DashboardPage;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class TC02_To_Verify_Registration extends BaseTestClass {

//	String username;
	@Test(priority = 1)
	public void to_Verify_Registration() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		RegisterPage registerPage = new RegisterPage(driver);
		DashboardPage dashboardPage = new DashboardPage(driver);

		homePage.clickregisterlink();
		registerPage.enterfirstname("vikash");
		registerPage.enterlastname("kumar");
		registerPage.enteraddressline("manpur");
		registerPage.entercity("gaya");
		registerPage.enterstate("bihar");
		registerPage.enterzip("823003");
		registerPage.enterphone("9263279033");
		registerPage.enterssn("2205");

		registerPage.enterusername(username);
		registerPage.enterpassword(properties.getProperty("password"));
		registerPage.entercnfrmpassword(properties.getProperty("password"));
		registerPage.clickregisterbutton();

		logger.info("netered all details for registration");
		extentTest.log(Status.INFO, "entered all details for registeration");

		Thread.sleep(2000);

		boolean status = dashboardPage
				.verifyregisterationmsg("Your account was created successfully. You are now logged in.");

		AssertJUnit.assertTrue(status);
		logger.info("registration msg verified");
		extentTest.log(Status.PASS, "verified registration");
	}
}
