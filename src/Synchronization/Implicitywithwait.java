package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitywithwait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@class='_2FkHZ']")).sendKeys("biryani");
		driver.findElement(By.xpath("//div[text()='Restaurant']")).click();
		driver.findElement(By.xpath("//div[text()='Behrouz Biryani']")).click();
		WebElement ratings=driver.findElement(By.xpath("//div[@class=\"sc-eCzpMH omRnt\"]"));
		System.out.println(ratings.getText());
	driver.quit();
		

	}

}
