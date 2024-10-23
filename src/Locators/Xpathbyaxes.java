package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyaxes {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bollymoviereviewz.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//b[text()='Kalki 2898']/parent::a/parent::td/parent::tr/child::td[4]")).click();
Thread.sleep(2000);
driver.quit();
	}

}
