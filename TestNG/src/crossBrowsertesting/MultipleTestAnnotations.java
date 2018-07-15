package crossBrowsertesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTestAnnotations {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void openBrowser() {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
		
		@Test(priority=0)
		
	public void testTitle() {
			String expectedTitle="Facebook - Log In or Sign Up";
			String actualTitle= driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			
		}
		@Test(priority=2)
	public void verifyText1() {
			String expectedTitle="Connect with friends and the\nworld around you on Facebook.";
			String actualTitle= driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/h2")).getText();
			Assert.assertEquals(actualTitle, expectedTitle);
			
		}
		@Test(priority=1)
	public void verifyText2() {
			String expectedTitle="Sign Up";
			String actualTitle= driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/h2")).getText();
			Assert.assertEquals(actualTitle, expectedTitle);
		}
		@AfterTest

		 public void closeBrowser() {
		 	driver.close();
	}

}
