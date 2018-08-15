package example_log;

import org.apache.log4j.Logger;

public class Test {

	public static Logger LOGGER = Logger.getLogger(Test.class);
	public static void main(String[] args) {
		LOGGER.info("test info");
		LOGGER.error("test error");

	}

}
