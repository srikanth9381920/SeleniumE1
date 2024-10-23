package autionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement courseTab = driver.findElement(By.id("course"));
		Actions action =new Actions(driver);
		action.moveToElement(courseTab).perform();
		
		driver.findElement(By.xpath("//span/a[text()='Selenium']")).click();
		
		WebElement quantity = driver.findElement(By.id("quantity"));
		int intialvalue = Integer.parseInt(quantity.getAttribute("value"));
		
		WebElement plusBTN = driver.findElement(By.id("add"));
		action.doubleClick(plusBTN).perform();
		int finalvalue = Integer.parseInt(quantity.getAttribute("value"));
		
		if(finalvalue ==(intialvalue+1))
		System.out.println("pass");
		else
			System.out.println("fail");
		driver.quit();
		
		

	}

}
