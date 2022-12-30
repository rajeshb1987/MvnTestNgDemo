package package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TwoTestTwo {
	
	@Test
	public void TwoTestmethod() throws IOException
	{
		System.out.println("##### START - AFTER JENKINS-GITHUB integration #############");
		System.out.println("TwoTestmethod");
		
		
		  Properties prop = new Properties(); FileInputStream fis = new
		  FileInputStream(System.getProperty("user.dir")+"//src//test//java//resources//GlobalData.properties");
		  prop.load(fis);
		  WebDriver driver=null;
		
		
		  String browserName = System.getProperty("browser")!=null?System.getProperty("browser"):prop.getProperty("browser");
		  System.out.println("BROWSER:"+browserName);
		  if(browserName.equalsIgnoreCase("chrome"))
		  {
			   driver = new ChromeDriver();
		  }
		  else if(browserName.equalsIgnoreCase("firefox"))
		  {
			   driver = new FirefoxDriver(); 
		  }
		  else if(browserName.equalsIgnoreCase("edge"))
		  {
			   driver = new EdgeDriver(); 
		  }
		  
		  
		  driver.get("https://www.amazon.com/");
		  System.out.println("title:"+driver.getTitle());
		  
		  System.out.println("Page URL:"+driver.getCurrentUrl());
		  System.out.println("HERE 111111111111222222222222222");
		  System.out.println("HERE 3333333333333333333333");
		  System.out.println("HERE 444444444444444444");
		  System.out.println("##### END  -  AFTER JENKINS-GITHUB integration #############");
		System.out.println("********** Changed in GIT HUB file *****************");
		 
	}

}
