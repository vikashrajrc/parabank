package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseObjects.BasePageObjects;

public class RegisterPage extends BasePageObjects {

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "input[id='customer.firstName']")
	WebElement firstnameTextbox;

	@FindBy(css = "input[id='customer.lastName']")
	WebElement lastnameTextbox;

	@FindBy(css = "input[id='customer.address.street']")
	WebElement addressLineTextbox;

	@FindBy(css = "input[id='customer.address.city']")
	WebElement cityTextbox;

	@FindBy(css = "input[id='customer.address.state']")
	WebElement stateTextbox;

	@FindBy(css = "input[id='customer.address.zipCode']")
	WebElement zipcodeTextbox;

	@FindBy(css = "input[id='customer.phoneNumber']")
	WebElement phoneTextbox;

	@FindBy(css = "input[id='customer.ssn']")
	WebElement ssnTextbox;

	@FindBy(css = "input[id='customer.username']")
	WebElement usernameTextbox;

	@FindBy(css = "input[id='customer.password']")
	WebElement passwordTextbox;

	@FindBy(id = "repeatedPassword")
	WebElement confirmPasswordTextbox;

	@FindBy(css = "input[value='Register']")
	WebElement registerButtton;

	// methods
	public void enterfirstname(String f) {

		firstnameTextbox.sendKeys(f);
	}

	public void enterlastname(String l) {

		lastnameTextbox.sendKeys(l);
	}

	public void enteraddressline(String add) {

		addressLineTextbox.sendKeys(add);
	}

	public void entercity(String c) {

		cityTextbox.sendKeys(c);
	}

	public void enterstate(String st) {

		stateTextbox.sendKeys(st);
	}

	public void enterzip(String zip) {

		zipcodeTextbox.sendKeys(zip);
	}

	public void enterphone(String ph) {

		phoneTextbox.sendKeys(ph);
	}

	public void enterssn(String ssn) {

		ssnTextbox.sendKeys(ssn);
	}

	public void enterusername(String usr) {

		usernameTextbox.sendKeys(usr);
	}

	public void enterpassword(String ps) {

		passwordTextbox.sendKeys(ps);
	}

	public void clickregisterbutton() {

		registerButtton.click();
	}

	public void entercnfrmpassword(String cps) {

		confirmPasswordTextbox.sendKeys(cps);
	}
}
