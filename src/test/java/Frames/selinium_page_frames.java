package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selinium_page_frames {
	public static void main(String[] args) throws Throwable {
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//for opening the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the brower
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//get(); enters the google search url into the browser which is already open
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html");

		//wait for 3 sec
		Thread.sleep(3000);
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("(//a[@target='packageFrame'])[2]")).click();
		//wait for 3 sec
		Thread.sleep(3000);
		//shifting control to normal web page
		driver.switchTo().defaultContent();
		
		//wait for 3 sec
		Thread.sleep(3000);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		//wait for 3 sec
		Thread.sleep(3000);
		//shifting control to normal web page
		driver.switchTo().defaultContent();
		
		//wait for 3 sec
		Thread.sleep(3000);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("(//a[text()='Help'])[1]")).click();
}
}
