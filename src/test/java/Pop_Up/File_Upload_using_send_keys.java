package Pop_Up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_using_send_keys {

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
		driver.get("https://www.foundit.in/");
		//address of upload resume
		driver.findElement(By.xpath("//div[contains (text(),'Upload Resume')]")).click();
		driver.findElement(By.id("file-upload")).sendKeys("/home/vishnu/Documents/Selenium/PoP_Up notes (1).pdf");
		
		
}
}
