package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilisClass.UtilisClass;

public class GenderSelectionPage extends UtilisClass {

	public WebDriver driver;
	public LoginPage login;

	public GenderSelectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Access My Plan,")
	WebElement ele;

	public LoginPage accessPlan() {
		ele.click();
		login = new LoginPage(driver);
		return login;
	}
}
