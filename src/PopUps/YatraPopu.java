package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraPopu {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("BE_flight_origin_date")).click();
		driver.findElement(By.id("12/10/2024")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
