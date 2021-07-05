package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public void drop(String value, WebElement element) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	public void drop(int index, WebElement element) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}

}
