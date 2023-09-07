package Screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
		
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
			driver.get("http://www.amazon.in/");
			//wait for 3 sec
			Thread.sleep(3000);
			//downcasting
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Screenshots/amazon.png");
			//copying from src and pasting from destination
			FileUtils.copyFile(src, destFile);
			
}
}