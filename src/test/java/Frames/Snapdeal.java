package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws Throwable {
		// driver related statement
		WebDriverManager.firefoxdriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new FirefoxDriver();
		//Maximize the brower
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get(); enters the google search url into the browser which is already open
		driver.get("https://snapdeal.com/");
		//wait for 3 sec
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		//create and object for Actions class
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		//address of register
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
//		WebElement register = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
//		//downcast statement
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", register);
		//switching the control to frame		
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("1234567891");
		//wait for 3 sec
		Thread.sleep(3000);
		//click on cancel
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		//shifting control to normal web page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("asdfgh");
}
}
