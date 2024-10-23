package JavaScriptExecutorinterface;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFetchTitleRefresh {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://www.swiggy.com/");
		
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.url"));
		
		Thread.sleep(3000);
		js.executeScript("history.go(0)");
		
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
