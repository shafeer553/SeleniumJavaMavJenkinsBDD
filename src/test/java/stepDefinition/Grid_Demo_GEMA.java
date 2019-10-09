package stepDefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import excelUtility.ExcelDataConfig;
import pageFactoryGEMA.pageObjectModel_CampaiginCreatio;

public class Grid_Demo_GEMA {
	static WebDriver driver,driver1;
	static pageObjectModel_CampaiginCreatio gema;
	static String baseURL;
	static String nodeURL;
	static String nodeURL1;
	
	public static void main(String[] args) throws MalformedURLException {

		//System.setProperty("webdriver.chrome.driver",
		//		"C://Users//shaiksh//ShafeerData//MyDocs//Project_Test//New_Selenium//Drivers//chromedriver32bit.exe");
		
		//System.setProperty("webdriver.gecko.driver",
			//	"C://Users//shaiksh//ShafeerData//MyDocs//Project_Test//New_Selenium//Drivers//geckodriver.exe");
		
		System.setProperty("webdriver.edge.driver",
			"C://Users//shaiksh//ShafeerData//MyDocs//Project_Test//New_Selenium//Drivers//msedgedriver.exe");

		
		//driver = new ChromeDriver();
		baseURL ="https://gema2-pre3.ey-vx.com/";
		nodeURL = "http://192.168.0.14:5553/wd/hub";
		nodeURL1 = "http://10.0.0.105:5555/wd/hub";
			
		/*ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);		
		driver = new RemoteWebDriver(new URL(nodeURL1), options); */
		
		
		InternetExplorerOptions optionsIE = new InternetExplorerOptions();
		optionsIE.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
		optionsIE.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		optionsIE.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);		
		driver1 = new RemoteWebDriver(new URL(nodeURL1), optionsIE);
		
		
	/*	InternetExplorerOptions ieOptions = new InternetExplorerOptions();
		ieOptions.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		ieOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,UnexpectedAlertBehaviour.ACCEPT);
		ieOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new RemoteWebDriver(new URL(nodeURL1), ieOptions); */
		
		
		/*EdgeOptions edge = new EdgeOptions();
		edge.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		driver = new EdgeDriver(edge); */
		
		
		gema = new pageObjectModel_CampaiginCreatio(driver);
		ExcelDataConfig excel = new ExcelDataConfig("C:\\MAINTENANCE\\LOGS\\DT_GEMA_Details.xlsx");
		String userName = excel.getData("Global", 1, 0);
		String password = excel.getData("Global", 1, 1);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get(baseURL);
		log.info("GEMA URL Launched");
		gema.gemaUserName().sendKeys(userName);
		log.info("Application username entered");
		gema.gemaPassword().sendKeys(password);
		log.info("Application password entered");
		gema.gemaSignin().click();
		log.info("clicked on sigin");
		log.info("login successful");		
		driver.quit();
	}

	private static Logger log = LogManager.getLogger(Grid_Demo_GEMA.class.getName());

}
