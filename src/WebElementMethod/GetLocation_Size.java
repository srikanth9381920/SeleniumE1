package WebElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_Size {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement seleniumIDE =driver.findElement(By.cssSelector("svg#selenium_ide"));
		 Point loc =seleniumIDE.getLocation();
		 System.out.println("Location: "+loc);
		 System.out.println("x_Coordinate: "+loc.getX());
		 System.out.println("Y_Coordinate: "+loc.getY());
		 
		 Dimension size=seleniumIDE.getSize();
		 System.out.println("Dimension: "+size);
		 System.out.println("Height: "+size.getHeight());
		 System.out.println("Width: "+size.getWidth());
		 
		 driver.quit();
	}

}
