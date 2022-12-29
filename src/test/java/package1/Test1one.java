package package1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1one {
	
	
	@Test
	public void Test1method()
	{
		System.out.println("Test1method");
		Reporter.log("Page title Test1method:123");
	}

}
