package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//instance
		WebElement allDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(allDropdown);
		if(select.isMultiple())
			System.out.println("multi select");
		else
			System.out.println("single select\n\n");
		List<WebElement> options = select.getOptions();
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		select.selectByIndex(11);
		Thread.sleep(3000);
		select.selectByValue("search-alias=todays-deals");
		Thread.sleep(3000);
		select.selectByVisibleText("Furniture");
		Thread.sleep(3000);
		driver.quit();
		
		}
		

	}


