package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DependeOnMethodsFlag {
	@Test
	public void registerToApp() {
		System.out.println("registration Test");
		
		Assert.fail();
	}
	@Test(dependsOnMethods = "registerToApp")
	public void ApplyToJob() {
		System.out.println("Apply Job Test");
	}

}
