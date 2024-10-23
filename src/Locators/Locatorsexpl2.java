package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsexpl2 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    
    driver.findElement(By.name("q")).sendKeys("mobiles");
    driver.findElement(By.className("_2iLD__")).click();
    
    List<WebElement> mobilesList=driver.findElements(By.className("zDPmFV"));
    for(int i=0; i<mobilesList.size();i++)    {
    	String name=mobilesList.get(i).getText();
    	System.out.println(name) ;
    	   	
    }
    for (WebElement mobiles:mobilesList) {
    	System.out.println(mobiles.getText());
    	
    }
    Thread.sleep(2000);
    driver.quit();
	}

}
