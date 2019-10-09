package supportFiles;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeAScreenShot {

	public static void captureScreenShot(WebDriver driver, String screenName) {
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		try {			
		
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\shaiksh\\ShafeerData\\MyDocs\\Project_Test\\New_Selenium\\TestSeleMavenNew\\screenshots\\"+screenName+System.currentTimeMillis()+".png"));
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
					
	} 
}
