package TestNg_Fail;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	@Test
	public void amazon() {
		/// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get(); enters the url into the browser which is already open
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox ")).sendKeys("asdff");
}
}
