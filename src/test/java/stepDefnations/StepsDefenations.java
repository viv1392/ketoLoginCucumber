package stepDefnations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.AfterLOginHome;
import pageObjects.GenderSelectionPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class StepsDefenations {
	WebDriver driver;
	LandingPage landingPage=new LandingPage(driver);
	GenderSelectionPage gender;
	LoginPage login;
	AfterLOginHome home;
	@Before
	public void landingSetUp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--incognito");
		//option.addArguments("--headless");
		driver=new ChromeDriver(option); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://ketobalanced.com/");
		landingPage=new LandingPage(driver);
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	@Given(value = "User lands on landing page and click on take quiz")
	public void user_lands_landing_Page() {
	gender=landingPage.clickOnTakeQuiz();
	}
	@Then("user click on access on my plan")
	public void user_click_on_access_on_my_plan() {
		login=gender.accessPlan();
	}
	@When("^user navigated to login page user fills (.+) and (.+)$")
	public void user_navigated_to_login_page_user_fills_xyz010_yopmail_com_and(String username,String password) {
		home=login.loginPage(username, password);
	}
	@Then("user navigated to home dashboard and click on water update button")
	public void user_click_on_login_button() {
		home.afterLogin();
		
		
	}
}
