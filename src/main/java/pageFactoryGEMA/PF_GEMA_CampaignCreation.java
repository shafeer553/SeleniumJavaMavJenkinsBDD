package pageFactoryGEMA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PF_GEMA_CampaignCreation {

	WebDriver driver;

	// ******** LOGIN PAGE *********************************
	@FindBy(id = "strEmail")
	public WebElement gema_username;
	@FindBy(name = "strPassword")
	public WebElement gema_password;
	@FindBy(xpath = "//button[@type='submit' and contains(text(), 'Sign in')]")
	public WebElement gema_signin;

	// ******* NEW CAMPAIGN Page ***************************
	@FindBy(partialLinkText = "Create Email Campaign")
	public WebElement newCampaiginLink;

	// ******* CAMPAIGN CREATION FORM Page ******************
	@FindBy(id = "strBrochureName")
	public WebElement campaignName;
	@FindBy(id = "strNotes")
	public WebElement campOptionalNote;
	@FindBy(name = "intContentTypeSitePageId_17")
	public WebElement Country;
	@FindBy(name = "intContentTypeSitePageId_18")
	public WebElement region;
	@FindBy(name = "intContentTypeSitePageId_13")
	public WebElement language;
	@FindBy(name = "intContentTypeSitePageId_14")
	public WebElement legalEntity;
	@FindBy(name = "intContentTypeSitePageId_15")
	public WebElement audience;
	@FindBy(name = "intContentTypeSitePageId_16")
	public WebElement publicationAlert;
	@FindBy(name = "strCategory")
	public WebElement templateCategory;
	@FindBy(name = "strLayouts_0")
	public WebElement layout1;
	@FindBy(name = "strLayouts_1")
	public WebElement layout2;
	@FindBy(xpath = "//input[@name=\"btnCreate\" and @onclick=\"create('GEMA-Global')\"]")
	public WebElement createCampign;

	// Actions associated with methods

	public void fillCampaignName(String nameCamp) {
		campaignName.sendKeys(nameCamp);
	}

	public void fillCampOptionalNote(String optionalNote) {
		campOptionalNote.sendKeys(optionalNote);
	}

	public void regionSelection(String regionName) {
		new Select(region).selectByVisibleText(regionName);
	}

	public void countrySelection(String countryName) {
		new Select(Country).selectByVisibleText(countryName);
	}

	public void langSelection(String language1) {
		new Select(language).selectByVisibleText(language1);
	}

	public void legalEntitySelection(String legalEntity1) {

		new Select(legalEntity).selectByVisibleText(legalEntity1);
	}

	public void audienceSelection(String audience1) {
		new Select(audience).selectByVisibleText(audience1);
	}

	public void publicationAlertSelection(String publicationAlertVal) {
		new Select(publicationAlert).selectByVisibleText(publicationAlertVal);
	}

	public void templateCategorySelection(String templateCategoryVal) {
		new Select(templateCategory).selectByValue(templateCategoryVal);
	}

	public void layout1Selection(String layout1Val) {
		new Select(layout1).selectByVisibleText(layout1Val);
	}

	public void layout2Selection(String layout2Val) {
		new Select(layout2).selectByVisibleText(layout2Val);
	}

	public void clickCreateCampaign() {
		createCampign.click();
	}

	public PF_GEMA_CampaignCreation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
