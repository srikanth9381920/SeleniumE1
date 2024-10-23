package WebElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabledmethodvalidation {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement loginBTN =driver.findElement(By.xpath("//button[@type='submit']"));
		 if(loginBTN.isEnabled()){
		 System.out.println("Enabled");
	     loginBTN.click();
		 }
		 else
	     System.out.println("Disabled");
		 
		 driver.findElement(By.name("username")).sendKeys("Srikanth");
		 driver.findElement(By.name("password")).sendKeys("123456@");
		 if(loginBTN.isEnabled()){
			 System.out.println("Enabled");
			 loginBTN.click();
		 }
		 else
			 System.out.println("Disabled");
		 driver.quit();
		 
			 
		 }
		

	}


