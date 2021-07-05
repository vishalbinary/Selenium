package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	
	public  Properties pro;
	public Properties getProperties() throws Exception {
		
		File file=new File("../YTFramework/src/main/java/org/testing/utilities/Property.property");
		FileInputStream fis=new FileInputStream(file);
		pro=new Properties();
		 pro.load(fis);
		 return pro;
		
	}
	

}
