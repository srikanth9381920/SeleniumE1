package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTraversingExmpl1 {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("goggles");
	driver.findElement(By.className("Pke_EE")).click();
	
	Thread.sleep(2000);
	String product=driver.findElement(By.xpath("//a[text()='UV Protection Wayfarer Sunglasses (52)']")).getText();
	String price=driver.findElement(By.xpath("//a[text()=\"UV Protection Wayfarer Sunglasses (52)\"]/parent::div/parent::svg/parent::a/parent::div/child::svg/child::a/child::div/child::div[@class=\"Nx9bqj\"]")).getText();
	System.out.println(product+price);
	

	}

}
