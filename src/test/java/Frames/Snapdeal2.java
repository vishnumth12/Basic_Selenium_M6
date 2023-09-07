package Frames;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal2 {
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
		driver.get("https://snapdeal.com/");
		//wait for 3 sec
		Thread.sleep(5000);
		driver.navigate().refresh();
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		//create and object for Actions class
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		//wait for 3 sec
		Thread.sleep(5000);
		//address of register
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		//switching the control to frame
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("1234567891");
		//wait for 3 sec
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		//shifting control to normal web page
		driver.switchTo().defaultContent();
}
}
