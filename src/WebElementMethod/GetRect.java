package WebElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement seleniumIDE =driver.findElement(By.cssSelector("svg#selenium_ide"));
		 Rectangle rect =seleniumIDE.getRect();
		 System.out.println("x_Coordinate: "+rect.getX());
		 System.out.println("Y_Coordinate: "+rect.getY());
		 System.out.println("Height: "+rect.getHeight());
		 System.out.println("Width: "+rect.getWidth());
		 
		 driver.quit();
	}

	}


