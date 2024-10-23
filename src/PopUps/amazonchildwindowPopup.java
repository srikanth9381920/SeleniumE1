package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonchildwindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("twotabsearchtextbox")).sendKeys("tv 65+ inch");
		driver.findElement(By.className("nav-search-submit-button")).click();
		
		driver.findElement(By.linkText("Sony Bravia 164 cm (65 inches) 4K Ultra HD Smart LED Google TV KD-65X74L (Black)")).getText();
		String parentId = driver.getWindowHandle();
		Set<String> windowIds = driver.getWindowHandles();
						for(String str : windowIds) {
			driver.switchTo().window(str);
			if(driver.getTitle().contains("Sony"))
				break;
		}
			String TvName =driver.findElement(By.xpath("productTitle")).getText();;
			String ratings = driver.findElement(By.cssSelector("")).getText();
			String price =driver.findElement(By.cssSelector("div#apex_desktop")).getText();
				
			System.out.println(TvName+"\n"+ratings+"\n"+price);
			driver.close();
				
	
	driver.switchTo().window(parentId);
	driver.findElement(By.xpath("//span[text()='Sony']")).click();
	Thread.sleep(3000);
	driver.quit();

	}

}
