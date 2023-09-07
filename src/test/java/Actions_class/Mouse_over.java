package Actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_over {
	
	//to freeze screen go to source and click F8 or Fn + F8 or javascript function //setTimeout(function() {debugger;}, 3000); and click Enter SCREEN WILL BE FREEZED AFTER 3 SEC

	public static void main(String[] args) throws Throwable {
		
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get(); enters the google search url into the browser which is already open
		driver.get("https://demoapp.skillrary.com/");
		//address of course webelement
		WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));
		//wait for 3 sec
		Thread.sleep(3000);
		//create and object for Actions class
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		//wait for 3 sec
		Thread.sleep(3000);
		//address of Selenium training
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
	}

}
