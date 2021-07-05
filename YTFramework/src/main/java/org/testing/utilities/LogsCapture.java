package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {
	public static void takesLog(String className, String msg ) {
		DOMConfigurator.configure("../YTFramework/Layout.xml");
		Logger logger=Logger.getLogger(className);
		logger.info(msg);
	
	}

}
