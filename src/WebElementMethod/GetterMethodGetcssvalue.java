package WebElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetterMethodGetcssvalue {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 WebElement header=driver.findElement(By.className("alert-selenium-blue"));
		 System.out.println(header.getCssValue("font"));
		 System.out.println(header.getCssValue("colour"));
		 System.out.println(header.getCssValue("background-colour"));
		 driver.quit();

		 
	}

}
