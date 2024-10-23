package Annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
WebDriver driver;
@BeforeSuite
public void suiteconfig() {
	System.out.println("Suite execution started");
}
@BeforeTest
public void testconfig() {
	System.out.println("Test Execution Started");
}
@BeforeClass
public void classconfig() {
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
@BeforeMethod
public void methodconfig() {
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.findElement(By.name("email")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.id("last")).click();
	
}
@AfterMethod
public void methodunset() {
	driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
	driver.findElement(By.xpath("//a[text()='Sign out']")).click();
}
@AfterClass
public void classunset() {
	driver.quit();
}
@AfterTest
public void testunset() {
	System.out.println("Test Execution Ended");
}
@AfterSuite
public void suiteunset() {
	System.out.println("Suite Execution Ended");
}
}
