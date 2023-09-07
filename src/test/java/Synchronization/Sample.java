package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws Throwable {
		/// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//get(); enters the url into the browser which is already open
		driver.get("https://www.facebook.com/");
		//storing the element address in reference variable ele
		WebElement ele= driver.findElement(By.id("email"));
		//using explicit wait
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("hi");
		WebElement click= driver.findElement(By.linkText("Forgotten password?"));
		wait.until(ExpectedConditions.elementToBeClickable(click));
		click.click();
		Thread.sleep(4000);
		driver.quit();
	}
}
