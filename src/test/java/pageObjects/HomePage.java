package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseObjects.BasePageObjects;

public class HomePage extends BasePageObjects {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "input[name='username']")
	WebElement usernameTextbox;

	@FindBy(css = "input[name='password']")
	WebElement passwordTextbox;

	@FindBy(xpath = "//input[@value='Log In']")
	WebElement loginButton;

	@FindBy(linkText = "Register")
	WebElement registerLink;

	// methods

	public void enterusername(String usr) {
		usernameTextbox.sendKeys(usr);
	}

	public void enterpassword(String ps) {
		passwordTextbox.sendKeys(ps);
	}

	public void clickloginbutton() {
		loginButton.click();
	}

	public void clickregisterlink() {
		registerLink.click();
	}

}
