package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import excelUtility.ExcelDataConfig;
import pageFactoryGEMA.pageObjectModel_CampaiginCreatio;

public class CampaignCreation_POM_TestCase {
	WebDriver driver;
	pageObjectModel_CampaiginCreatio gema;

	// @Given("user with a valid gema <username> and <password>")
	@Given("^user with a valid gema \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_with_a_valid_gema_username_and_password(String userName, String password) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C://Users//shaiksh//ShafeerData//MyDocs//Project_Test//New_Selenium//Drivers//chromedriver32bit.exe"
		 * );
		 */		
		
		System.setProperty("webdriver.gecko.driver",
				"C://Users//shaiksh//ShafeerData//MyDocs//Project_Test//New_Selenium//Drivers//geckodriver.exe");
		
		
		driver = new FirefoxDriver();
		gema = new pageObjectModel_CampaiginCreatio(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://gema2-pre3.ey-vx.com/");
		gema.gemaUserName().sendKeys(userName);
		gema.gemaPassword().sendKeys(password);
	}

	@When("user enters username and password in the application")
	public void login_gema() {

	}

	@When("user clicks on signin")
	public void user_clicks_on_signin() {
		gema.gemaSignin().click();
	}

	@Then("user login should be \\\"([^\\\"]*)\\\" and welcome displayed")
	public void closeBrowser(String status) {
		System.out.println(status);
		driver.quit();
	}
}
