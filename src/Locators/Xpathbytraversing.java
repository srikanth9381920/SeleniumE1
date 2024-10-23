package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbytraversing {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Downloads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='C#']/..p/a[contains(@href,'nuget')]")).click();
	driver.quit();
	}

}
