package logger;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerUtility {
		
	public Logger logMsg() {
		Logger log = LogManager.getLogger(LoggerUtility.class.getName());
		return log;
	}
		
}
