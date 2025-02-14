package testCases;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseTest.BaseTestClass;
import pageObjects.DashboardPage;
import pageObjects.HomePage;

public class TC01_To_Verify_Login extends BaseTestClass {

	@Test(priority = 2)
	public void to_Verify_Login() {

		HomePage homePage = new HomePage(driver);
		DashboardPage dashboardPage = new DashboardPage(driver);

		homePage.enterusername(username);

		homePage.enterpassword(properties.getProperty("password"));
		
		logger.info("username and pass entered successfully");
		extentTest.log(Status.WARNING, "enter user and pass secretly");

		homePage.clickloginbutton();
		
		logger.info("clicked on login button");
		extentTest.log(Status.INFO, "clicked login");

		boolean status = dashboardPage.verifyloginmsg("Welcome vikash kumar");

		AssertJUnit.assertTrue(status);
		
		logger.info("login msg verified");
		extentTest.log(Status.PASS, "verified login");

	}
}
