package crossBrowsertesting;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IE_browser {
	
	 WebDriver driver;
	 @BeforeTest

	 public void openBrowser(){
	 	
		 System.setProperty("webdriver.ie.driver", "C:\\Users\\Satish G\\eclipse-workspace\\IE_driver\\IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
	 	 driver.get("https://www.google.com/");
		 //driver.get("https://www.moviepass.com/");
	 }
	 @Test

	 public void titleVerification() {
	 	String expectedTitle="MoviePass | Watch New Movies in Theaters";
	 	String actualTitle= driver.getTitle();
	 	Assert.assertEquals(actualTitle, expectedTitle);
	 }

	 @AfterTest

	 public void closeBrowser() {
	 	driver.close();
	 }
	
	
	
}

