package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathNetflix {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.=\"Sign In\"]")).click();
		driver.findElement(By.xpath("//input[@data-uia=\"login-field\"]")).sendKeys("9381920906");
		driver.findElement(By.xpath("//input[@autocomplete=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("data-uia=\"login-toggle-button\"")).clear();
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
