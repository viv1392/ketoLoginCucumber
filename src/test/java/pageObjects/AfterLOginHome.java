package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterLOginHome {
  WebDriver driver;
	public AfterLOginHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//i[@class='fa fa-plus']")
	WebElement ele;
	public void afterLogin() {
		ele.click();
		
	}

}
