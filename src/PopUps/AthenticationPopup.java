package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AthenticationPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String message = driver.findElement(By.xpath("//p")).getText();
				System.out.println(message);
		driver.quit();
		
		

	}

}
