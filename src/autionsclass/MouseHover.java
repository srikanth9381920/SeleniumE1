package autionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	private static final WebElement LaptopDesktop = null;

	public static void main(String[] args) {
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
			Actions action = new Actions(driver);
			action.moveToElement(electronics).perform();
			 
			WebElement LaptopDesktop =driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
			action.moveToElement(LaptopDesktop).perform();
			
			driver.findElement(By.xpath("(//a[text()='Gaming Laptops'])[2]"));
			
			if(driver.getTitle().contains("Gaming Laptops"))
				System.out.println("pass");
			else
				System.out.println("failed");
			
			driver.quit();
			
	}

}
