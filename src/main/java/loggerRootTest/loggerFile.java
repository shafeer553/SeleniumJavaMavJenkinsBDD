package loggerRootTest;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class loggerFile {
	
	
	public static Logger log = LogManager.getLogger(loggerFile.class.getName());
	
	public static void main(String args[]) {
		
		log.info("info messgae logged");
		log.error("error message logged");
		log.fatal("this is fatal man");
						
	}
	
}
