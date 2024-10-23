package WebElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 WebElement male =driver.findElement(By.xpath("//input[@value=\"2\"]"));
		 if(male.isSelected())
			 System.out.println("Selected");
		 else {
			 System.out.println("not selected");
		 }
		 driver.quit();
		 
	}
}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 

	


