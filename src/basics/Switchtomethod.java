package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtomethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.netflix.com/in/");
		
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://in.bookmyshow.com/");
	
	Thread.sleep(2000);
	driver.close();
	
	Thread.sleep(2000);
	driver.quit();
	
	}				

	}
