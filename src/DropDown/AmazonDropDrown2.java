package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDrown2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement coursesDropdown = driver.findElement(By.id("cars"));
		Select select = new Select(coursesDropdown);
		select.selectByIndex(0);
		select.selectByValue("99");
		select.selectByVisibleText("INR 100 - INR 199 ( 16 )");

		if (select.isMultiple()) {
			System.out.println("firstselectedoption:" + select.getFirstSelectedOption().getText() + "\n");

			List<WebElement> selectedoptions = select.getAllSelectedOptions();
			System.out.println("selected options:");
			for (WebElement option : selectedoptions) {
				System.out.println(option.getText());
			}
			//select.deselectByIndex(0);
			//select.deselectByValue("99");
			//select.deselectByVisibleText("INR 100 - INR 199 ( 16 )");

			select.deselectAll();
		} else
			System.out.println("single select dropdown");

		driver.quit();

	}
}