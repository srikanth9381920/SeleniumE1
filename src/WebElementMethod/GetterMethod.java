package WebElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetterMethod {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://github.com/");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.findElement(By.xpath("//span[text()='Search or jump to...']")).click();
 WebElement searchTF = driver.findElement(By.id("query-builder-test"));
 searchTF.sendKeys("api repo"+Keys.ENTER);
 
 driver.findElement(By.xpath("//span[text()='Search or jump to...']")).click();
 searchTF.clear();
 searchTF.sendKeys(Keys.ENTER);
  WebElement advSearch =driver.findElement(By.linkText("advanced search"));
  System.out.println(advSearch.getTagName());
  System.out.println(advSearch.getText());
  System.out.println(advSearch.getAttribute("href"));
  
  driver.quit();

 
 
		

	}

}
