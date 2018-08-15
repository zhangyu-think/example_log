package top.qifansfc.example_log;
import org.apache.log4j.Logger;

public class Test {

	public static Logger LOGGER = Logger.getLogger(Test.class);
	public static void main(String[] args) {
		LOGGER.debug("test info");
		LOGGER.info("test info1");
		LOGGER.error("test error");
	}
}