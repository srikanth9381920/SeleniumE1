package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorExample1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.className("ui-autocomplete-inputh")).sendKeys("shoes");
		driver.findElement(By.className("btn")).click();
		
		Thread.sleep(2000);
		driver.quit();
	

	}

}
