package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityInocationCountEnabled {
@Test(priority=1,invocationCount=0)
public void demo1() {
	Reporter.log("demo1",true);
}
@Test(priority=0,enabled=false)
public void demo2() {
	Reporter.log("demo2",true);
}
	@Test(priority=2,invocationCount=3)

	public void demo3() {
		Reporter.log("demo3",true);
	}
		@Test
		public void demo4() {
		
		Reporter.log("demo4",true);
		}
}
