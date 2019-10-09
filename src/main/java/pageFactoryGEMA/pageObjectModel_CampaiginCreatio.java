package pageFactoryGEMA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObjectModel_CampaiginCreatio{

	WebDriver driver;
	WebElement element;
	
	public pageObjectModel_CampaiginCreatio(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement gemaUserName() {return driver.findElement(By.id("strEmail"));}
	public WebElement gemaPassword() {return driver.findElement(By.name("strPassword"));}
	public WebElement gemaSignin() {return driver.findElement(By.xpath("//button[@type='submit' and contains(text(), 'Sign in')]"));}
	
}
