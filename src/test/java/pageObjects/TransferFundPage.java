package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseObjects.BasePageObjects;

public class TransferFundPage extends BasePageObjects {

	public TransferFundPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "amount")
	WebElement amountTextbox;

	@FindBy(id = "fromAccountId")
	WebElement fromAccount;

	@FindBy(id = "toAccountId")
	WebElement toAccount;

	@FindBy(css = "input[value='Transfer']")
	WebElement transferButton;

	@FindBy(xpath = "//h1[normalize-space()='Transfer Complete!']")
	WebElement transferMsg;

	public void enteramount(String am) {

		amountTextbox.sendKeys(am);
	}

	public void clicktransferbtn() {

		transferButton.click();
	}

	public boolean verifytransfermsg(String msg) {

//		System.out.println(transferMsg.getText());
//		driver.wait(2000);
//		Thread.sleep(2000);

		if (transferMsg.getText().equalsIgnoreCase(msg)) {
			return true;
		} else {
			return false;
		}
	}

}
