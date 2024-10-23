package WebElementMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshotAS {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.zomato.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		 
		 WebElement zomato =driver.findElement(By.xpath("//div[@class='sc-iIHjhz lgGAoQ']"));
		 
		 File temp =zomato.getScreenshotAs(OutputType.FILE);
		 File target =new File("./Screenshots.png");
		 FileHandler.copy(temp, target);
		 
		 driver.quit();
		 

	}

}
