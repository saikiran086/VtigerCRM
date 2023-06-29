package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	 public static WebDriver driver;
	 public static WebDriverWait wait;
	 
	 
	 
	  @BeforeMethod
	  public void openBrowser()
	  {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://localhost:8888/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		  System.out.println("my am from github modified by team leader");
	  }
	  
	  
	  @AfterMethod
	  public void closeSite() 
	  {
		// driver.quit();
	  }
}
