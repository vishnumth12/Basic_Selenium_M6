package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Assertions {

	@Test
	public void assertions() {
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
		String title = driver.getTitle();
		////using Hard Assert
		//Assert.assertEquals(title, "asdfg");
		////using Soft Assert
		SoftAssert s = new SoftAssert();
		s.assertEquals(title, "qweret");
		System.out.println(driver.getCurrentUrl());
	}
}
