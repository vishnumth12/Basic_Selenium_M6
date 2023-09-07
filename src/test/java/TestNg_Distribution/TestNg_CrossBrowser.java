package TestNg_Distribution;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_CrossBrowser {
@Test
	public void crossBrowser(String browser) throws Throwable {
	WebDriver driver;
	if (browser.equals("chrome")) {
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		driver= new ChromeDriver();
	} else {
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		driver= new FirefoxDriver();
	}
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get(); enters the google search url into the browser which is already open
		driver.get("http://www.amazon.in/");
		Thread.sleep(2000);
		driver.close();
	}
}
