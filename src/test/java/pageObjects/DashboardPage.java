package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseObjects.BasePageObjects;

public class DashboardPage extends BasePageObjects {

	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(className = "smallText")
	WebElement loginWelcomeMsg;

	@FindBy(css = "div[id='rightPanel'] p")
	WebElement registerationMsg;

	@FindBy(linkText = "Transfer Funds")
	WebElement transferFundLink;

	@FindBy(linkText = "Open New Account")
	WebElement openNewAccountLink;

	// methods
	public boolean verifyregisterationmsg(String msg) {

		if (registerationMsg.getText().equalsIgnoreCase(msg)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyloginmsg(String msg) {
		if (loginWelcomeMsg.getText().equalsIgnoreCase(msg)) {
			return true;
		} else {
			return false;
		}
	}

	public void clicktransferfundlink() {
		transferFundLink.click();
	}

	public void clickopennewaccountlink() {
		openNewAccountLink.click();
	}

}
