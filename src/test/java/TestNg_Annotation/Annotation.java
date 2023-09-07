package TestNg_Annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation {
	WebDriver driver;

	@BeforeMethod
	public void openingBrowser() {
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = -1, invocationCount = 2)
	public void fbBrowser() {
		driver.get("http://www.facebook.com/");	
}
	@Test
	public void amazonBrowser() {
		driver.get("http://www.amazon.in/");	
}
	@AfterMethod
	public void closing() {
		driver.close();
	}

}
