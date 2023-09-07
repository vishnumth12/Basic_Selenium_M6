package TestNg_Fail;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

		@Test
		public void facebook() {
			/// driver related statement
			WebDriverManager.chromedriver().setup();
			//for opening the Chrome browser
			WebDriver driver= new ChromeDriver();
			//Maximize the browser
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//get(); enters the url into the browser which is already open
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("asdff");
	}
	}
