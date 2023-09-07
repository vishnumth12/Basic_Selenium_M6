package TestNg;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.DataProvider;

public class DataProvider_1 {
	
	@DataProvider
	public Object[][] getData() { 
		Object [][] a = new Object [3][2];
		a[0][0] = "adsdasd";
		a[0][1] = "qwewqe";
		
		a[1][0] = "adsgbvdasd";
		a[1][1] = "3432e3";
		
		a[2][0] = "sdfsdf";
		a[2][1] = "32454dfg";
		return a;
		}
	
	@Test(dataProvider = "getData")
	public void demo(String username, String pwd) {
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
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		driver.findElement(By.name("login")).click();
		driver.close();
	}
}
