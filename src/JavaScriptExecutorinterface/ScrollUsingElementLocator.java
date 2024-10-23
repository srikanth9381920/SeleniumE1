package JavaScriptExecutorinterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingElementLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement seller = driver.findElement(By.xpath("//span[text()='Best Sellers in Clothing & Accessories']"));
		Point location = seller.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
