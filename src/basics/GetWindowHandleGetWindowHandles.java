package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleGetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.netflix.com/in/");
	
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://in.bookmyshow.com/");
	
	String parentAddress=driver.getWindowHandle();
	Set<String> addresses=driver.getWindowHandles();
	
	System.out.println("parent Address:"+parentAddress);
	System.out.println("**********************");
	
	for(String string:addresses) {
	System.out.println(string);

	}
driver.quit();
	}
}

