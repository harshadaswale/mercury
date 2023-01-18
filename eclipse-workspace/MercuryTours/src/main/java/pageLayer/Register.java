package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;
import utilsLayer.HandelDropdown;

public class Register extends BaseClass {
	public static void contactinfo() throws InterruptedException {
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("priya");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("warier");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("9874563210");
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("priya@gmail.com");
		driver.findElement(By.xpath("(//input)[6]")).sendKeys("mumbai,maharashtra");
		driver.findElement(By.xpath("(//input)[7]")).sendKeys("mumbai");
		driver.findElement(By.xpath("(//input)[8]")).sendKeys("maharastra");
		driver.findElement(By.xpath("(//input)[9]")).sendKeys("411020");
		
		
		driver.findElement(By.xpath("(//input)[10]")).sendKeys("priya123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input)[11]")).sendKeys("priya@123");
		driver.findElement(By.xpath("(//input)[12]")).sendKeys("priya@123");
		
		
	}
	public static void country(String s) {
		WebElement wb=driver.findElement(By.xpath("//select"));
		HandelDropdown.selectcountry(wb, s);
		
	}
	
	public static String getc() {
		WebElement wb=driver.findElement(By.xpath("//select"));
		return HandelDropdown.getcountry(wb);
		
	}
	
	public static void submit() {
		driver.findElement(By.xpath("(//input)[13]")).click();
	}
	
	
	
	
	
	

}
