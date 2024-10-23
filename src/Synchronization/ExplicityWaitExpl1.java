package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitExpl1 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	WebElement header= driver.findElement(By.xpath("//h4[text()='Hello World!']"));
	
	WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	String text=Wait.until(ExpectedConditions.visibilityOf(header)).getText();
	System.out.println(text);
	driver.quit();
	
	

	}

}
