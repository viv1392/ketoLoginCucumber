package utilisClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class UtilisClass {
    public WebDriver driver;
	public void ActionClass(WebDriver driver,int x ,int y) {
		Actions action=new Actions(driver);
		action.scrollByAmount(x, y).build().perform();
	}
}
