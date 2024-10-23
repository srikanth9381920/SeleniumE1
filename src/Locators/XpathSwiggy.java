package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSwiggy {

	public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Search']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='_2FkHZ']")).sendKeys("biryani");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Restaurant']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Behrouz Biryani']")).click();
	Thread.sleep(2000);
		WebElement ratings=driver.findElement(By.xpath("//div[@class='sc-dJltXf hAIYP']"));
		System.out.println(ratings.getText());
driver.quit();
	}

}
