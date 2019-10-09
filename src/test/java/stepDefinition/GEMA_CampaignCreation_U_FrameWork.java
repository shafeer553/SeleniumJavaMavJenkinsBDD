
package stepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
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
import pageFactoryGEMA.PF_GEMA_CampaignCreation;
import supportFiles.GetPropertiesObj;
import supportFiles.TakeAScreenShot;

public class GEMA_CampaignCreation_U_FrameWork {
	WebDriver driver;
	PF_GEMA_CampaignCreation gema; // page factory class
	Properties prop; // properties file object
	String gemaFilePath = "C:\\Users\\shaiksh\\ShafeerData\\MyDocs\\Project_Test\\New_Selenium\\JMTC_GemaDemo\\data\\gemaDetails.properties";
			
	@Given("user enters valid gema user name and password")
	public void launchApplication1() {
		System.setProperty("webdriver.gecko.driver",
				"C://Users//shaiksh//ShafeerData//MyDocs//Project_Test//New_Selenium//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		gema = new PF_GEMA_CampaignCreation(driver);
		prop = GetPropertiesObj.getPropertiesFile(gemaFilePath);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get(prop.getProperty("gema_url"));
		TakeAScreenShot.captureScreenShot(driver,"gemahomepage");
		//driver.quit();
	}

	@When("fill all the required gema campaign creation form")
	public void login_gema1() throws InterruptedException {

		gema.gema_username.sendKeys(prop.getProperty("dt_gema_username"));
		gema.gema_password.sendKeys(prop.getProperty("dt_gema_password"));
		gema.gema_signin.click();
		System.out.println(prop.getProperty("dt_gema_username") +":actual crdentails:"+ prop.getProperty("dt_gema_password"));
	}

	@When("click on create a campaign")
	public void clickNewCamp() throws InterruptedException {
		gema.newCampaiginLink.click();
		driver.switchTo().frame("left");
		gema.fillCampaignName("PORTest");
		gema.fillCampOptionalNote("optional POR note");
		gema.regionSelection("Canada");
		Thread.sleep(5000);
		gema.countrySelection("Canada");
		Thread.sleep(5000);
		gema.langSelection("English");
		Thread.sleep(5000);
		gema.legalEntitySelection("Ernst & Young LLP");
		Thread.sleep(5000);
		gema.audienceSelection("External");
		Thread.sleep(5000);
		gema.publicationAlertSelection("Alert/Publication/Newsletter with third party opinion");
		Thread.sleep(5000);
		gema.templateCategorySelection("EY");
		Thread.sleep(5000);
		gema.layout1Selection("email: ecard");
		Thread.sleep(5000);
		gema.layout2Selection("email: a.one-column-with-banner");
		Thread.sleep(5000);
		gema.clickCreateCampaign();
	}

	@Then("new campaign created successfully")
	public void new_campaign_created_successfully() {
		System.out.println("validate campaign creation message");
	}

	@When("user clicks on logout")
	public void user_clicks_on_logout() {
		System.out.println("click on logout");
	}

	@Then("user should be logged out from application")
	public void user_should_be_logged_out_from_application() {
		System.out.println("validate user logout");
	}
	
}
