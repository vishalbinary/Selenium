package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testing.base.Base;


public class Screenshot extends Base{
	
	public static void takeScreenShot(String dest) throws IOException {
		File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(dest));
	
	}

}
