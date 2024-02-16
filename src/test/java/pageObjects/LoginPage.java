package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     WebDriver driver;
     AfterLOginHome home;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="bttn")
	WebElement btn;
	
	public AfterLOginHome loginPage(String mail,String pass) {
		email.sendKeys(mail);
		password.sendKeys(pass);
	    btn.click();
	    home=new AfterLOginHome(driver);
	    return home;
	}

}
