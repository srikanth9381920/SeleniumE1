package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbygroupedindex {

	public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.linkedin.com/home");
	Thread.sleep(2000);
	driver.findElement(By.xpath("  (   //a[contains(text(),' Marketing')] )   [2]      ")).click();
	Thread.sleep(2000);
	driver.quit();
	
	

	}

}
