package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Signinhhhhhsss")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("srikanthmaloth721@gmail.com");
		driver.findElement(By.cssSelector("input[value=\"Go\"]")).click();
		Thread.sleep(2000);
		driver.quit();
	
		
		
	}

}
