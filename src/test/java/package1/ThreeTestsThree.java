package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThreeTestsThree {
	
	@Test
	public void ThreeTestsmethod()
	{
		System.out.println("ThreeTestsmethod");
		
		/*
		 * WebDriver driver = new ChromeDriver(); driver.get("https://www.amazon.com/");
		 * Reporter.log("Page title:"+driver.getTitle());
		 */
		 
		Reporter.log("Page title:");
	}

}
