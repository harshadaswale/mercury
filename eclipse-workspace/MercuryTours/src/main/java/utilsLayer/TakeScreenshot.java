package utilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseLayer.BaseClass;

public class TakeScreenshot extends BaseClass {
	public static void screenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
	File src=	ts.getScreenshotAs(OutputType.FILE);
	File dist=new File("C:\\Users\\ASUS\\eclipse-workspace\\MercuryTours\\Screenshot\\a.png");
	FileUtils.copyFile(src,dist);	
	}

}
