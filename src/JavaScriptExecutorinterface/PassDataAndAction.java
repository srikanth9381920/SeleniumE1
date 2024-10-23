package JavaScriptExecutorinterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassDataAndAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://www.amazon.in/");
		
		WebElement searchTF = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchBTN = driver.findElement(By.id("nav-search-submit-button"));
		
		js.executeScript("arguments[0].value=arguments[1]",searchTF ,"mobiles");
		js.executeScript("arguments[0].click()", searchBTN);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
