package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("q")).sendKeys("goggles");
		driver.findElement(By.className("_2iLD__")).click();

		driver.findElement(By.linkText("UV Protection Over-sized Sunglasses (61)")).click();
		String parentId = driver.getWindowHandle();
		Set<String> windowIds = driver.getWindowHandles();
		for (String str : windowIds) {
			driver.switchTo().window(str);
			if (driver.getTitle().contains("Over-sized Sunglasses"))
				break;
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).getText();
		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(parentId);
		driver.navigate().refresh();

		WebElement cartIdNum = driver.findElement(By.className("ZuSA--"));
		System.out.println(cartIdNum.getText());

		driver.quit();
	}

}
