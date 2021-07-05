package org.testing.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testing.base.Base;

public class PlayVideo extends Base{
	public static void play() {
		//click on a video
		//WebElement clickVideo=driver.findElement(By.xpath(pro.getProperty("clickVideo")));
		List<WebElement> clickVideo=driver.findElements(By.xpath(pro.getProperty("clickVideo")));
int count = 0;
		for(WebElement element: clickVideo) {
			count++;
	wait.until(ExpectedConditions.visibilityOf(element));
	if(count==3) {
	element.click();
	break;
	}
	
}
		
	
	}

}
