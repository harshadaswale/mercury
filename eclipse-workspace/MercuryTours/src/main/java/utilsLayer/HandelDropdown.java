 package utilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseLayer.BaseClass;

public class HandelDropdown extends BaseClass {
	public static void selectcountry(WebElement wb,String s) {
		new Select(wb).selectByVisibleText(s);
			
	}
	public static String getcountry (WebElement wb) {
	return	new Select(wb).getFirstSelectedOption().getText();
	}

}
