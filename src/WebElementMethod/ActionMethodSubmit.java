package WebElementMethod;
  import java.time.Duration;
  import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
  public class ActionMethodSubmit {
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("handbags");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		Thread.sleep(3000);
		driver.quit();

	}

}
