package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import excelUtility.ExcelDataConfig;
import pageFactoryGEMA.pageObjectModel_CampaiginCreatio;

public class GEMA_Login_ExcelData {
	static WebDriver driver;
	static pageObjectModel_CampaiginCreatio gema;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//shaiksh//ShafeerData//MyDocs//Project_Test//New_Selenium//Drivers//chromedriver32bit.exe");
		driver = new ChromeDriver();
		gema = new pageObjectModel_CampaiginCreatio(driver);
		ExcelDataConfig excel = new ExcelDataConfig("C:\\MAINTENANCE\\LOGS\\DT_GEMA_Details.xlsx");
		String userName = excel.getData("Global", 1, 0);
		String password = excel.getData("Global", 1, 1);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://gema2-pre3.ey-vx.com/");
		log.info("GEMA URL Launched");
		gema.gemaUserName().sendKeys(userName);
		log.info("Application username entered");
		gema.gemaPassword().sendKeys(password);
		log.info("Application password entered");
		gema.gemaSignin().click();
		log.info("clicked on sigin");
		driver.quit();
	}

	private static Logger log = LogManager.getLogger(GEMA_Login_ExcelData.class.getName());

}
