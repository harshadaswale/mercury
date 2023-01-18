package baseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	protected static WebDriver driver;
	 public static void initialize() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\OneDrive\\Desktop\\Softech Class notes\\Automation Testing\\SELENIUM\\Chrome driver setup\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 
		 
	 }
	

}
