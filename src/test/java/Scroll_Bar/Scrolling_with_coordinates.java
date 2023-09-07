package Scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Scrolling_with_coordinates {
	
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
		WebElement careers = driver.findElement(By.xpath("//a[text()='Careers']"));
		
		Point coOrdinatesPoint = careers.getLocation();
		int x= coOrdinatesPoint.getX();
		int y= coOrdinatesPoint.getY();
		
		//downcast statement
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")"); 
		//wait for 3 sec
		Thread.sleep(3000);
		//js.executeScript("arguments[0].click();", careers);
		careers.click();
}
}
