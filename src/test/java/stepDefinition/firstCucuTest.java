package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class firstCucuTest {
	WebDriver driver;

	// @Given("valid cloud for customer application details")
	public void valid_cloud_for_customer_application_details() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//shaiksh//ShafeerData//MyDocs//Project_Test//New_Selenium//Drivers//chromedriver32bit.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		// driver.get("https://my346039-sso.crm.ondemand.com//sap//ap//ui//repository//SAP_UI//HTML5//newclient.html?sap-language=EN&redirectUrl=%2Fsap%2Fbyd%2Fruntime&rootWindow=X&app.component=%2FSAP_UI_CT%2FMain%2Froot.uiccwoc#Nav//0//eyJfc1dvY0lkIjpudWxsLCJfc1ZpZXdJZCI6bnVsbCwiX3NQZXJmb3JtYW5jZVdvY0lkIjoiSG9tZSIsIl9zUGVyZm9ybWFuY2VWaWV3SWQiOiJIb21lIiwiX3NDb250ZXh0SWQiOiIyZTY1NTcwNDUwOWE5NjcwZWZiZGMxMjJhYTFhMzEzMiJ9");
		driver.get("https://gema2-pre3.ey-vx.com/");

	}

	// @When("user enters all mandatory fields in contact creation form")
	public void user_enters_all_mandatory_fields_in_contact_creation_form() throws InterruptedException {
		// driver.findElement(By.xpath("//div[contains(text(),'My Opportunities &
		// Contacts')]")).click();
		// driver.findElement(By.xpath("//div[contains(text(),'GEMA')]")).click();
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//*[@id=\"__link23\"]")).click();
		// driver.findElement(By.xpath("//h1[@class='sapMPanelHdr' and
		// contains(text(),'Customers')]")).click();
		// driver.findElement(By.linkText("Opportunities")).click();
		driver.findElement(By.name("strEmail")).sendKeys("shafeer.shaik@ey.com");
		driver.findElement(By.name("strPassword")).sendKeys("Welcome@1");
		driver.findElement(By.xpath("//button[@type='submit' and contains(text(), 'Sign in')]")).click();
		// Thread.sleep(8000);
		driver.findElement(By.partialLinkText("Create Email Campaign")).click();
		// Thread.sleep(4000);
		driver.switchTo().frame("left");
		driver.findElement(By.id("strBrochureName")).sendKeys("august052019 test");
		driver.findElement(By.id("strNotes")).sendKeys("optional notes");
		// Thread.sleep(3000);
		new Select(driver.findElement(By.name("intContentTypeSitePageId_18"))).selectByVisibleText("Canada");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("intContentTypeSitePageId_17"))).selectByVisibleText("Canada");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("intContentTypeSitePageId_13"))).selectByVisibleText("English");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("intContentTypeSitePageId_14"))).selectByVisibleText("Ernst & Young LLP");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("intContentTypeSitePageId_15"))).selectByVisibleText("External");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("intContentTypeSitePageId_16")))
				.selectByVisibleText("Alert/Publication/Newsletter with third party opinion");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("strCategory"))).selectByValue("EY");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("strLayouts_0"))).selectByVisibleText("email: ecard");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("strLayouts_1"))).selectByVisibleText("email: a.one-column-with-banner");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"t_GEMA-Global\"]/div/input")).click();
		Thread.sleep(59000);
		Thread.sleep(59000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("right");
		driver.findElement(By.xpath("//*[@id=\"targetGroup_filter\"]/label/input"))
				.sendKeys("Canada GEMA II Testing - Ongoing (2)");

		driver.findElement(By.name("strCampaignTargetGroup")).click();

		new Select(driver.findElement(By.name("strCampaignType"))).selectByVisibleText("Event");

		driver.findElement(By.name("blnSaveCampaign")).click();

		driver.findElement(By.id("dteCampaignStart")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('dteCampaignStart').value='08/03/2019'");
		driver.findElement(By.id("dteCampaignStart")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("dteCampaignEnd")).click();
		Thread.sleep(3000);
		js.executeScript("document.getElementById('dteCampaignEnd').value='08/10/2019'");
		driver.findElement(By.id("dteCampaignEnd")).click();
		driver.findElement(By.id("Create")).click();

		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='success']")));
		System.out.println("WebDriverWait Success");

		/*
		 * //driver.switchTo().defaultContent();
		 * //driver.switchTo().frame("gToday:normal:agenda.js");
		 * 
		 * List<WebElement> allDates
		 * =driver.findElements(By.xpath("//*[@id=\"outerTable\"]//td"));
		 * 
		 * for(WebElement ele :allDates) {
		 * 
		 * String date = ele.getText(); System.out.println(date);
		 * 
		 * if(date.equalsIgnoreCase("10")) { ele.click(); break; } }
		 * 
		 * Thread.sleep(3000); driver.findElement(By.id("dteCampaignEnd")).click();
		 * Thread.sleep(3000); List<WebElement> allDates1
		 * =driver.findElements(By.xpath("//*[@id=\"outerTable\"]//td"));
		 * 
		 * for(WebElement ele :allDates1) { String date = ele.getText();
		 * 
		 * if(date.equalsIgnoreCase("10")) { ele.click(); break; } }
		 * 
		 */

		// driver.findElement(By.linkText("Today : 3 08 2019")).click();

		// Thread.sleep(3000);
		// driver.findElement(By.linkText("Today : 3 08 2019")).click();

		/*
		 * driver.switchTo().defaultContent();
		 * driver.switchTo().frame("gToday:normal:agenda.js"); Thread.sleep(3000);
		 * driver.findElement(By.linkText("2")).click();
		 * driver.switchTo().defaultContent(); driver.switchTo().frame("right");
		 * driver.findElement(By.id("dteCampaignEnd")).click();
		 * driver.switchTo().defaultContent();
		 * driver.switchTo().frame("gToday:normal:agenda.js");
		 * driver.findElement(By.linkText("23")).click();
		 * driver.switchTo().defaultContent();
		 * //driver.findElement(By.id("dteCampaignEnd")).sendKeys("30082019");
		 * driver.findElement(By.id("Create")).click();
		 */

	}

	// @Then("Contact id should create")
	public void contact_id_should_create() {
		System.out.println("then");
	}

	// @Then("application should be closed")
	public void application_should_be_closed() {
		// driver.quit();
	}

}
