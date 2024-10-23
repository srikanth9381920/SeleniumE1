package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Scenario;
//Open the browser;
//navigate to flipkart.com;
//fetch title and url of the web page;
//close the browser

public class GetGetTitileGetCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String title=driver.getTitle();
	String Url=driver.getCurrentUrl();
	System.out.println(title+"/n"+Url);
	driver.close();
	}

	
		
	}

