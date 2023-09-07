package Scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// chrome has some issues use firefox for click() to work also for some elements not responding use refresh() function after loading the web page
public class Scrolling_without_coordinates {

	public static void main(String[] args) throws Throwable {
		// driver related statement
		WebDriverManager.firefoxdriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new FirefoxDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get(); enters the google search url into the browser which is already open
		driver.get("http://www.amazon.in/");
		//wait for 3 sec
		Thread.sleep(3000);
		//address of career
		WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
		//downcast statement
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", career);
		Thread.sleep(5000);
		//js.executeScript("arguments[0].click();", career);
		career.click();

	}

}
