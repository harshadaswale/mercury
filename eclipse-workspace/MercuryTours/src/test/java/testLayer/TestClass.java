package testLayer;

import java.io.IOException;

import baseLayer.BaseClass;
import pageLayer.Register;
import utilsLayer.TakeScreenshot;

public class TestClass extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		BaseClass.initialize();
			Register.contactinfo();
			Register.country("INDIA");
		String s=Register.getc();
		
		System.out.println(s);
		Thread.sleep(5000);
		TakeScreenshot.screenshot();
		Register.submit();
		
		}
	}


