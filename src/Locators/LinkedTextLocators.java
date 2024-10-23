package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextLocators {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.linkText("Forgotten password")).click();
	driver.findElement(By.id("identify_email")).sendKeys("srikanthmaloth721@gmail.com");
	driver.findElement(By.name("did_submit")).click();
	
	Thread.sleep(10000);
	driver.quit();
	

	}

}
