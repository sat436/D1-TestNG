package crossBrowsertesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Different_Browsers {
	
	 WebDriver driver;
	 @BeforeTest

	 public void openBrowser(){
	 	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish G\\eclipse-workspace\\TestNG\\src\\crossBrowsertesting\\chromedriver.exe");
		 driver = new ChromeDriver();
	 	 driver.manage().window().maximize();
	 	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 	 driver.get("https://www.moviepass.com/");
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

