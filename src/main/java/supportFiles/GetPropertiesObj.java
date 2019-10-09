package supportFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPropertiesObj {
	
	public static Properties getPropertiesFile(String filePath)
	{
	Properties prop = new Properties();
	try {
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		
	} catch (Exception e) {

		e.printStackTrace();
	}
	return prop;
	
	
	}
	
}
