package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Programs {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//get(); enters the url into the browser which is already open
		driver.get("https://www.facebook.com/");
		//address of email text field
		WebElement ele= driver.findElement(By.id("email"));
		ele.sendKeys("Macintosh");
		Thread.sleep(4000);
		ele.clear();
		Thread.sleep(4000);
		driver.quit();
	}

}
