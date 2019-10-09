package logger;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class consoleLogger {
	
	
	public static Logger log = LogManager.getLogger(consoleLogger.class.getName());
	
	public static void main(String args[]) {
		
		log.debug("debug messgae logged");
		log.error("error message logged");
		log.fatal("this is fatal man");
						
	}
	
}
