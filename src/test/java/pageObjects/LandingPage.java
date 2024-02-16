package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;
	public GenderSelectionPage gender;

	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Take the Quiz")
	WebElement ele;
	
	public GenderSelectionPage clickOnTakeQuiz() {
		ele.click();
		gender=new GenderSelectionPage(driver);
		return gender;
	}

}
