package testCases;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseTest.BaseTestClass;
import pageObjects.DashboardPage;
import pageObjects.HomePage;
import pageObjects.TransferFundPage;

public class TC03_To_Verify_Transfer_Funds extends BaseTestClass {

	@Test(priority = 3)
	public void to_Verify_Transfer_Funds() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		DashboardPage dashboardPage = new DashboardPage(driver);
		TransferFundPage transferFundPage = new TransferFundPage(driver);

		homePage.enterusername(username);

		homePage.enterpassword(properties.getProperty("password"));
		logger.info("username and pass entered successfully for fund transfer");

		homePage.clickloginbutton();
		logger.info("clicked on login button");
		extentTest.log(Status.INFO, "clicked login into the application");

		dashboardPage.clicktransferfundlink();
		
		extentTest.log(Status.INFO, "clicked transfer fund");
		
		logger.info("click on transfer fund link in the left menu");
		transferFundPage.enteramount("225");
		Thread.sleep(1000);
		
		logger.warn("amount entered");
		extentTest.log(Status.INFO, "entered amount");
		transferFundPage.clicktransferbtn();
		
		logger.info("transfer button clicked");

//		driver.wait(2000);
		Thread.sleep(1000);
		

		boolean status = transferFundPage.verifytransfermsg("Transfer Complete!");

		AssertJUnit.assertTrue(status);
		
		logger.info("tramsfer msg verified");
		extentTest.log(Status.PASS, "fund transfer success");
	}

}
