package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributeAndText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("srikanthmaloth@11");
		driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("@123");
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		
		Thread.sleep(8000);
		driver.quit();
		
		
	}

	
	}


